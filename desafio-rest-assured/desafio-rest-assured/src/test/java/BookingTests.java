import com.github.javafaker.Book;
import com.github.javafaker.Faker;
import dev.luana.Entities.Booking;
import dev.luana.Entities.User;
import dev.luana.Entities.BookingDates;
import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.config.LogConfig.logConfig;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

public class BookingTests {

    public static Faker faker;
    private static RequestSpecification request;
    private static Booking booking;
    private static BookingDates bookingDates;
    private static User user;

    @BeforeAll
    public static void Setup() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
        faker = new Faker();
        user = new User(faker.name().username(),
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().safeEmailAddress(),
                faker.internet().password(8,10),
                faker.phoneNumber().toString());

        bookingDates = new BookingDates("2022-03-04","2022-03-20");
        booking = new Booking(user.getFirstname(), user.getLastname(),
                (float)faker.number().randomDouble(2,50,100000),
                true,bookingDates,
                "");
        RestAssured.filters(new RequestLoggingFilter(),new ResponseLoggingFilter(), new ErrorLoggingFilter());


    }

    @BeforeEach
    void setRequest() {
        request = given().config(RestAssured.config().logConfig(logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
                .contentType(ContentType.JSON)
                .auth().basic("admin","password123");

    }

    @Test
    public void getAllBookingsById_returnOk(){
        Response response = request
                .when()
                .get("/booking")
                .then()
                .extract()
                .response();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200,response.statusCode());


    }

    @Test
    public void getAllBookingsByUserFirstName_BookingExists_ReturnOk(){
        request
                .when()
                .queryParam("firstName","Luana")
                .get("/booking")
                .then()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .and()
                .body("results",hasSize(greaterThan(0)));
    }

    @Test
    public void CreateBooking_WithValidData_returnOk() {
        Booking test = booking;
        given().config(RestAssured.config().logConfig(logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
                .contentType(ContentType.JSON)
                .when()
                .body(booking)
                .post("/booking")
                .then()
                .body(matchesJsonSchemaInClasspath("createBookingRequestSchema.json"))
                .and()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON).and().time(lessThan(4000L));
    }
    @Test
    public void UpdateBooking_WithValidData_returnOk() {
        given().config(RestAssured.config().logConfig(logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
                .header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .contentType(ContentType.JSON)
                .when()
                .body(booking)
                .put("/booking/98")
                .then()
                .and()
                .assertThat().statusCode(200)
                .and()
                .time(lessThan(4000L));
    }
    @Test
    public void UpdatePartialBooking_WithValidData_returnOk() {
        given().config(RestAssured.config().logConfig(logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
                .header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .when()
                .patch("/booking/463")
                .then()
                .assertThat().statusCode(200)
                .and()
                .contentType(ContentType.JSON).and().time(lessThan(4000L));


    }

    @Test
    public void DeleteBooking_WithValidDta_returnOk() {
        given().config(RestAssured.config().logConfig(logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
                .header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .when()
                .delete("/booking/5455")
                .then()
                .assertThat().statusCode(201)
                .and()
                .statusLine(containsString("Created"))
                .and()
                .time(lessThan(4000L));

    }
  @Test
    public void HealthCheck_ReturnOk() {
      given().config(RestAssured.config().logConfig(logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
              .when()
              .get("/ping")
              .then()
              .assertThat().statusCode(201)
              .and()
              .statusLine(containsString("Created"));

  }



}

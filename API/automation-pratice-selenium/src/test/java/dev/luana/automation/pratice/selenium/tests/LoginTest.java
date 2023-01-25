package dev.luana.automation.pratice.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {

  private WebDriver driver;

  @BeforeEach
  void setUp() throws Exception {
    System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://automationexercise.com/login");

  }

  @AfterEach
  void tearDown() throws Exception {
    // driver.quit();

  }

  @Test
  void test() {
    WebElement emailAddressElement = driver.findElement(By.cssSelector("[data-qa='login-email']"));
    emailAddressElement.sendKeys("camilajavadev123@gmail.com");

    WebElement passwordElement = driver.findElement(By.cssSelector("[data-qa='login-password']"));
    passwordElement.sendKeys("123456@Ca");

    WebElement submitBtnElement = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button"));
    submitBtnElement.click();

    WebElement tagLogin = driver.findElement(By.tagName("h2"));
    String textTagH2 = tagLogin.getText();

    Assertions.assertTrue(textTagH2.equals("Login to your account"));

  }

}

package dev.luana.automation.pratice.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.luana.automation.pratice.selenium.pages.LoginPage;

public class LoginPageTest {
  private LoginPage loginPage;
  private final String URL = "https://automationexercise.com/login";

  @BeforeEach
  void setUp() throws Exception {
    this.loginPage = new LoginPage();
    this.loginPage.visit(URL);
  }

  @AfterEach
  void tearDown() throws Exception {
    this.loginPage.quitWebDriver();

  }

  @Test
  void test() {
    this.loginPage.signin();

    Assertions.assertTrue(this.loginPage.getMyAccountMessege().equals("Login to your account"));

  }
}

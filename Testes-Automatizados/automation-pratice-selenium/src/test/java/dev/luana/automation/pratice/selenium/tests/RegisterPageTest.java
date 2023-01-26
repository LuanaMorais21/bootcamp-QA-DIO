package dev.luana.automation.pratice.selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.luana.automation.pratice.selenium.pages.RegisterPage;

class RegisterPageTest {
  private RegisterPage registerPage;
  private final String URL = "https://automationexercise.com/login";

  @BeforeEach
  void setUp() {
    this.registerPage = new RegisterPage();
    this.registerPage.visit(this.URL);

  }

  @AfterEach
  void tearDown() {
    // this.registerPage.quitWebDriver();

  }

  @Test
  void testName() {
    // when
    this.registerPage.insertEmailToRegister();

    // then
    String expected = "luanatesteqa1@gmail.com";
    String actual = this.registerPage.getEmailNewAccount();
    Assertions.assertEquals(expected, actual);

  }

  @Test
  void testRegistro() {
    // when
    this.registerPage.fillOutForm();

    // then
    String expected = "ACCOUNT CREATED!";
    String actual = this.registerPage.getWelcomeMessage();
    Assertions.assertEquals(expected, actual);

    String actualUrl = this.registerPage.getCurrentUrl();
    Assertions.assertFalse(this.URL.equals(actualUrl));

  }

}
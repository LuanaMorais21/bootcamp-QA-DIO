package dev.luana.automation.pratice.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import dev.luana.automation.pratice.selenium.pages.DressesPage;

public class DressesPageTest {

  private DressesPage dressesPage;
  private final String URL = "https://automationexercise.com/";

  @BeforeEach
  void setUp() throws Exception {
    this.dressesPage = new DressesPage();
    this.dressesPage.visit(this.URL);

  }

  @AfterEach
  void tearDown() throws Exception {
    // this.dressesPage.quitWebDriver();

  }

  @Test
  void test() {
    // when
    this.dressesPage.viewDressesPage();

    // then
    // Assertions.assertEquals("Women - Dress Products",
    // this.dressesPage.getTitlePage());
    // Assertions.assertFalse(this.URL.equals(dressesPage.getCurrentUrl()));

  }
}

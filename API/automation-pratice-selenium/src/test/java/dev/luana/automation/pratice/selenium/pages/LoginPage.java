package dev.luana.automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
  // Locators
  private By emailAddressLocator = By.cssSelector("[data-qa='login-email']");
  private By passwordLocator = By.cssSelector("[data-qa='login-password']");
  private By submitBtnLocator = By.xpath("/html/body/section/div/div/div[1]/div/form/button");
  private By tagMyAccountLocator = By.tagName("h2");

  public void signin() {
    if (super.isDisplayed(emailAddressLocator)) {
      super.type("camilajavadev123@gmail.com", emailAddressLocator);
      super.type("123456@Ca", passwordLocator);
      super.click(submitBtnLocator);
    } else {
      System.out.println("Email textbox was not present");
    }
  }

  public String getMyAccountMessege() {
    return super.getText(tagMyAccountLocator);
  }

}

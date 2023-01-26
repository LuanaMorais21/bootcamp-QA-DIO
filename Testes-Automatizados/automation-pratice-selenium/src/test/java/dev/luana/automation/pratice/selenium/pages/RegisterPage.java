package dev.luana.automation.pratice.selenium.pages;

import org.checkerframework.dataflow.qual.Pure;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {

  // locators
  private By nameSigninLocator = By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]");
  private By emailAddressLocator = By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]");
  private By submitBtnLocator = By.xpath("/html/body/section/div/div/div[3]/div/form/button");
  private By emailLocator = By.id("email");
  private By alertAdditionalInformationLocator = By.xpath("/html/body/section/div/div/div/div/form/p[4]/label/span");
  // informações pessoais locator
  private By gender1Locator = By.id("id_gender1");
  private By gender2Locator = By.id("id_gender2");
  private By nameLocator = By.id("name");
  private By passwordLocator = By.id("password");
  private By birthDayLocator = By.id("days");
  private By birthMonthLocator = By.id("months");
  private By birthYearLocator = By.id("years");
  private By newsletterLocator = By.id("newsletter");
  private By offersLocator = By.id("optin");
  // informações de endereço locator
  private By firstNameLocator = By.id("first_name");
  private By lastNameLocator = By.id("last_name");
  private By comapnyLocator = By.id("company");
  private By address1Locator = By.id("address1");
  private By address2locator = By.id("address2");
  private By countryLocator = By.id("country");
  private By stateLocator = By.id("state");
  private By cityLocator = By.id("city");
  private By zipcodeLocator = By.id("zipcode");
  private By mobileNumberLocator = By.id("mobile_number");
  // enviar infos locator
  private By createAccountBtnLocator = By.xpath("/html/body/section/div/div/div/div/form/button");
  private By welcomeMessageLocator = By.cssSelector("#form > div > div > div > h2 > b"); // Account Created!

  public void insertEmailToRegister() {
    if (super.isDisplayed(emailAddressLocator)) {
      type("Luana", nameSigninLocator);
      type("luanatesteqa1@gmail.com", emailAddressLocator);
      click(submitBtnLocator);
    } else {
      System.out.println("email textbox was not present");
    }

  }

  public String getEmailNewAccount() {
    super.waitVisibilityOfElementLocated(alertAdditionalInformationLocator);
    return super.getTextByAttribute(this.emailLocator, "value");
  }

  public void fillOutForm() {
    this.insertEmailToRegister();
    super.waitVisibilityOfElementLocated(alertAdditionalInformationLocator);
    if (isDisplayed(gender1Locator)) {
      super.click(gender2Locator);
      super.clear(nameLocator);
      super.type("Luana Testes", nameLocator);
      super.type("diauh4552@", passwordLocator);
      selectByValue(birthDayLocator, "21");
      selectByValue(birthMonthLocator, "11");
      selectByValue(birthYearLocator, "1992");
      click(newsletterLocator);
      click(offersLocator);
      type("Luana", firstNameLocator);
      type("Test QA", lastNameLocator);
      type("DIO Curso", comapnyLocator);
      type("Rua das maravilhas, 123", address1Locator);
      type("Avenida dos sonhadores", address2locator);
      selectByValue(countryLocator, "Canada");
      type("São Paulo", stateLocator);
      type("São Paulo", cityLocator);
      type("489465446", zipcodeLocator);
      type("(11)98567-65841", mobileNumberLocator);
      click(createAccountBtnLocator);
    } else {
      System.out.println("message was not found");
    }

  }

  public String getWelcomeMessage() {
    super.waitVisibilityOfElementLocated(welcomeMessageLocator);
    return super.getText(welcomeMessageLocator);
  }

}

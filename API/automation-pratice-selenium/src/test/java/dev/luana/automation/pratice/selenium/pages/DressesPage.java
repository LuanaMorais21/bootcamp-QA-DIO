package dev.luana.automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage {
  // locators

  private By menuWomenLocator = By.xpath("/html/body/section[2]/div/div/div[1]/div/div[1]/div[1]/div[1]/h4/a");
  private By submenuDressesLocator = By
      .xpath("/html/body/section[2]/div/div/div[1]/div/div[1]/div[1]/div[2]/div/ul/li[1]/a");
  private By titlePageDresslocator = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");

  public void viewDressesPage() {
    if (super.isDisplayed(menuWomenLocator)) {
      super.actionMoveToElementPerform(menuWomenLocator);
      super.actionMoveToElementClickPerform(submenuDressesLocator);
    } else {
      System.out.println("manu dresses was not found");
    }

  }

  public String getTitlePage() {
    return super.getText(titlePageDresslocator);
  }

}

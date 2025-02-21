package POMByUsingPageFactoryPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CricBuzzLoginPage 
{
      WebDriver driver;
      
      CricBuzzLoginPage(WebDriver driver)
      {
    	  this.driver = driver;
    	  PageFactory.initElements(driver, this);
      }
      
     // By usericonButton = By.cssSelector("span[class = 'cb-plus-ico cb-user-icon']");
     // By passwordField = By.id("cb-user-email-input");
      
      // Locating elements using @FindBy annotation
      @FindBy(css = "span[class='cb-plus-ico cb-user-icon']")
      WebElement usericonButton;

      @FindBy(id = "cb-user-email-input")
      WebElement passwordField;

      public void clickUserIcon()
      {
    	  usericonButton.click();
      }
      
      public void enterPassword(String password)
      {
    	  passwordField.sendKeys(password); 
      }
      
      public void loginToCB(String password)
      {
    	  clickUserIcon();
    	  enterPassword(password);
      }
}

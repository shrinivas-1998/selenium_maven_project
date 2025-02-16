package POMPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CricBuzzLoginTest 
{
      WebDriver driver;
      
      CricBuzzLoginTest(WebDriver driver)
      {
    	  this.driver = driver;
      }
      
      By usericonButton = By.cssSelector("span[class = 'cb-plus-ico cb-user-icon']");
      By passwordField = By.id("cb-user-email-input");
      
      
      public void clickUserIcon()
      {
    	  driver.findElement(usericonButton).click();
      }
      
      public void enterPassword(String password)
      {
    	  driver.findElement(passwordField).sendKeys(password); 
      }
      
      public void loginToCB(String password)
      {
    	  clickUserIcon();
    	  enterPassword(password);
      }
}

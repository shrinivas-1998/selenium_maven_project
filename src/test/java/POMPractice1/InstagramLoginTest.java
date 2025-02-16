package POMPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstagramLoginTest 
{
   WebDriver driver;
   
  public  InstagramLoginTest(WebDriver driver)
  {
	  this.driver = driver;
  }
  
	  By InstausernameField = By.xpath("//input[@aria-label='Phone number, username, or email']");
	  By InstapasswordField = By.xpath("//input[@aria-label='Password']");
	  By InstaloginButton = By.xpath("//div[text() = 'Log in']");
	  
	  
	  public void enterUsernameInsta(String usernameInsta)
	  {
		  driver.findElement(InstausernameField).sendKeys(usernameInsta);
	  }
	  
	  public void enterPasswordInsta(String passwordInsta)
	  {
		  driver.findElement(InstapasswordField).sendKeys(passwordInsta);
	  }
	  
	  public void clickLoginInsta()
	  {
		  driver.findElement(InstaloginButton).click();
	  }
	  
	  public void loginToInstgram(String usernameInsta, String passwordInsta)
	  {
		  enterUsernameInsta(usernameInsta);
		  enterPasswordInsta(passwordInsta);
		  clickLoginInsta();
	  }
	  
   
}

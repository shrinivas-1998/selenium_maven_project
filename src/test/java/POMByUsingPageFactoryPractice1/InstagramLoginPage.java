package POMByUsingPageFactoryPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLoginPage 
{
   WebDriver driver;
   
  public  InstagramLoginPage(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
	  //By InstausernameField = By.xpath("//input[@aria-label='Phone number, username, or email']");
	  //By InstapasswordField = By.xpath("//input[@aria-label='Password']");
	  //By InstaloginButton = By.xpath("//div[text() = 'Log in']");
	  
	  @FindBy(xpath = "//input[@aria-label='Phone number, username, or email']")
	  WebElement InstausernameField;
	  
	  @FindBy(xpath = "//input[@aria-label='Password']")
	  WebElement InstapasswordField;
	  
	  @FindBy(xpath = "//div[text() = 'Log in']")
	  WebElement InstaloginButton;
	  
	  public void enterUsernameInsta(String usernameInsta)
	  {
		  //driver.findElement(InstausernameField).sendKeys(usernameInsta);
		  InstausernameField.sendKeys(usernameInsta);
	  }
	  
	  public void enterPasswordInsta(String passwordInsta)
	  {
		  //driver.findElement(InstapasswordField).sendKeys(passwordInsta);
		  InstapasswordField.sendKeys(passwordInsta);
	  }
	  
	  public void clickLoginInsta()
	  {
		  //driver.findElement(InstaloginButton).click();
		  InstaloginButton.click();
	  }
	  
	  public void loginToInstgram(String usernameInsta, String passwordInsta)
	  {
		  enterUsernameInsta(usernameInsta);
		  enterPasswordInsta(passwordInsta);
		  clickLoginInsta();
	  }
	  
   
}

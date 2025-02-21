package POMByUsingPageFactoryPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage 
{
	WebDriver driver; 
	
	FaceBookLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 //By usernameField = By.cssSelector("#email");
	 //By passwordField = By.cssSelector("#pass");
	 //By fbloginButton = By.cssSelector("button[name = 'login']");
	 
	 @FindBy(css = "#email")
	 WebElement usernameField;
	 
	 @FindBy(css = "#pass")
	 WebElement passwordField;
	 
	 @FindBy(css = "button[name = 'login']")
	 WebElement fbloginButton;
	 
	 public void enterUsernmeFB(String usernameFB)
	 {
		 //driver.findElement(usernameField).sendKeys(usernameFB);
		 usernameField.sendKeys(usernameFB);
	 }
	 
	 public void enterPasswordFB(String passwordFB)
	 {
		 //driver.findElement(passwordField).sendKeys(passwordFB);
		 passwordField.sendKeys(passwordFB);
	 }
	 
	 public void clickLoginFB()
	 {
		 //driver.findElement(fbloginButton).click();
		 fbloginButton.click();
		 
	 }
	 
	 public void loginToFaceBook(String usernameFB, String passwordFB )
	 {
		 enterUsernmeFB(usernameFB);
		 enterPasswordFB(passwordFB);
		 clickLoginFB();
	 } 
}

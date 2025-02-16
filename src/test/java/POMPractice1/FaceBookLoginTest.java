package POMPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaceBookLoginTest 
{
	WebDriver driver; 
	
	FaceBookLoginTest(WebDriver driver)
	{
		this.driver = driver;
	}
	
	 By usernameField = By.cssSelector("#email");
	 By passwordField = By.cssSelector("#pass");
	 By fbloginButton = By.cssSelector("button[name = 'login']");
	 
	 
	 public void enterUsernmeFB(String usernameFB)
	 {
		 driver.findElement(usernameField).sendKeys(usernameFB);
	 }
	 
	 public void enterPasswordFB(String passwordFB)
	 {
		 driver.findElement(passwordField).sendKeys(passwordFB);
	 }
	 
	 public void clickLoginFB()
	 {
		 driver.findElement(fbloginButton).click();
	 }
	 
	 public void loginToFaceBook(String usernameFB, String passwordFB )
	 {
		 enterUsernmeFB(usernameFB);
		 enterPasswordFB(passwordFB);
		 clickLoginFB();
	 } 
}

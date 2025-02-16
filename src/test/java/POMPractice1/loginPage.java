package POMPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage 
{
	WebDriver driver;

	// Locators
	By usernameField = By.name("username");
	By passwordField = By.name("password");
	By loginButton = By.xpath("//button[@type='submit']");

	// Constructor
	public loginPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	// actions
	public void enterUsername(String username) 
	{
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) 
	{
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLogin() 
	{
		driver.findElement(loginButton).click();
	}

	public void loginToOrangeHRM(String username, String password) 
	{
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}
}

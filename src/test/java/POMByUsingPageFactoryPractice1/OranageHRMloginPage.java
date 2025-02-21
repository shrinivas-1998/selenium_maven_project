package POMByUsingPageFactoryPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OranageHRMloginPage 
{
	WebDriver driver;

	// Constructor
	public OranageHRMloginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	// By usernameField = By.name("username");
	// By passwordField = By.name("password");
	// By loginButton = By.xpath("//button[@type='submit']");

	@FindBy(name = "username")
	WebElement usernameField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	// actions
	public void enterUsername(String username) 
	{
		// driver.findElement(usernameField).sendKeys(username);
		usernameField.sendKeys(username);
	}

	public void enterPassword(String password) 
	{
		// driver.findElement(passwordField).sendKeys(password);
		passwordField.sendKeys(password);
	}

	public void clickLogin() 
	{
		// driver.findElement(loginButton).click();
		loginButton.click();
	}

	public void loginToOrangeHRM(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}
}

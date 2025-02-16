package POMPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage 
{
	WebDriver driver;

	// Locators
	By dashboardHeader = By.tagName("h6");

	// Constructor
	public DashboardPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	// Validation method
	public boolean isDashBoardDisplayed() 
	{
		return driver.findElement(dashboardHeader).isDisplayed();
	}
}

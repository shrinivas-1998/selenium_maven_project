package POMByUsingPageFactoryPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage 
{
	WebDriver driver;

	public DashboardPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	// By dashboardHeader = By.tagName("h6");

	@FindBy(tagName = "h6")
	WebElement dashboardHeader;

	// Validation method
	public boolean isDashBoardDisplayed() 
	{
		// return driver.findElement(dashboardHeader).isDisplayed();
		return dashboardHeader.isDisplayed();
	}
}

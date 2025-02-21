package POMByUsingPageFactoryPractice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMLoginTest 
{
	WebDriver driver;
	OranageHRMloginPage loginPage;
	DashboardPage dashboardPage;

	@BeforeTest
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Initialize Page Objects
		loginPage = new OranageHRMloginPage(driver);
		dashboardPage = new DashboardPage(driver);
	}

	@Test
	public void verifyLoginFunctionality() 
	{
		loginPage.loginToOrangeHRM("Admin", "admin123");

		// Validate successful login
		Assert.assertTrue(dashboardPage.isDashBoardDisplayed(), "Dashboard is not displayed!");

	}

	@AfterTest
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
}

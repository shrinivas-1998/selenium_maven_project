package POMWithoutUsingPageFactoryPractice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CricBuzzLoginTest 
{
	WebDriver driver;
	CricBuzzLoginPage cbloginPage;

	@BeforeTest
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cricbuzz.com/");

		// Initialize Page Objects
		cbloginPage = new CricBuzzLoginPage(driver);
	}

	@Test
	public void CricbuzzLoginTest()
	{
		cbloginPage.loginToCB("shrinivasBodhale123@gmail.com");

	}

	@AfterTest
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
}

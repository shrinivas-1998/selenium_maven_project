package POMWithoutUsingPageFactoryPractice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InstagramLoginTest 
{
	WebDriver driver;
	InstagramLoginPage instaLoginPage;

	@BeforeTest
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");

		instaLoginPage = new InstagramLoginPage(driver);
	}

	@Test
	public void instagram1LoginTest() 
	{
		instaLoginPage.loginToInstgram("sb123@gmail.com", "sd@12345");
	}

	@AfterTest
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.quit();
	}
}

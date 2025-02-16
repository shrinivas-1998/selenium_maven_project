package testNGFrameworkPractice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	WebDriver driver;

	@BeforeTest
	public void setUp() 
	{
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterTest
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
}

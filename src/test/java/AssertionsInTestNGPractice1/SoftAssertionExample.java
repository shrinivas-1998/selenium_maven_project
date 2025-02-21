package AssertionsInTestNGPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample 
{
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert(); // Create SoftAssert object

	@BeforeTest
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void testLogin() 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();

		// **Soft Assertions**
		//String expectedTitle = "OrangeHRM";
		String expectedTitle = "OrangeHRM123";
		String actualTitle = driver.getTitle();
		softAssert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");

		WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		softAssert.assertTrue(dashboard.isDisplayed(), "Dashboard is not displayed!");

		// **Important: Always call assertAll() at the end**
		softAssert.assertAll();
	}

	@AfterTest
	public void tearDown() 
	{
		driver.quit();
	}
}

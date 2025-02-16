package testNGFrameworkPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMLoginTest extends BaseTest
{

	@Test()
	public void loginTest() throws InterruptedException 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();

		// Assertion 1: Verify the page title
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match after login");

		// Assertion 2: Verify dashboard is displayed after login
		WebElement dashboardElement = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		Assert.assertTrue(dashboardElement.isDisplayed(), "Dashboard is not displayed after login");
	}
}

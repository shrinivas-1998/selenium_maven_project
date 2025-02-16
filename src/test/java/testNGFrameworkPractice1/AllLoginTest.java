package testNGFrameworkPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllLoginTest extends BaseTest 
{
	@Test(priority = 1)
	public void cbloginTest() throws InterruptedException 
	{
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.cssSelector("span[class = 'cb-plus-ico cb-user-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("cb-user-email-input")).sendKeys("sb123@gmail.com");
	}

	@Test(priority = 2)
	public void FBLoginTest() throws InterruptedException 
	{
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.cssSelector("#email")).sendKeys("sb12345@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("sb@12321234");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[name = 'login']")).click();
		Thread.sleep(3000);
	}

	@Test(enabled = true)
	public void instaLoginTest() throws InterruptedException 
	{
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"))
				.sendKeys("sb1234@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("sb@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text() = 'Log in']"));
	}

	@Test(dependsOnMethods = { "instaLoginTest" })
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

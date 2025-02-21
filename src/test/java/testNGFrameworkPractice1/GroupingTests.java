package testNGFrameworkPractice1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingTests extends BaseTest 
{
	@Test(groups = { "sanity" })
	public void testCricbuzzLogin() throws InterruptedException 
	{
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.cssSelector("span[class = 'cb-plus-ico cb-user-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cb-user-email-input")).sendKeys("user123@gmail.com");
		System.out.println("Cricbuzz login test executed.");
	}

	@Test(groups = { "sanity" })
	public void testFacebookLogin() throws InterruptedException 
	{
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.cssSelector("#email")).sendKeys("user12345@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("password123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name = 'login']")).click();
		Thread.sleep(2000);
		System.out.println("Facebook login test executed.");
	}

	@Test(groups = { "regression" })
	public void testInstagramLogin() throws InterruptedException 
	{
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"))
				.sendKeys("user1234@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password123");
		Thread.sleep(2000);
		System.out.println("Instagram login test executed.");
	}

	@Test(groups = { "sanity", "regression" })
	public void testOrangeHRMLogin() throws InterruptedException 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();

		// Assertion: Verify login success
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");

		System.out.println("OrangeHRM login test executed.");
	}
}

package WaitsInSelenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[contains(@name, 'username')]")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[text() = 'Admin']")).click();
		
		Thread.sleep(4000);
		driver.quit();	
	}
}

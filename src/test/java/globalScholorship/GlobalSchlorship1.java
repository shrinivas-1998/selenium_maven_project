package globalScholorship;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GlobalSchlorship1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://theglobalscholarship.org/scholarships/lic-golden-jubilee-scholarship-2024?source=main");
		
		WebElement description =driver.findElement(By.xpath("//div[@class = 'desc']"));
		System.out.println(description.getText());
		Assert.assertTrue(true);
		System.out.println("test case is pass");
		
		Thread.sleep(5000);
		driver.quit();
	}
}

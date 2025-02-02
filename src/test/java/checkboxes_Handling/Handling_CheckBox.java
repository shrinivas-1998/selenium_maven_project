package checkboxes_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handling_CheckBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id ='sunday']")).click();
		
		Thread.sleep(5000);

		driver.quit();
	}
}

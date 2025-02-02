package date_Pickers_Handling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Pickers_Handling_Using_SendKeys 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		Thread.sleep(5000);
		
		// switch to frame 
		
		driver.switchTo().frame(0);
		
		// by using sendkeys method
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id ='datepicker']")).sendKeys("09/05/2024"); // dd/mm/yyyy
		
		Thread.sleep(5000);

		driver.quit();
	}
}

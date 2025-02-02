package pop_up_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notification_PopUp_Handling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(5000);
		
		Alert a1 =driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		a1.accept();
		
		Thread.sleep(5000);
		
	    a1.dismiss();
		
		Thread.sleep(5000);

		driver.quit();
	}
}

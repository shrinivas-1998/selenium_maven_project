package methods_of_webdriver_interface;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Method 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
			
		  Thread.sleep(5000);
		 
		  driver.manage().window().maximize();
		 
		  Thread.sleep(5000);
		  driver.navigate().to("https://www.google.com/");
		 
		  Thread.sleep(5000);
		 
		  driver.switchTo().activeElement().sendKeys("javatpoint", Keys.ENTER);
		 
		  Thread.sleep(5000);
		 
		  driver.navigate().back();
		 
		  Thread.sleep(5000);
		 
		  driver.navigate().forward();
		 
		  Thread.sleep(5000);
		  driver.navigate().refresh();
		 
		  Thread.sleep(5000);
		  driver.quit();


	}

}

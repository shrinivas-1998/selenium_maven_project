package browsers_options_classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_SSL 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		   ChromeOptions options = new ChromeOptions();
		   options.setAcceptInsecureCerts(true);   // accept SSL certificate 
		
		   WebDriver driver = new ChromeDriver(options);
	      
	       driver.manage().window().maximize();
	      
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      
	       driver.get("https://expired.badssl.com");
	       
		   Thread.sleep(5000);
		   
		   String title = driver.getTitle();
		
		   System.out.println(title);
		   
		   Thread.sleep(5000);
           driver.quit();
	}
}

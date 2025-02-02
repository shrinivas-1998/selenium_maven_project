package taking_Screenshots_by_different_ways;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_of_specific_WebElement 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		    WebDriver driver = new ChromeDriver();
	      
	      //  ChromeDriver driver = new ChromeDriver();
	       
	        driver.manage().window().maximize();
	       
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	       
	        driver.get("https://www.selenium.dev/");
	      
	        Thread.sleep(5000);
	      
	        // capturing the screenshot of specific web element
	       
	        WebElement selenium_ide = driver.findElement(By.xpath("(//div[@class  = 'card-body'])[2]"));
	       
	        File source_file2 = selenium_ide.getScreenshotAs(OutputType.FILE);
	       
	        File target_file2 = new File(System.getProperty("user.dir")+ "\\\\screenshots_Folder\\\\selenium_ide.png");
	            
	        source_file2.renameTo(target_file2);
	       
	        Thread.sleep(5000);
	
	        driver.quit();  // Close the browser after the screenshot is taken


	}

}

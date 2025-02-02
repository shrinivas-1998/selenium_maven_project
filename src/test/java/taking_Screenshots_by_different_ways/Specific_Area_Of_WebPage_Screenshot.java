package taking_Screenshots_by_different_ways;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specific_Area_Of_WebPage_Screenshot 
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
	        
	        // capturing the screenshot of specific section 
	        
	        WebElement getting_started_section = driver.findElement(By.xpath("//section[@class ='row td-box td-box--100 td-box--gradient td-box--height-auto pt-3']"));
	        
	        File source_file1  = getting_started_section.getScreenshotAs(OutputType.FILE);
	        
	        File target_file2 = new File(System.getProperty("user.dir") + "\\screenshots_Folder\\getting_started_section.png");
	        
	        source_file1.renameTo(target_file2);
	        
	        Thread.sleep(5000);
	 
	        driver.quit();  // Close the browser after the screenshot is taken


	}

}

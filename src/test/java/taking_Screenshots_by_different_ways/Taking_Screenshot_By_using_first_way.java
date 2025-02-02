package taking_Screenshots_by_different_ways;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Taking_Screenshot_By_using_first_way 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	      
	     //  ChromeDriver driver = new ChromeDriver();
	      
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      
	       driver.get("https://www.w3schools.com/");
	     
	       Thread.sleep(5000);
	      
	       // 1) Capturing full page screenshot
	       TakesScreenshot ts = (TakesScreenshot) driver; // for WebDriver driver = new ChromeDriver();
	      
	      // TakesScreenshot ts = driver; // for ChromeDriver driver = new ChromeDriver();
	      
	       File source_file = ts.getScreenshotAs(OutputType.FILE);
	      
	       // Create target file path
	       File target_file = new File(System.getProperty("user.dir") + "\\screenshots_Folder\\w3schools_fullpage.png");
	      
	       Thread.sleep(5000);
	       // Copy source_file to target_file
	       Files.copy(source_file, target_file);
	      
	      // source_file.renameTo(source_file); // copy source_file to target_file
	      
	       Thread.sleep(5000);
	       driver.quit();  // Close the browser after the screenshot is taken
	}
}

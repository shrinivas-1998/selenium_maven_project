package taking_Screenshots_by_different_ways;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_of_fullpage_specificwebpage_specific_webelement 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		    WebDriver driver = new ChromeDriver();
	      
	      //  ChromeDriver driver = new ChromeDriver();
	       
	        driver.manage().window().maximize();
	       
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	       
	        driver.get("https://www.selenium.dev/");
	      
	        Thread.sleep(5000);
	       
	        // 1) Capturing full page screenshot
	       TakesScreenshot ts = (TakesScreenshot) driver; // for WebDriver driver = new ChromeDriver();
	       
	       // TakesScreenshot ts = driver; // for ChromeDriver driver = new ChromeDriver();
	       
	        File source_file = ts.getScreenshotAs(OutputType.FILE);
	       
	        // Create target file path
	        File target_file = new File(System.getProperty("user.dir") + "\\screenshots_Folder\\selenium_fullpage.png");
	       
	        Thread.sleep(5000);
	        // Copy source_file to target_file
	        Files.copy(source_file, target_file);
	       
	        source_file.renameTo(source_file);  // copy source_file to target_file
	       
	       
	        //2) capturing the screenshot of specific section
	       
	        WebElement getting_started_section = driver.findElement(By.xpath("//section[@class ='row td-box td-box--100 td-box--gradient td-box--height-auto pt-3']"));
	       
	        File source_file1  = getting_started_section.getScreenshotAs(OutputType.FILE);
	       
	        File target_file1 = new File(System.getProperty("user.dir") + "\\screenshots_Folder\\getting_started_section.png");
	       
	        source_file1.renameTo(target_file1);
	       
	        // 3) capturing the screenshot of specific web element
	       
	        WebElement selenium_ide = driver.findElement(By.xpath("(//div[@class  = 'card-body'])[2]"));
	       
	        File source_file2 = selenium_ide.getScreenshotAs(OutputType.FILE);
	       
	        File target_file2 = new File(System.getProperty("user.dir")+ "\\\\screenshots_Folder\\\\selenium_ide.png");
	            
	        source_file2.renameTo(target_file2);
	       
	        Thread.sleep(5000);
	
	        driver.quit();  // Close the browser after the screenshot is taken


	}

}

package taking_Screenshots_by_different_ways;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshot_By_Using_Third_way 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	      
	      //  ChromeDriver driver = new ChromeDriver();
	       
	        driver.manage().window().maximize();
	       
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	       
	        driver.get("https://www.amazon.in/");
	      
	        Thread.sleep(5000);
	       
	        RemoteWebDriver rw = (RemoteWebDriver) driver;
	       
	        File source = rw.getScreenshotAs(OutputType.FILE);
	        File destination = new File(System.getProperty("user.dir") + "\\screenshots_Folder\\amazon_fullpage.png");
	        Files.copy(source, destination);
	       
	        Thread.sleep(5000);
	       
	        driver.quit();


	}

}

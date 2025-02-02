package taking_Screenshots_by_different_ways;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_By_using_Secod_way 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		  ChromeDriver driver = new ChromeDriver();
	      
	       driver.manage().window().maximize();
	      
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      
	       driver.get("https://www.instagram.com/");
	     
	       Thread.sleep(5000);
	      
	       File source = driver.getScreenshotAs(OutputType.FILE);
	       File destination = new File(System.getProperty("user.dir") + "\\screenshots_folder\\instagram_fullpage.png");
	      
	       Thread.sleep(5000);
	       Files.copy(source, destination);
	      
	       driver.quit();
	}
}

package taking_Screenshots_by_different_ways;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshot_By_Using_Fourth_Way 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		   RemoteWebDriver driver = new ChromeDriver();
	       
	      //  ChromeDriver driver = new ChromeDriver();
	       
	        driver.manage().window().maximize();
	       
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	       
	        driver.get("https://www.cricbuzz.com/");
	      
	        Thread.sleep(5000);
	       
	        File source = driver.getScreenshotAs(OutputType.FILE);
	        File destination = new File(System.getProperty("user.dir") + "\\screenshots_Folder\\cricbuzz_fullpage.png");
	        Files.copy(source, destination);
	        source.renameTo(destination);
	       
	        Thread.sleep(5000);
	        driver.quit();
	}
}

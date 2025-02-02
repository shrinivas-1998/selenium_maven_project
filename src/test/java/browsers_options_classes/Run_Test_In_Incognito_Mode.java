package browsers_options_classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Run_Test_In_Incognito_Mode 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--incognito");
		
		   WebDriver driver = new ChromeDriver(options);
	      
	       driver.manage().window().maximize();
	      
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      
	       driver.get("https://www.cricbuzz.com/");
	       
		   Thread.sleep(5000);
		   
		   String title =driver.getTitle();
		   System.out.println(title);
		   
		   Thread.sleep(5000);
		   
		   if(title.equals("Live Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com"))
		   {
			   System.out.println("test case is passed");
		   }
		   else
		   {
			   System.out.println("test case is failed");
		   }
		   
		   Thread.sleep(5000);
           driver.quit();
	}
}

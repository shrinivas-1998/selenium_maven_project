package launchingBrowsers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LuauchingChromeBrowser
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		
		// WebDriver driver = new ChromeDriver();
		
        //WebDriver driver = new EdgeDriver();
		 WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		driver.quit();
	}
}

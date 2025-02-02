package javaScriptExecutor_interface_method_example;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom_In_Zoom_Out 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	      
	       driver.manage().window().maximize();
	      
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      
	       driver.get("https://www.selenium.dev/");
	      
	       Thread.sleep(5000);
	       
	       JavascriptExecutor jse = (JavascriptExecutor)driver;
	       
	       jse.executeScript("document.body.style.zoom = '50%'"); // set zoom level 50%
	       
	       Thread.sleep(5000);

	       jse.executeScript("document.body.style.zoom = '150%'"); // set zoom level 150%
	       
	       Thread.sleep(5000);
	       
	       driver.quit();
	}
}

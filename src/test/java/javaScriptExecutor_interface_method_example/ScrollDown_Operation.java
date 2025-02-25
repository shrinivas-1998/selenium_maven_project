package javaScriptExecutor_interface_method_example;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_Operation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	      
	       driver.manage().window().maximize();
	      
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      
	       driver.get("https://www.selenium.dev/");
	      
	       Thread.sleep(5000);
	      
	       // Cast WebDriver to JavascriptExecutor
	       JavascriptExecutor jse = (JavascriptExecutor) driver;
	      
	       Thread.sleep(5000);
	       // Scroll down the webpage by 500 pixels
	       jse.executeScript("window.scrollBy(0,800)", "");
	       System.out.println(jse.executeScript("return window.pageYOffset;"));	      
	     //  jse.executeScript("window.scrollBy(0,1000)");
	      
	       // Optionally, add more operations or close the browser
	       Thread.sleep(5000); // Pause to observe the scroll
	      
	       driver.quit(); // Close the browser
	}
}

package javaScriptExecutor_interface_method_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_To_The_Bottom_of_The_Page 
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
	       // Scroll down to the visble text
	     //  WebElement element = driver.findElement(By.xpath("//h2[text() = 'News']"));
	       jse.executeScript("window.scrollBy(0, document.body.scrollHeight);"); // to scroll down to the bottom of the page 
	       jse.executeScript("window.scrollBy(0, document.body.scrollWidth);"); // to scroll extreme right  
          Thread.sleep(5000);
          jse.executeScript("window.scrollBy(0, -document.body.scrollHeight);"); // to scroll up to the top of the page 
          jse.executeScript("window.scrollBy(0, -document.body.scrollWidth);"); // to scroll extreme left
	      Thread.sleep(5000); // Pause to observe the scroll
	      
	      driver.quit(); // Close the browser
	}
}

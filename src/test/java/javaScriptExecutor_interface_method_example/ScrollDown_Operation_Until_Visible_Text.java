package javaScriptExecutor_interface_method_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_Operation_Until_Visible_Text 
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
	       WebElement element = driver.findElement(By.xpath("//h2[text() = 'News']"));
           jse.executeScript("arguments[0].scrollIntoView(true);", element);
	       System.out.println(jse.executeScript("return window.pageYOffset;"));	      
	    
	       Thread.sleep(5000); // Pause to observe the scroll
	      
	       driver.quit(); // Close the browser

	}

}

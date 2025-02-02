package findElement_example;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElements_Method 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		 // Initialize the WebDriver
	       WebDriver driver = new ChromeDriver();
	      
	       // Wait for the browser to open
	       Thread.sleep(5000);
	      
	       // Maximize the browser window
	       driver.manage().window().maximize();
	      
	       // Wait after maximizing the window
	       Thread.sleep(5000);
	      
	       // Navigate to Amazon.in
	       driver.get("https://www.amazon.in/");
	      
	       // Wait for the page to load
	       Thread.sleep(5000);
	      
	       // Search for laptops
	       driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("laptops", Keys.ENTER);
	      
	       // Wait for the search results to load
	       Thread.sleep(5000);
	      
	       // Find all elements with the specified class
	       List<WebElement> options = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	      
	       // Wait after finding elements
	       Thread.sleep(5000);
	      
	       // Loop through the list of elements and print the text
	       for (int i = 0; i < options.size(); i++) {  // Corrected: Added "int" before "i"
	           WebElement opt = options.get(i);
	           String laptop_name = opt.getText();
	           System.out.println(laptop_name);
	           Thread.sleep(4000);
	       }
	      
	      // by using advanced for loop(for each loop )
	      /* for(WebElement opt : options)
	       {
	       	String laptop_name = opt.getText();
	           System.out.println(laptop_name);
	           Thread.sleep(4000);
	       } */
	      
	      
	       // Close the browser after execution
	       Thread.sleep(5000);
	       driver.quit();


	}

}

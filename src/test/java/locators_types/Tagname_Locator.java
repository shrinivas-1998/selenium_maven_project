package locators_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_Locator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		// Set up the WebDriver and launch the Chrome browser
	       WebDriver driver = new ChromeDriver();
	      
	       Thread.sleep(5000);
	       // Maximize the browser window
	       driver.manage().window().maximize();
	      
	       // Navigate to Instagram
	       driver.get("https://www.instagram.com/");
	      
	       // Wait for the page to load
	       Thread.sleep(5000);
	       // Find the input element using the tag name and enter the email
	       WebElement inputField = driver.findElement(By.tagName("input"));
	       inputField.sendKeys("shrininivas@123.gamil.com");
	      
	       // Wait for a few seconds before closing the browser
	       Thread.sleep(5000);
	       // Quit the browser
	       driver.quit();


	}

}

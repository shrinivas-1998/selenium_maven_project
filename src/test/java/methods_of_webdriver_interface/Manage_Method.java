package methods_of_webdriver_interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;


public class Manage_Method 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		 // Initialize WebDriver
	       WebDriver driver = new ChromeDriver();


	       // Maximize the window
	       driver.manage().window().maximize();
	       Thread.sleep(5000);


	       // Navigate to Instagram
	       driver.get("https://www.instagram.com/");
	       Thread.sleep(5000);


	       // Minimize the window
	       driver.manage().window().minimize();
	       Thread.sleep(5000);


	       // Set window size
	       Dimension targetSize = new Dimension(375, 275);
	       driver.manage().window().setSize(targetSize);
	       Thread.sleep(8000);


	       // Close the browser
	       driver.quit();


	}

}

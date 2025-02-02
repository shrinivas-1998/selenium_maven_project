package robot_Class_example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class_Example 
{
	   public static void main(String[] args) throws InterruptedException, AWTException
	   {
	       WebDriver driver = new ChromeDriver();
	      
	       driver.manage().window().maximize();
	      
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      
	      // driver.get("https://www.calculator.net/");
	      
	       driver.get("https://www.selenium.dev/downloads/");
	      
	       Thread.sleep(5000);
	      
	       // Create an instance of the Robot class
	       Robot robot = new Robot();
	      
	       // Simulate pressing the CTRL+P keys to open the print dialog
	       robot.keyPress(KeyEvent.VK_CONTROL); // Corrected KeyEvent constants
	       robot.keyPress(KeyEvent.VK_P);
	      
	       Thread.sleep(5000); // Pause to observe the action
	      
	       // Release the CTRL+P keys
	       robot.keyRelease(KeyEvent.VK_CONTROL);
	       robot.keyRelease(KeyEvent.VK_P);
	      
	       Thread.sleep(5000);
	      
	       // Optionally, close the browser
	        driver.quit();
	   }

}

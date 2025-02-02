package methods_of_webdriver_interface;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Position_Method_Example 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Point targetPosition = new Point(600, 500);
		
		driver.manage().window().setPosition(targetPosition);
		
		Thread.sleep(5000);
		
		driver.quit();


	}

}

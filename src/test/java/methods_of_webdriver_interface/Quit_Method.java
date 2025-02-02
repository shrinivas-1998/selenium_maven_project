package methods_of_webdriver_interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_Method 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.quit();
	}

}

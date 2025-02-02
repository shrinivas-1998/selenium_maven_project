package methods_of_webdriver_interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Method {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// launching the chrome browser
		WebDriver driver = new ChromeDriver();
		
		// opening www.google.com
		driver.get("https://www.google.com");
		
		// closing the browser
		driver.close();
	}
}

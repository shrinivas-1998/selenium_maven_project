package launching_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_firefox_browser {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//WebDriver driver = new FirefoxDriver();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
	}
}

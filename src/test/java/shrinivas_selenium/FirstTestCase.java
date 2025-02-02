package shrinivas_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// launching the browser
       //  ChromeDriver driver = new ChromeDriver();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();   // Maximizing the browser
		   driver.get("https://www.cricbuzz.com/"); // Launching cricbuzz.com
		 
        
	}

}

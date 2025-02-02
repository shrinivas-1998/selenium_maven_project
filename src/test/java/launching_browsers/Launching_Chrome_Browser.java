package launching_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Chrome_Browser 
{

    public static void main(String[] args) 
    {
      
        // Instantiate a ChromeDriver class
       WebDriver driver = new ChromeDriver();
    	//ChromeDriver driver = new ChromeDriver();
        // Open a website
        driver.get("http://www.google.com");

        // Close the browser
        driver.quit();
    }
}

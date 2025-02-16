package LaunchingBrowsersOrDrivers1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchingAllDriversOrBrowsers 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();  // Launch Chrome
        WebDriver driver1 = new EdgeDriver();   // Launch Edge
        WebDriver driver2 = new FirefoxDriver(); // Launch Firefox
        WebDriver driver3 = new SafariDriver();
        WebDriver driver4 = new InternetExplorerDriver();

        Thread.sleep(3000); // Wait before closing
        driver.quit();
	}
}

package LaunchingBrowsersOrDrivers1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingAllDriversOrBrowsers 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new EdgeDriver();
		WebDriver driver2 = new FirefoxDriver();

		Thread.sleep(3000);
		driver.quit();
	}
}

package methods_of_webdriver_interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	
		driver.navigate().to("https://www.selenium.dev/");
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().to("https://www.cricbuzz.com/");
		
		Thread.sleep(5000);
		
		driver.quit();


	}

}

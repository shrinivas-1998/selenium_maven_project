package pop_up_handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Autheticated_Popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// driver.get("https://the-internet.herokuapp.com/basic_auth"); // you will get authenticated popup 
		
		Thread.sleep(5000);
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); // here we handle it by adding username and password 
		
		Thread.sleep(5000);

		driver.quit();
	}
}

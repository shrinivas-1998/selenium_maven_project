package RuntimePolymorphism1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphism 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Select required Browesr");
		String BrowserValue = s.next().toLowerCase();

		if (BrowserValue.equals("chrome")) 
		{
			//WebDriver driver = new ChromeDriver();
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.cricbuzz.com/");
			System.out.println("Chrome Browser Launched");
			
		} 
		else if (BrowserValue.equals("edge")) 
		{
			//WebDriver driver = new EdgeDriver();
			driver = new EdgeDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.jiosaavn.com/");
			System.out.println("Edge Browser Launched");
		} 
		else if (BrowserValue.equals("firefox")) 
		{
			// WebDriver driver = new FirefoxDriver();
			driver= new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.jiosaavn.com/");
			System.out.println("Firefox Browser Launched");
		} 
		else 
		{
			System.out.println("Please select Valid BrowserValue");
		}
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();	
	}
}

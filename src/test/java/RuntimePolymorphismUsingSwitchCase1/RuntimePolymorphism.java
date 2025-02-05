package RuntimePolymorphismUsingSwitchCase1;

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
		System.out.println("Select required Browser (chrome/edge/firefox):");
		String browserValue = s.next().toLowerCase(); // Convert to lowercase to avoid case-sensitivity issues
		s.close(); // Close scanner to prevent resource leaks

		switch (browserValue) 
		{
		case "chrome":
			driver = new ChromeDriver();
			System.out.println("Chrome Browser Launched");
			driver.get("https://www.cricbuzz.com/");
			break;

		case "edge":
			driver = new EdgeDriver();
			System.out.println("Edge Browser Launched");
			driver.get("https://www.jiosaavn.com/");
			break;

		case "firefox":
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser Launched");
			driver.get("https://www.mozilla.org/");
			break;

		default:
			System.out.println("Please select a valid browser (chrome, edge, firefox)");
			//return; // Exit if no valid browser is selected
		}

		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
	}
}

package methods_of_webdriver_interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_Method 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
		String instaTitle = driver.getTitle();
		
		System.out.println(instaTitle);
		
		driver.get("https://www.cricbuzz.com/");
		
		driver.manage().window().maximize();
		
		String CB_Title = driver.getTitle();
		
		System.out.println(CB_Title);
		
		driver.quit();


	}

}

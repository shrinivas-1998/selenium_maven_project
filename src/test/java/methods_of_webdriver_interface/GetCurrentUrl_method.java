package methods_of_webdriver_interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_method 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		String currenturl_of_webpage = driver.getCurrentUrl();
		
		System.out.println(currenturl_of_webpage);
		
		driver.close();


	}

}

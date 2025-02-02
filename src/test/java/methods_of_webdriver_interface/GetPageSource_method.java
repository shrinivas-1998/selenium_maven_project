package methods_of_webdriver_interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource_method 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		//System.out.println(driver.getPageSource());
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		driver.close();


	}

}

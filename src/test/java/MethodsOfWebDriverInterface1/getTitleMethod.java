package MethodsOfWebDriverInterface1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		String Title =driver.getTitle();
		System.out.println(Title);
		
		driver.get("https://www.jiosaavn.com/");
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		
		Thread.sleep(3000);
		driver.quit();
	}
}

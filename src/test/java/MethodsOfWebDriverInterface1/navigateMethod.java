package MethodsOfWebDriverInterface1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.jiosaavn.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.cricbuzz.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}
}

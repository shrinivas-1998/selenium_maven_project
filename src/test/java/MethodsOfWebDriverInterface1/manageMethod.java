package MethodsOfWebDriverInterface1;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manageMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		Thread.sleep(6000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}
}

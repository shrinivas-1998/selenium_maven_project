package LocatorsPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNameLocator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("ross geller",Keys.ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.className("lNPNe")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}

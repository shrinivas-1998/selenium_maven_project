package LocatorsPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorLocator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("shrinivas@gamil.com"); // for id 
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("shrinivas@gamil.com"); // for class 
		//driver.findElement(By.cssSelector("input[class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']")).sendKeys("shrinivas@gamil.com"); // for class
		//driver.findElement(By.cssSelector("input[class^='inputtext _55r1 inputtext _1k']")).sendKeys("shrinivas@gamil.com"); // by providing initial characters
		//driver.findElement(By.cssSelector("input[class$='1kbt inputtext _1kbt']")).sendKeys("shrinivas@gamil.com"); // by providing last or end characters
		driver.findElement(By.cssSelector("input[class*='inputtext _1kbt inputtext']")).sendKeys("shrinivas@gamil.com"); // by providing middle characters
		
		Thread.sleep(4000);
		driver.quit();
	}
}

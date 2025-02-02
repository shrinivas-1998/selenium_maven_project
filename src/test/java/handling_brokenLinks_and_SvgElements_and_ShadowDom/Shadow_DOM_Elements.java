package handling_brokenLinks_and_SvgElements_and_ShadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_DOM_Elements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://books-pwakit.appspot.com/");
		
		Thread.sleep(5000);
		
		// HANDLE THE SHADOW DOM 
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(5000);
		shadow.findElement(By.cssSelector("input")).sendKeys("WELCOME");
		
		Thread.sleep(5000);
        driver.quit();
	}
}

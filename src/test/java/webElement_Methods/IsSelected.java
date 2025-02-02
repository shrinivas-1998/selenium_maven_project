package webElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(5000);
		
		WebElement verify = driver.findElement(By.xpath("//input[@id = 'radio1']"));
		boolean check = verify.isSelected();
		System.out.println(check);
		
		Thread.sleep(5000);
		
		verify.click();
		
		Thread.sleep(5000);
		
		boolean check2 = verify.isSelected();
		
	    System.out.println(check2);
	    
		Thread.sleep(5000);

		driver.quit();
	}
}

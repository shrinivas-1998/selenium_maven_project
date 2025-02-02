package mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Action 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
			
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	   
	    driver.get("https://omayo.blogspot.com/");
	   
	    Thread.sleep(5000);
	   
	    Actions act = new Actions(driver);
	   
	    WebElement target = driver.findElement(By.xpath("//button[text() = ' Double click Here   ']"));
	   
	    act.doubleClick(target).perform();
	   
	    Thread.sleep(5000);
	   
	    driver.quit();
	}
}

package locators_types;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClassName_Locator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		    WebDriver driver = new ChromeDriver();
	       
	        Thread.sleep(5000);
	       
	        driver.manage().window().maximize();
	       
	        Thread.sleep(5000);
	       
	        driver.get("https://www.google.com/");
	       
	        Thread.sleep(5000);
	       
	      //  WebElement email_textfield  = driver.findElement(By.id("email"));
	       
	        driver.findElement(By.name("q")).sendKeys("ross geller", Keys.ENTER);
	     
	        Thread.sleep(5000);
	       
	        driver.findElement(By.className("lNPNe")).click();
	       
	        Thread.sleep(5000);
	       
	        driver.quit();


	}

}

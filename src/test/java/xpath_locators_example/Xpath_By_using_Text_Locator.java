package xpath_locators_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_using_Text_Locator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		    WebDriver driver = new ChromeDriver();
			
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			driver.get("https://www.instagram.com/");
			
			Thread.sleep(5000);
			
			WebElement  username_textfield = driver.findElement(By.xpath("//input[@type ='text']"));
			username_textfield.sendKeys("shrinivias123@gmail.com");
			
			Thread.sleep(5000);
	   
			WebElement password_textfield = driver.findElement(By.xpath("//input[@type ='password']"));
			password_textfield.sendKeys("shrinivas@123");
			
			Thread.sleep(5000);
	  
			WebElement LOGIN_Button = driver.findElement(By.xpath("//div[text() ='Log in']"));
			LOGIN_Button.click();
			
			Thread.sleep(5000);
			driver.quit();


	}

}

package locators_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	       
        Thread.sleep(5000);
       
        driver.manage().window().maximize();
       
        Thread.sleep(5000);
       
        driver.get("https://www.facebook.com/");
       
        Thread.sleep(5000);
       
      //  WebElement email_textfield  = driver.findElement(By.id("email"));
       
        WebElement email_textfield  = driver.findElement(By.name("email"));
        email_textfield.sendKeys("niraj123@gamil.com");
       
        Thread.sleep(5000);
       
        driver.quit();


	}

}

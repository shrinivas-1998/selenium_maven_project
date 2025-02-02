package synchronisation_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitly_Wait_example 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.facebook.com/");
		
        WebElement username_textfield =	driver.findElement(By.xpath("//input[@placeholder ='Email address or phone number']"));
        username_textfield.sendKeys("shrinivas56@gamil.com");
        System.out.println("shrinivas56@gamil.com");
        
        Thread.sleep(5000);

        WebElement password_textfield = driver.findElement(By.xpath("//input[@placeholder ='Password']"));
        password_textfield.sendKeys("bakchod insaan");
        System.out.println("bakchod insaan");
        
        WebElement Login_Button = driver.findElement(By.xpath("//button[text() ='Log in']"));
        Login_Button.click();
        
        Thread.sleep(5000);
  
        driver.quit();
	}
}

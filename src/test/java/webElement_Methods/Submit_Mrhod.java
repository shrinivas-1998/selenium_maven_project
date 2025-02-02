package webElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit_Mrhod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
        WebElement username_TextField = driver.findElement(By.xpath("//input[@placeholder = 'Username']"));
        username_TextField.sendKeys("Admin");
        
		Thread.sleep(5000);
      
        WebElement password_TextField = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
        password_TextField.sendKeys("admin123");
        
		Thread.sleep(5000);

		WebElement login_Button = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		login_Button.submit();
		
		Thread.sleep(5000);

		driver.quit();
	}
}

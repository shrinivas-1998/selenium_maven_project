package webElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Method 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.name("email"));
		System.out.println(email.getText());
		  
		WebElement password = driver.findElement(By.name("pass"));
		System.out.println(password.getText());
		
		WebElement login_button = driver.findElement(By.xpath("//button[text() = 'Log in']"));
		System.out.println(login_button.getText());
		Thread.sleep(5000);

		driver.quit();
	}
}

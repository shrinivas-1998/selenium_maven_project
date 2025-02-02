package findElement_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_Method 
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
		
		WebElement forgot_password_button = driver.findElement(By.xpath("//a[contains(text(), 'Forgotten password?')]"));
		forgot_password_button.click();
		
		Thread.sleep(5000);
		WebElement email_textfield = driver.findElement(By.xpath("//input[contains(@placeholder, 'Email address or mobile number')]"));
		email_textfield.sendKeys("vikasdhere1@gamil.com");
		
		Thread.sleep(5000);
		WebElement search_button = driver.findElement(By.xpath("//button[contains(text(), 'Search')]"));
		search_button.click();
		
		Thread.sleep(5000);
		
		driver.quit();


	}

}

package xpath_locators_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Using_Unique_Attribute 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.get("https://accounts.nike.com/lookup?client_id=4fd2d5e7db76e0f85a6bb56721bd51df&redirect_uri=https://www.nike.com/auth/login&response_type=code&scope=openid%20nike.digital%20profile%20email%20phone%20flow%20country&state=537313da5663413c8c349e0c2c4199d6&code_challenge=R_DYruqNlLikcl08Wque0rhmGoqfP3T79eeOZw1Ncto&code_challenge_method=S256");
		
		Thread.sleep(5000);
		
	    WebElement email_id =driver.findElement(By.xpath("//input[@name ='credential']"));
	    email_id.sendKeys("shrinivas123@gamail.com");
	   
		Thread.sleep(5000);
	    WebElement continue_button = driver.findElement(By.xpath("//button[@aria-label ='continue']"));
	    continue_button.click();
	   
		Thread.sleep(5000);
		driver.quit();
	}
}

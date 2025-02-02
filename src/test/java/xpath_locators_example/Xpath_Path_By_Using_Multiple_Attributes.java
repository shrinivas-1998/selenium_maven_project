package xpath_locators_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Path_By_Using_Multiple_Attributes 
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
		
		WebElement username_textfield = driver.findElement(By.xpath("//input[@class ='inputtext _55r1 _6luy' and (@placeholder ='Email address or phone number')]"));
		username_textfield.sendKeys("akshayshirode987@gamil.com");
		System.out.println("akshayshirode987@gamil.com");
		
		Thread.sleep(5000);
		WebElement password_textfield = driver.findElement(By.xpath("//input[@type ='password' and (@placeholder ='Password')]"));
		password_textfield.sendKeys("good_human being ");
		System.out.println("good_human being ");
		Thread.sleep(5000);
		
		WebElement login_button = driver.findElement(By.xpath("//button[@class = '_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy' and (text() = 'Log in')]"));
		login_button.click();
		System.out.println("invalid username and password");
		Thread.sleep(5000);
		driver.quit();


	}

}

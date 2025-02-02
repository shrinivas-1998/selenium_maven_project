package pop_up_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popup_Handling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
	    WebElement  search_button_textfield =driver.findElement(By.xpath("//input[@title = 'Search for Products, Brands and More']"));
	    search_button_textfield.sendKeys("mobiles");
	    
		Thread.sleep(5000);

	    WebElement search_button = driver.findElement(By.xpath("//button[@type = 'submit']"));
	    search_button.click();
	    
		Thread.sleep(5000);
		
		

	 
	 

	}

}

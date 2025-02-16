package xpath_locators_example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon_laptop_name_example 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder ='Search Amazon.in']")).sendKeys("laptops", Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()= 'Intel Core i5']/preceding-sibling::div[@class ='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text() ='HP']/preceding-sibling::div[@class = 'a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']")).click();
		
		Thread.sleep(5000);
	    WebElement  name_of_laptopn =driver.findElement(By.xpath("//span[@class ='a-size-medium a-color-base a-text-normal']/ancestor::h2[@class = 'a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		     
	    System.out.println(name_of_laptopn.getText());
	   
	    driver.quit();
	}
}

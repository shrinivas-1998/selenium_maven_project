package javaScriptExecutor_interface_method_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Performing_SendKeys_And_Click_operation_By_Using_JavaScriptExecutor_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver(); // upcasting ChromeDriver to WebDriver
       // ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://testautomationpractice.blogspot.com/");
        
        Thread.sleep(5000);
        WebElement name_textfield = driver.findElement(By.xpath("//input[@id = 'name']"));
         
        // passing the text in text field - alternate of sendkeys()
        JavascriptExecutor jse = (JavascriptExecutor)driver;  // downcasting because of upcasting ChromeDriver to WebDriver
       //JavascriptExecutor jse = driver; // no need to down casting because of ( ChromeDriver driver = new ChromeDriver();)
        
        jse.executeAsyncScript("arguments[0].setAttribute('value', 'shrinivas')",name_textfield);
        
        // clicking on webelement - alternative of click()
        WebElement  male_radio_button = driver.findElement(By.xpath("//input[@id = 'male']"));
        jse.executeAsyncScript("arguments[0].click()",male_radio_button );
        
        Thread.sleep(5000);
        driver.quit();
	}
}

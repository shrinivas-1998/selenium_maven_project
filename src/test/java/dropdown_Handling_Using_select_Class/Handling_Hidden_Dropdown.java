package dropdown_Handling_Using_select_Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Hidden_Dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		// login steps
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("Admin");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("admin123");

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		Thread.sleep(5000);

		// clicking on PIM webelemet 
		
		driver.findElement(By.xpath("//span[text() ='PIM']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//i[@class = 'oxd-icon bi-caret-down-fill oxd-select-text--arrow']) [3]")).click();
		
		Thread.sleep(5000);
		
		// select single option 
	  //	driver.findElement(By.xpath("//span[text() = 'Account Assistant']")).click();
		
		// counting number of options present in drorpdown
        List<WebElement>  options =driver.findElements(By.xpath("//div[@role ='listbox']//span"));
        System.out.println("numbers of options : "+options.size()); // 31
        
        // printing options
        
        for(WebElement option:options)
        {
        	System.out.println(option.getText());
        }
		Thread.sleep(5000);
        driver.quit(); 
	}
}

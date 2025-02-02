package dropdown_Handling_Using_select_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(5000);
		
		WebElement clicking_dropdownelemnt = driver.findElement(By.xpath("//select[@id ='drop1']"));
		//clicking_dropdownelemnt.click();
		
		Thread.sleep(5000);
		
	    Select s1 = new Select(clicking_dropdownelemnt); // select class is used to click on dropdown button 
	    
		Thread.sleep(5000);
		//s1.selectByValue("jkl");
		s1.selectByValue("mno");
		Thread.sleep(5000);
        driver.quit();
	}
}

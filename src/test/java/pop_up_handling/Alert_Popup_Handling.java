package pop_up_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_Popup_Handling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
	
		WebElement target = driver.findElement(By.xpath("//button[text() =' Double click Here   ']"));
		
		action.doubleClick(target).perform();
		
	    Thread.sleep(5000);

		Alert a1 = driver.switchTo().alert(); 
		
		Thread.sleep(5000);
		
		//accept the alert pop up 
		a1.accept();
		
		// dismiss the alert pop up 
		Thread.sleep(5000);
	//	a1.dismiss();
		
		// print the text of pop up 
		Thread.sleep(5000);
		//System.out.println(a1.getText());
		
		Thread.sleep(5000);
		driver.quit();
	}
}

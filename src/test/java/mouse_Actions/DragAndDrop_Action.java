package mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Action 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
			
	       driver.manage().window().maximize();
				
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		   
		    driver.get("https://demo.guru99.com/test/drag_drop.html");
		   
		    Thread.sleep(5000);
		   
		    WebElement  src =  driver.findElement(By.xpath("//a[text() =' BANK ']"));
		   
		    WebElement target = driver.findElement(By.xpath("//ol[@class = 'field14 ui-droppable ui-sortable']"));
		   
		    Thread.sleep(5000);
		    Actions action = new Actions(driver);
		   
		    action.dragAndDrop(src, target).perform();
		   
		    Thread.sleep(5000);
	       WebElement  src1 =  driver.findElement(By.xpath("//a[text() = ' 5000 ']"));
		   
		    WebElement target1 = driver.findElement(By.xpath("//ol[@class = 'field13 ui-droppable ui-sortable']"));
		   
		    Thread.sleep(5000);
		   
		    action.dragAndDrop(src1, target1).perform();
		   
		    Thread.sleep(5000);
		   
		    driver.quit(); 
	}
}

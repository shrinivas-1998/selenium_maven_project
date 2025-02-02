package keyboard_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Performing_Keboard_Actions_By_Using_Actions_Class 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://text-compare.com/");
        
         Thread.sleep(5000);
         
         driver.findElement(By.xpath("//textarea[@placeholder= 'Paste one version of a text here.']")).sendKeys("welcome");
        
         Actions act = new Actions(driver);
         
         // CTRL + A
         
         act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
         
         // CTRL + C
         
         act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
         
         //TAB
      
         act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
         
         // CTRL + V
         act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform(); 
         
         Thread.sleep(5000);
         driver.quit();
         
         /*
         // CTRL + SHIFT + A
         act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();

         // to press enter button 
         act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
         */
	}
}

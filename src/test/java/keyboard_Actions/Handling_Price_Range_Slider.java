package keyboard_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Price_Range_Slider 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        
         Thread.sleep(5000);
        
         Actions act = new Actions(driver);
         
        // handling minimum slider
         WebElement  min_slider = driver.findElement(By.xpath("(//span[@class= 'ui-slider-handle ui-corner-all ui-state-default'])[1]"));
         System.out.println("location of minium slider before moving : "+min_slider.getLocation()); // location of minium slider : (59, 250)
         System.out.println("location of minium slider before moving : "+min_slider.getLocation().getX()); // 59
         System.out.println("location of minium slider before moving : "+min_slider.getLocation().getY()); // 250
         
         Thread.sleep(5000);

         act.dragAndDropBy(min_slider, 100, 0).perform();
         
         System.out.println("location of minimum slider after moving : "+min_slider.getLocation()); // (158, 250)
         System.out.println("location of minimum slider after moving : "+min_slider.getLocation().getX()); // 158
         
         // hadling maximum slider
         
        WebElement  max_slider = driver.findElement(By.xpath("(//span[@class= 'ui-slider-handle ui-corner-all ui-state-default'])[2]"));
        System.out.println("location of maximum slider before moving : "+max_slider.getLocation()); //(612, 250)
        System.out.println("location of maximum slider before moving : "+max_slider.getLocation().getX()); // 612
        System.out.println("location of maximum slider before moving : "+max_slider.getLocation().getY()); // 250
        
        Thread.sleep(5000);

        act.dragAndDropBy(max_slider, -200, 0).perform();
        System.out.println("location of maximum slider after moving : "+max_slider.getLocation()); // (413, 250)
        System.out.println("location of maximum slider after moving : "+max_slider.getLocation().getX()); // 413
        
        Thread.sleep(5000);
        driver.quit();
	}
}

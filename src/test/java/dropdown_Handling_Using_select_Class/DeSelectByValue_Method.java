package dropdown_Handling_Using_select_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByValue_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(5000);
		
		WebElement multiselect_Box = driver.findElement(By.xpath("//select[@id = 'multiselect1']"));
		
		Thread.sleep(5000);
		
		Select s1 = new Select(multiselect_Box);
		s1.selectByValue("volvox");
		Thread.sleep(5000);
       System.out.println("Selected options : volvox");
      
		s1.selectByValue("swiftx");
		Thread.sleep(5000);
       System.out.println("Selected options : swiftx");
		s1.selectByValue("Hyundaix");
		Thread.sleep(5000);
       System.out.println("Selected options : Hyundaix");
		s1.selectByValue("audix");
		Thread.sleep(5000);
       System.out.println("Selected options : Audi");
      
       System.out.println();
      
       s1.deselectByValue("audix");
       Thread.sleep(5000);
       System.out.println("DeSelected options : Audi");
      
       s1.deselectByValue("Hyundaix");
       Thread.sleep(5000);
       System.out.println("DeSelected options : Hyundaix");
      
       s1.deselectByValue("swiftx");
       Thread.sleep(5000);
       System.out.println("DeSelected options : swiftx");
      
       s1.deselectByValue("volvox");
       Thread.sleep(5000);
       System.out.println("DeSelected options : volvox");
      
       Thread.sleep(5000);
       driver.quit();


	}

}

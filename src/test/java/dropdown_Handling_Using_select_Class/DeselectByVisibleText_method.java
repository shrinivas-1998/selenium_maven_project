package dropdown_Handling_Using_select_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleText_method 
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
		
		s1.selectByVisibleText("Volvo");
		Thread.sleep(5000);
		System.out.println("selected options : Volvo");
		
		s1.selectByVisibleText("Swift");
		Thread.sleep(5000);
		System.out.println("selected options : Swift");
		
		s1.selectByVisibleText("Hyundai");
		Thread.sleep(5000);
		System.out.println("selected options : Hyundai");
		
		s1.selectByVisibleText("Audi");
		Thread.sleep(5000);
		System.out.println("selected options : Audi");
		
		System.out.println();
		
		s1.deselectByVisibleText("Audi");
		Thread.sleep(5000);
		System.out.println("Deselected options : Audi");
		
		s1.deselectByVisibleText("Hyundai");
		Thread.sleep(5000);
		System.out.println("Deselected options : Hyundai");
		
		s1.deselectByVisibleText("Swift");
		Thread.sleep(5000);
		System.out.println("Deselected options : Swift");
		
		s1.deselectByVisibleText("Volvo");
		Thread.sleep(5000);
		System.out.println("Deselected options : Volvo");
		
		Thread.sleep(5000);
		driver.quit();
	}
}

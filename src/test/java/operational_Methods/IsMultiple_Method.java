package operational_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple_Method 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement multiselect_Box = driver.findElement(By.xpath("//select[@id = 'multiselect1']"));
		
		Select s1 = new Select(multiselect_Box);
		
		System.out.println(s1.isMultiple());
		
		WebElement singleselect_Box = driver.findElement(By.xpath("//select[@id='drop1']"));
		
		Select s2 = new Select(singleselect_Box);
		
		System.out.println(s2.isMultiple());
		
		driver.quit();
	}
}

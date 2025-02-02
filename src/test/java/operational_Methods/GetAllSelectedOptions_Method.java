package operational_Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions_Method 
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
		
		for(int i =0; i<4 ; i++)
		{
			s1.selectByIndex(i);
		}
		
	    List<WebElement> options = s1.getAllSelectedOptions();
		        
		 for(int i =0; i<options.size(); i++) 
		 {
			 String options1 = options.get(i).getText();
			 System.out.println(options1);
		 } 
                 driver.quit();    
	}
}

package dropdown_Handling_Using_select_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex_Method 
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
			
			/*s1.selectByIndex(0);
			Thread.sleep(5000);
			
			s1.selectByIndex(1);
			
			Thread.sleep(5000);
			s1.selectByIndex(2);*/
			
			// By using for loop
			
			for(int i=0; i<4 ;i++)
			{
				s1.selectByIndex(i);
				Thread.sleep(4000);
				System.out.println("Selected option: " + s1.getOptions().get(i).getText());
				Thread.sleep(3000);
			}
			System.out.println();
			
			/*s1.deselectByIndex(3);
			
			Thread.sleep(4000);
			
			s1.deselectByIndex(2);
			
			Thread.sleep(4000);
			s1.deselectByIndex(1);
			
			Thread.sleep(4000);
			s1.deselectByIndex(0);*/
			
			for(int i=0; i<4; i++)
			{
				s1.deselectByIndex(i);
				Thread.sleep(4000);
				System.out.println("DeSelected option: " + s1.getOptions().get(i).getText());	
			}
			
			Thread.sleep(4000);
			driver.quit();


	}

}

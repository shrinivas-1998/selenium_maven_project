package dropdown_Handling_Using_select_Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Aiuto_Suggestion_Dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//textarea[@name ='q']")).sendKeys("selenium");
		
		Thread.sleep(5000);

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role ='listbox']//li//div[@role = 'option']"));
		
		System.out.println(list.size());
		
		// By using for loop
		
		/*for(int i =0; i<=list.size(); i++)
		{
			if(list.get(i).getText().equals("selenium"))
			{
				list.get(i).click();
				break;
			}
		}*/
		
		// By using for each loop 
		
		for(WebElement lists:list)
		{
			if(lists.getText().equals("selenium"))
			{
				lists.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}

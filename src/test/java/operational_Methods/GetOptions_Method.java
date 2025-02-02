package operational_Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement multiselect_Box = driver.findElement(By.xpath("//select[@id = 'multiselect1']"));
		
		Select s1 = new Select(multiselect_Box);
		
		System.out.println(s1.isMultiple());
		
		List<WebElement> alloptions = s1.getOptions();
		
		for(int i=0; i<alloptions.size(); i++)
		{
			String option = alloptions.get(i).getText();
			System.out.println(option);
		}
		
		Thread.sleep(5000);
		
		WebElement singleselect_Box = driver.findElement(By.xpath("//select[@id='drop1']"));
		
		Select s2 = new Select(singleselect_Box);
		
		System.out.println(s2.isMultiple());
		
		List<WebElement> alloptions2 = s2.getOptions();
		
		for(int i=0; i<alloptions2.size(); i++)
		{
			String option2 = alloptions2.get(i).getText();
			System.out.println(option2);
		}
		
		driver.quit();
	}
}

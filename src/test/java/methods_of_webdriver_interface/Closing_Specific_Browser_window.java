package methods_of_webdriver_interface;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closing_Specific_Browser_window 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text() = 'OrangeHRM, Inc']")).click();
		
		   Set<String>  windowID = driver.getWindowHandles();
		
		Thread.sleep(5000);

		for(String wid:windowID)
		{
			String  title = driver.switchTo().window(wid).getTitle();
			
		//	String url = driver.switchTo().window(wid).getCurrentUrl(); // you can use any one of them 
			
			System.out.println(title);
			
			if(title.equals("OrangeHRM") || title.equals("some other window"))
			{
				driver.close();
				Thread.sleep(5000);
			}
			
			else if(title.equals("Human Resources Management Software | OrangeHRM"))
			{
				driver.close();
			}
		}
	}
}

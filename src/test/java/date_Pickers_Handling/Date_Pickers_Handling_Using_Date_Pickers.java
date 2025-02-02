package date_Pickers_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Pickers_Handling_Using_Date_Pickers 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		Thread.sleep(5000);
		
		// switch to frame 
		driver.switchTo().frame(0);
		
		// method 2: using date pickers 
		// selecting next dates 
		String year = "2025";
		String month = "May";
		String date = "25";
		
	   /*	
		// selecting previous dates 
		String year = "2023";
		String month = "may";
		String date = "25";
		
		*/
		
		driver.findElement(By.xpath("//input[@id ='datepicker']")).click();
		
		// select month and year 
		
		while (true) 
		{
            String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
            String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

            if (currentMonth.equalsIgnoreCase(month) && currentYear.equals(year)) 
            {
                break;
            }

            driver.findElement(By.className("ui-icon-circle-triangle-e")).click(); // Click next button
           // driver.findElement(By.xpath("//span[@class ='ui-icon ui-icon-circle-triangle-w']")  // for click on previous button )
        }
		
	  List<WebElement> alldates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody//tr//td//a"));
	  
	  for(WebElement dt:alldates)
	  {
		  if(dt.getText().equals(date))
		  {
			  dt.click();
			  break;
		  }
	  }	
	  Thread.sleep(5000);
	  driver.quit();
	}
}

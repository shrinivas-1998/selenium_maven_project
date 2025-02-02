package dropdown_Handling_Using_select_Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelect_Or_Bootstrap_Dropdown_Handling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class ='multiselect dropdown-toggle btn btn-default']")).click();  // opens dropdown optiodns
		
		// 1) select single option 
		
	  	driver.findElement(By.xpath("//input[@value = 'jQuery']")).click();
		
		
		// 2) capture all the options and find out the size
		
       List<WebElement> options = driver.findElements(By.xpath("//ul[@class ='multiselect-container dropdown-menu']//label"));
       System.out.println("number of options : "+options.size());
       
       // 3) printing the options from dropdown
       
      for(int i=0; i<options.size(); i++)
       {
    	   System.out.println(options.get(i).getText());
   		  Thread.sleep(2000);
       } 
       
     /*  for( WebElement op:options)
       {
    	   System.out.println(op.getText());
       } */
      
       
       // 4) selecting multiple options
       
       for( WebElement op:options)
       {
    	   String option = op.getText();
    	   if(option.equals("Java") || option.equals("Python") || option.equals("MySQL"))
           {
           	op.click();
           }
       }
	}
}

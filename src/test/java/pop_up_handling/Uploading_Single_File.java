package pop_up_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploading_Single_File 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	      
	       driver.manage().window().maximize();
	      
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      
	       driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	      
	       driver.findElement(By.xpath("//input[@id = 'filesToUpload']")).sendKeys("C:\\shrinivas\\Bio Data.pdf");  
	      
	       // single file uploading 
	     if(driver.findElement(By.xpath("//ul[@id = 'fileList']//li")).getText().equals("Bio Data.pdf"))
	     {
	    	 System.out.println("file is successfully uploaded!!!!");
	     }
	     
	     else 
	     {
	    	 System.out.println("file not successfully uploaded!!");
	     }
	     
	     Thread.sleep(5000);
	     driver.quit();
	}
}

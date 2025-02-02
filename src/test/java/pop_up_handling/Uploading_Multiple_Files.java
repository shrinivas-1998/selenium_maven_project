package pop_up_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploading_Multiple_Files 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
	      
	       driver.manage().window().maximize();
	      
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      
	       driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	       
	     //  multiple file uploading
		   Thread.sleep(5000);

	       String file1 = "C:\\\\shrinivas\\Bio Data.pdf";
	       String file2 = "C:\\\\shrinivas\\Bio Data_2.pdf";
	       
	       driver.findElement(By.xpath("//input[@id = 'filesToUpload']")).sendKeys(file1+"\n"+file2);
	       
	      // validation 1 --> number of files  
	      int no_of_files_uploaded =driver.findElements(By.xpath("//ul[@id = 'fileList']//li")).size();
	      
	      if(no_of_files_uploaded == 2)
	      {
	    	  System.out.println("All files Uploaded successfully");
	      }
	      else
	      {
	    	  System.out.println("All files not uploaded successfully");
	      }
	      
	      // validation2 ---> name of files
	      
	      if(driver.findElement(By.xpath("//ul[@id = 'fileList']//li[1]")).getText().equals("Bio Data.pdf") && driver.findElement(By.xpath("//ul[@id = 'fileList']//li[2]")).getText().equals("Bio Data_2.pdf"))
	      {
	    	  System.out.println("files name is matching");
	      }
	      
	      else 
	      {
	    	  System.out.println("files name is not  matching"); 
	      }
	      
	      Thread.sleep(5000);
	      driver.quit();
	}
}

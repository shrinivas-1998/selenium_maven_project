package data_Driven_Testing_Actual_Example;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FD_Calculator 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html");
		driver.findElement(By.xpath("//button[@class ='No thanks']")).click();
		
		Thread.sleep(5000);
		
	    String Filepath = System.getProperty("user.dir")+"\\testdata\\calculation_data.xlsx";
	    int rows=ExcelUtils.getRowCount(Filepath, "sheet1");
	   
	    for(int i=1; i<=rows; i++)
	    {
	    	// read data from excel 
	      String principle =ExcelUtils.getCellData(Filepath, "sheet1", i, 0);
	      String RteOfInterest =ExcelUtils.getCellData(Filepath, "sheet1", i, 1);
	      String period1 =ExcelUtils.getCellData(Filepath, "sheet1", i, 2);
	      String period2 =ExcelUtils.getCellData(Filepath, "sheet1", i, 3);
	      String frequency =ExcelUtils.getCellData(Filepath, "sheet1", i, 4);
	      String ExpectedMaturityValue =ExcelUtils.getCellData(Filepath, "sheet1", i, 5);
	      
	    	
	    	// pass above data into excel 
	      driver.findElement(By.xpath("//input[@id = 'principal']")).sendKeys(principle);
			 Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@id = 'interest']")).sendKeys(RteOfInterest);
			 Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@id = 'tenure']")).sendKeys(period1);
			 Thread.sleep(2000);
			 
	    
	     Select s1 = new Select(driver.findElement(By.xpath("//select[@id = 'tenurePeriod']")));
	     s1.selectByVisibleText(period2);
		 Thread.sleep(2000);

	     Select s2 = new Select(driver.findElement(By.xpath("//select[@id = 'frequency']")));
	     s2.selectByVisibleText(frequency);
		 Thread.sleep(2000);
		 
	     driver.findElement(By.xpath("(//div[@class = 'CTR PT15']//a)[1]")).click(); // clicked on claculate button 
	     
	    // validation
	          String ActualMaturityValue = driver.findElement(By.xpath("//span[@class = 'gL_27']//strong")).getText();
	          
	          if(Double.parseDouble(ExpectedMaturityValue)==Double.parseDouble(ActualMaturityValue))
	          {
	        	  System.out.println("Test Passed");
	        	  ExcelUtils.setCellData(Filepath, "sheet1", i, 7, "passed");
	     		  Thread.sleep(2000);
	        	  ExcelUtils.fillGreenColor(Filepath, "sheet1", i, 7);
	          }
	          else 
	          {
	        	  System.out.println("Test Failed");
	        	  ExcelUtils.setCellData(Filepath, "sheet1", i, 7, "Failed"); 
	     		  Thread.sleep(2000);
	        	  ExcelUtils.fillRedColor(Filepath, "sheet1", i, 7);
	          }
	 		  Thread.sleep(5000);
	          driver.findElement(By.xpath("//img[@class = 'PL5']")).click();
	          
	    }
	    
		Thread.sleep(5000);
        driver.quit();
	}
}

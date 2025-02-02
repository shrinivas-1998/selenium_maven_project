package web_tables_handling;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Pagination_Table_Handling 
{
    public static void main(String[] args) throws InterruptedException
    {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the window
        driver.manage().window().maximize();
        
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
        // Open the URL
        driver.get("https://demo.opencart.com/admin/index.php?route=customer/customer&user_token=8e33ae554b399bd5846de7e83894aaf7");
        
        Thread.sleep(5000); // Wait for the page to load
   
        // Extract the number of total pages
        String text = driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
        int totalPages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf(" Pages") - 1).trim());
        
        // Iterate through the pages and click
       // for (int p = 1; p <= totalPages; p++) 
        for (int p = 1; p <= 5; p++) 
        {
            if (p > 1) 
            {
                WebElement pageElement = driver.findElement(By.xpath("//ul[@class='pagination']//a[text()='" + p + "']"));
                pageElement.click();
                Thread.sleep(5000); // Wait for the page to load
            }
        }
        
        // reading data from page
        
        int no_of_rows = driver.findElements(By.xpath("//table[@class ='table table-bordered table-hover']//tbody//tr")).size();
        
        for(int r=1; r<no_of_rows;r++)
        {
            String customer_name = driver.findElement(By.xpath("//table[@class ='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
        
            String E_mail =  driver.findElement(By.xpath("//table[@class ='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
                               
            String  status  =  driver.findElement(By.xpath("//table[@class ='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
            
            System.out.println(customer_name +"\t"+E_mail+"\t"+status);
        }
        
        Thread.sleep(3000);
        driver.quit();
        }
}

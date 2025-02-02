package date_Pickers_Handling;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Pickers_Using_Another_Logic 
{
    // Method to convert month name to Month object 
    static Month convertMonth(String month) 
    {
        HashMap<String, Month> monthMap = new HashMap<>();
        monthMap.put("January", Month.JANUARY);
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);
        
        Month vmonth = monthMap.get(month);
        
        if (vmonth == null) 
        {
            System.out.println("Invalid month...");
        }
        
        return vmonth;
    }
    
    // Method to select a date
    static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDate) 
    {
        // Clicking on year dropdown and selecting year
        WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText(requiredYear);
        
        // Selecting month
        while (true) 
        {
            String displayedMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            
            // Converting required month and current month into Month objects
            Month expectedMonth = convertMonth(requiredMonth);
            Month currentMonth = convertMonth(displayedMonth);
            
            // Compare months
            int result = expectedMonth.compareTo(currentMonth);
            
            // Navigation based on comparison result
            if (result < 0) 
            {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            } 
            else if (result > 0) 
            {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
            else 
            {
                break;
            }
        }
        
        // Selecting the date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        
        for (WebElement dt : allDates) 
        {
            if (dt.getText().equals(requiredDate)) 
            {
                dt.click();
                break;
            }
        }
    }
    public static void main(String[] args) throws InterruptedException 
    {
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://testautomationpractice.blogspot.com/");
        
        Thread.sleep(5000);
        
        // Input DOB
        String requiredYear = "2023";
        String requiredMonth = "May";
        String requiredDate = "23";
        
        // Switching to iframe
        driver.switchTo().frame("frame-one796456169");
        
        // Clicking on calendar symbol
        driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

        // Select the date
        selectDate(driver, requiredYear, requiredMonth, requiredDate);
        
        Thread.sleep(5000);
        driver.quit(); 
    }
}

package webElement_Methods;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_Method {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable (adjust the path as needed)
     

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
        // Navigate to the desired URL
        driver.get("https://www.selenium.dev/downloads/");
        
        // Wait for the page to load completely
        Thread.sleep(5000);
        
        // Find the WebElement
        WebElement downloads = driver.findElement(By.xpath("//span[text() ='Downloads']"));
        
        // Get the location of the WebElement
      //  Point location = downloads.getLocation();
        
        // Retrieve X and Y coordinates
       // int x = location.getX();
      //  int y = location.getY();
        
        // Print the coordinates
     //   System.out.println("X axis: " + x + "  Y axis: " + y);
        
        // Close the browser
        driver.quit();
    }
}

package WaitsInSelenium1;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Using FluentWait
        /*
         Wait<WebDriver> wait = new FluentWait<>(driver)  // ✅ Correct Usage
                .withTimeout(Duration.ofSeconds(30))  // Max wait time
                .pollingEvery(Duration.ofSeconds(2))  // Check every 2 seconds
                .ignoring(NoSuchElementException.class);

        // Wait for username field & enter text
        WebElement username = wait.until(driver1 -> driver1.findElement(By.xpath("//input[contains(@name, 'username')]")));
        username.sendKeys("Admin");

        // Wait for password field & enter text
        WebElement password = wait.until(driver1 -> driver1.findElement(By.xpath("//input[contains(@name, 'password')]")));
        password.sendKeys("admin123");

        // Wait for login button & click
        WebElement loginButton = wait.until(driver1 -> driver1.findElement(By.xpath("//button[contains(@type, 'submit')]")));
        loginButton.click();

        // Wait until the title contains "OrangeHRM"
        wait.until(driver1 -> driver1.getTitle().contains("OrangeHRM"));

        // Click on "Admin" tab
        WebElement adminTab = wait.until(driver1 -> driver1.findElement(By.xpath("//span[text() = 'Admin']")));
        adminTab.click();
     */
        
        // Close browser
        driver.quit();
	}

}

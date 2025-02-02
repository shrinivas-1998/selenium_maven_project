package TestNG_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRM_Test {

    WebDriver driver;

    @BeforeClass
    public void setUp() 
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }

    @Test(priority = 1)
    public void openApplication() 
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 2)
    public void testLogo() 
    {
        boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isDisplayed();
        System.out.println("Logo is displayed: " + status);
    }

    @Test(priority = 3)
    public void testLogin() throws InterruptedException 
    {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(2000);  // Reduced sleep time for better practice
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        Thread.sleep(2000);  // Reduced sleep time for better practice
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    }

    @AfterClass
    public void tearDown() throws InterruptedException 
    {
        Thread.sleep(2000);  // Reduced sleep time for better practice
        driver.quit();
    }
}

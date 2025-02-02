package Page_Object_Model_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest2 
{
	WebDriver driver;
    @BeforeClass
    public void setup()
    {
    	  driver = new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    
    @Test
    public void testLogin()
    {
    	  LoginPage1 lp1 = new LoginPage1(driver);
    	  lp1.setUser("admin");
    	  lp1.setPassword("Admin123");
    	  lp1.clickLogin();  
    }
    
    @AfterClass
    public void teardown()
    {
    	driver.quit();
    }
}

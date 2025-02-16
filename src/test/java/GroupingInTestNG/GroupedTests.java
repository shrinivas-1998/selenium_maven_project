package GroupingInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupedTests 
{
	WebDriver driver;

    @BeforeClass
    public void setUp() 
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(groups = {"smoke", "login"})
    public void loginTest() 
    {
        System.out.println("Executing Login Test (Smoke & Login Group)");
        // Perform login actions (Page Object Model recommended)
    }

    @Test(groups = {"regression", "admin"})
    public void adminDashboardTest() 
    {
        System.out.println("Executing Admin Dashboard Test (Regression & Admin Group)");
        // Perform admin dashboard verification
    }

    @Test(groups = {"sanity", "user"})
    public void userProfileTest() 
    {
        System.out.println("Executing User Profile Test (Sanity & User Group)");
        // Perform user profile verification
    }

    @AfterClass
    public void tearDown() 
    {
        if (driver != null) 
        {
            driver.quit();
        }
    }
}

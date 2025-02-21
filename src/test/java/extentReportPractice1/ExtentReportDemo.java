package extentReportPractice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo 
{
	ExtentReports extentReports;

	@BeforeTest
	public void reportConfiguration() 
	{
		// Methods used for generating Extent reports: ExtentReports,
		// ExtentSparkReporter
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		// Report configurations for the spark reporter
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");

		extentReports = new ExtentReports();
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Tester", "Shrinivas Bodhale");
	}

	@Test
	public void initialDemo() throws InterruptedException 
	{
		// Create test instance for reporting
		ExtentTest test = extentReports.createTest("Initial Demo");

		// Initialize WebDriver and open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		test.info("Browser Launched Successfully.");

		// Maximizing window, setting timeout, and opening the URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com");
		test.info("Navigated to the URL: https://rahulshettyacademy.com");

		// Getting title of the page
		String title = driver.getTitle();
		test.info("Page title: " + title);

		// Add assertion or step to validate page title
		if (title.equals("Expected Title")) 
		{
			test.pass("Title matches the expected result.");
		} 
		else 
		{
			test.fail("Title does not match the expected result.");
		}

		// Example of intentional failure for demonstration
		test.fail("Intentionally failing the test for demonstration.");

		// Cleanup: Quit the driver
		Thread.sleep(5000);
		driver.quit();
		test.info("Browser closed.");
		extentReports.flush(); // Writing the results to the report
	}
}

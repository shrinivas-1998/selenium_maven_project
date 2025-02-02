package testNG_Framework_Listeners_And_Extent_Report_Generation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
    private ExtentSparkReporter sparkReporter; // UI of the report
    private ExtentReports extent; // Populate common info on the report
    private ExtentTest test; // Create test case entries in the report and update status of the methods

    @Override
    public void onStart(ITestContext context) {
        // Initialize ExtentSparkReporter and configure it
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myreport.html");
        sparkReporter.config().setDocumentTitle("Automation Report"); // Title of the report
        sparkReporter.config().setReportName("Functional Testing"); // Name of the report
        sparkReporter.config().setTheme(Theme.DARK);

        // Initialize ExtentReports and attach the reporter
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // Set system info for the report
        extent.setSystemInfo("Computer Name", "localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", "Shrinivas");
        extent.setSystemInfo("OS", "Windows 11");
        extent.setSystemInfo("Browser Name", "Chrome");
    }

   // @Override
    public void onTestSuccess(ITestResult result) 
    {
        test = extent.createTest(result.getMethod().getMethodName()); // Create a new entry in report
        test.log(Status.PASS, "Test case passed: " + result.getMethod().getMethodName()); // Update status
    }

  //  @Override
    public void onTestFailure(ITestResult result) 
    {
        test = extent.createTest(result.getMethod().getMethodName());
        test.log(Status.FAIL, "Test case failed: " + result.getMethod().getMethodName());
        test.log(Status.FAIL, "Failure cause: " + result.getThrowable());
    }

   // @Override
    public void onTestSkipped(ITestResult result) 
    {
        test = extent.createTest(result.getMethod().getMethodName());
        test.log(Status.SKIP, "Test case skipped: " + result.getMethod().getMethodName());
    }

   // @Override
    public void onFinish(ITestContext context) 
    {
        extent.flush();
    }
}

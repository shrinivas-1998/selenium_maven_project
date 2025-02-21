package testNGListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener 
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Failed: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Passed: " + result.getName());
	}
}

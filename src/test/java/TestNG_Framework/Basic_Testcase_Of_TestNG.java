package TestNG_Framework;

import org.testng.annotations.Test;

public class Basic_Testcase_Of_TestNG 
{
          // 1) Open the application
	      // 2) login to the application
	      // 3) logout from the application 
	@Test
	public void OpenApplication()
	{
		System.out.println("application is opened...");
	}
	
	@Test

	public void Login()
	{
		System.out.println("logged into application...");
	}
	
	@Test

	public void Logout()
	{
		System.out.println("Logout from application...");
	}
} 

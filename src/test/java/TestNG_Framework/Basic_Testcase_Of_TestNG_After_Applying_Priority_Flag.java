package TestNG_Framework;

import org.testng.annotations.Test;

public class Basic_Testcase_Of_TestNG_After_Applying_Priority_Flag 
{
	// 1) Open the application
    // 2) login to the application
    // 3) logout from the application 
	
@Test(priority = 1)
public void OpenApplication()
{
	System.out.println("application is opened...");
}

@Test(priority = 2)

public void Login()
{
	System.out.println("logged into application...");
}

@Test(priority = 3)

public void Logout()
{
	System.out.println("Logout from application...");
}

}

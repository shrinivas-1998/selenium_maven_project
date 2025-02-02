package testNG_Framework_Dependency_Methods_and_Grouping_Tests;

import org.testng.annotations.Test;

public class Login_Tests 
{
     @Test(priority = 1, groups = {"sanity"}) 
     public void LoginByeMail()
     {
    	 System.out.println("This is login by email id...");
     }
     
     @Test(priority = 2, groups = {"sanity"}) 
     public void LoginByFaceBook()
     {
    	 System.out.println("This is login by Facebook...");
     }
     
     @Test(priority = 3, groups = {"sanity"}) 
     public void LoginByTwitter()
     {
    	 System.out.println("This is login by Twitter...");
     }
}

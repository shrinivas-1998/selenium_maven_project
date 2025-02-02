package testNG_Framework_Dependency_Methods_and_Grouping_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_Methods 
{
       @Test(priority = 1)
       public void openapp()
       {
    	   Assert.assertTrue(true);
       }
       
       @Test(priority = 2, dependsOnMethods ={"openapp"})
       public void Login()
       {
    	   Assert.assertTrue(false);
       }
       
       @Test(priority = 3, dependsOnMethods ={"openapp", "Login"})
       public void Search()
       {
    	   Assert.assertTrue(true);
       }
       
       @Test(priority = 4, dependsOnMethods = {"Login", "Search"})
       public void AdvaceSearch()
       {
    	   Assert.assertTrue(true);
       }
       
       @Test(priority = 5, dependsOnMethods = {"Login"})
       public void Logout()
       {
    	   Assert.assertTrue(true);
       }    
}

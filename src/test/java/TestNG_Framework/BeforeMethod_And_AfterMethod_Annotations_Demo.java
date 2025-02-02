package TestNG_Framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
  1) Login ------> @BeforeMethod
  2) search ------> @Test
  3) Logout ------> @AfterMethod
  4) Login
  5) Advanced Search  -------> @Test
  6) Logout 
*/

public class BeforeMethod_And_AfterMethod_Annotations_Demo 
{
  @BeforeMethod
  public void Login() 
  {
	  System.out.println("This is login... ");
  }
  
  @Test(priority = 1)
  public void Serch()
  {
	  System.out.println("This is Search...");
  }
  
  @Test(priority = 2)
  public void AdvancedSerch()
  {
	  System.out.println("This is Advanced Search...");
  }
  
  @AfterMethod
  public void LogOut() 
  {
	  System.out.println("This is logOut... ");
  }
}

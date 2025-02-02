package TestNGByUdemey;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginForLoans 
{
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("It will get exceuted before any method get exceuted in class");
	}
  @Test
  public void WebLoginCarLoan() 
  {
	  // selenium
	  System.out.println("WebloginCar");
  }
  
  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("I'm the first from above");
  }
  
  @BeforeTest
  public void beforetest()
  {
	  System.out.println("I will get executed before test");
  }
  
  @Test(timeOut = 4000) // helper Attribute
  public void MobileLoginCarLoan() 
  {
	  // Appium
	  System.out.println("MobileloginCar");
  }
  
  @BeforeMethod
  public void BeforeMethod()
  {
	  System.out.println("I will get executed before every method in class");
  }
  
  @BeforeMethod
  public void AfterMethod()
  {
	  System.out.println("I will get executed after every method in class");
  }
  
  @Test(groups = {"smoke"})
  public void MobileLoginCarLoan1() 
  {
	  // Appium
	  System.out.println("MobileloginCar1");
  }
  
  @Test(dependsOnMethods = {"MobileLoginCarLoan"}) // helper Attribute
  public void MobileLoginCarLoan2() 
  {
	  // Appium
	  System.out.println("MobileloginCar2");
  }
  
  @Test(dependsOnMethods = {"MobileLoginCarLoan", "MobileLoginCarLoan2"}) // helper Attribute
  public void LoginAPICarLoan() 
  {
	  // Rest API car loan 
	  System.out.println("LoginAPIloginCar");
  } 
  
  @AfterClass
	public void AfterClass()
	{
		System.out.println("It will get exceuted after all methods get exceuted in class");
	}
  
  @AfterTest
  public void AfterTest()
  {
	  System.out.println("i will get executed after test");
  }
  
  public void AfterSuite()
  {
	  System.out.println("I,m the first from last");
  }
}

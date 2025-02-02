package TestNG_Framework_all_In_One_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_In_One_Annotations 
{
  @BeforeSuite
  public void bs()
  {
	  System.out.println("This is the @BeforeSuite method ....");
  }
  
  @AfterSuite
  public void as()
  {
	  System.out.println("This is the @AfterSuite method ...");
  }
  
  @BeforeTest
  public void bt()
  {
	  System.out.println("This is the @BeforeTest Method....");
  }
  
  @AfterTest
  public void at()
  {
	  System.out.println("This is the @AfterTest Method....");
  }
  
  
  @BeforeClass
  public void BC()
  {
	  System.out.println("This is the @BeforeClass Method....");
  }
  
  @AfterClass
  public void AC()
  {
	  System.out.println("This is the @AfterClass Method....");
  }
  
  @BeforeMethod
  public void BM()
  {
	  System.out.println("This is the  @BeforeMethod method....");
  }
  
  @AfterMethod
  public void AM()
  {
	  System.out.println("This is the  @AfterMethod method....");
  }
  
  @Test(priority = 1)
  public void tm1()
  {
	  System.out.println("This is the test method tm1...");
  }
  
  @Test(priority = 2)
  public void tm2()
  {
	  System.out.println("This is the test method tm2...");
  } 
}

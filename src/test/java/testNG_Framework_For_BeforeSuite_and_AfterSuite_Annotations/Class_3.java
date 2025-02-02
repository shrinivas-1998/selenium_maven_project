package testNG_Framework_For_BeforeSuite_and_AfterSuite_Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class_3 
{
  @Test
  public void PQR() 
  {
	  System.out.println("This is PQR from class_3...");
  }
  
  @BeforeSuite
  public void Bs()
  {
	  System.out.println("This is the @BeforeSuite Method...");
  }
  
  @AfterSuite
  public void AS()
  {
	  System.out.println("This the @AfterSuite Method....");
  }
  
}

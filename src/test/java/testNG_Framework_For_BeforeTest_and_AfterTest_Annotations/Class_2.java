package testNG_Framework_For_BeforeTest_and_AfterTest_Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class_2 
{
  @Test
  public void xyz() 
  {
	  System.out.println("This xyz from class_2....");
  }
  
  @AfterTest()
  public void at()
  {
	  System.out.println("This is  @AfterTest Method");
  }
}

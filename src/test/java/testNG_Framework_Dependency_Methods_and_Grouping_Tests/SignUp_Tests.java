package testNG_Framework_Dependency_Methods_and_Grouping_Tests;

import org.testng.annotations.Test;

public class SignUp_Tests 
{
  @Test(priority = 1, groups = {"regression"})
  public void SignUpByEmail()
  {
	  System.out.println("This is signup by Email....");
  }
  
  @Test(priority = 2, groups = {"regression"})
  public void SignUpByFaceBook()
  {
	  System.out.println("This is signup by FaceBook....");
  }
  
  @Test(priority = 3, groups = {"regression"})
  public void SignUpByTwitter()
  {
	  System.out.println("This is signup by Twitter....");
  }
}

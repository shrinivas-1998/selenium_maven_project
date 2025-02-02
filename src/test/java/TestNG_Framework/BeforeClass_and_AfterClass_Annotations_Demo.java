package TestNG_Framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
1) Login ------> @BeforeClass
2) search ------> @Test
3) Advanced Search  -------> @Test
4) Logout -----> @AfterClass
*/

public class BeforeClass_and_AfterClass_Annotations_Demo  
{
	@BeforeClass
	public void Login()
	{
		System.out.println("This is login....");
	}
	
@Test(priority=1)
  public void Search() 
  {
	  System.out.println("This is Search....");
  }
  
  @Test(priority=2)
  public void AdvancedSearch() 
  {
	  System.out.println("This is Advanced Search....");
  }
  
  @AfterClass
	public void LogOut()
	{
		System.out.println("This is logOut....");
	}
}

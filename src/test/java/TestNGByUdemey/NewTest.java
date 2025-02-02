package TestNGByUdemey;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest 
{ 
	@Test
	public void listeners()
	{
		System.out.println("I'm the Listeners class");
		Assert.assertTrue(false);
	}
  @Test(groups = {"smoke"})
  public void Demo() {
    System.out.println("hi TestNG");
  }
  
  @Parameters({"URL", "APIkey"}) // Matches parameters from the XML
  @Test
  public void parameters(String urlname1, String key) 
  {
    System.out.println(urlname1); // Prints the value of the "URL" parameter
    System.out.println(key);     // Prints the value of the "APIkey" parameter
  }
  
  @Test(dataProvider = "gerData")
  public void secondTest(String username, String Password) 
  {
    System.out.println("hello ....");
    System.out.println(username);
    System.out.println(Password);
  }
  
  @DataProvider()
  public Object[][] gerData()
  {
	  // first combination : username password - good credit history- row
	  // second combination : username password - NO credit history- row
	  // Third combination : fraud credit history
	  Object[][] data = new  Object[3][2] ;
	  
	  // first set 
	  data[0][0] = "FirstUsername";
	  data[0][1] = "FirstPassword";
	  
	  // second set 
	  data[1][0] = "SecondUsername";
	  data[1][1] = "SecondPassword";
	  
	  // Third set 
	  data[2][0] = "ThirdUsername";
	  data[2][1] = "ThirdPassword";
	  
	  return data;  
  }
}
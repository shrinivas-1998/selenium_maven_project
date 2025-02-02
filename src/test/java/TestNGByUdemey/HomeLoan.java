package TestNGByUdemey;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class HomeLoan 
{
	@Parameters({"URL"})
	@Test
	public void Parameterisation(String urlname)
	{
		System.out.println(urlname);
	}
	@Test(groups = {"smoke"})
	  public void WebLoginHomeLoan() 
	  {
		  // selenium
		  System.out.println("WebLoginHomeLoan");
	  }
	  
	  @Test(enabled=false) // Helper attribute 
	  public void MobileLoginHomeLoan() 
	  {
		  // Appium
		  System.out.println("MobileLoginHomeLoan");
	  }
	  
	  @Test(groups = {"smoke"})
	  public void LoginAPIHomeLoan() 
	  {
		  // Rest API car loan 
		  System.out.println("LoginAPIHomeLoan");
	  }
}

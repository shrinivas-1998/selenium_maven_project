package Page_Object_Model_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
       // Constructor 
	      LoginPage(WebDriver driver)
	      {
	    	  this.driver = driver;
	      }
	
	  // Locators
	
	      By  txt_Username_Loc = By.xpath("//input[@placeholder = 'Username']");
	      By  txt_passowrd_Loc = By.xpath("//input[@placeholder = 'Password']");
	      By  btn_login_Loc = By.xpath("//button[text() = ' Login ']");
	
	  // Action Methods 
	      
	      public void setUser(String username)
	      {
	    	  driver.findElement(txt_Username_Loc);
	      }
	
    	 public void setPassword(String password)
	     {
		       driver.findElement(txt_passowrd_Loc);
	     }
    	  
    	 public void clickLogin()
    	 {
    		 driver.findElement(btn_login_Loc);
    	 }
}

package Page_Object_Model_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 
{
	   WebDriver driver;
	   
	   // Constructor 
	   
      public LoginPage1(WebDriver driver)
       {
    	   this.driver = driver;
    	   PageFactory.initElements(driver, this); // mandatory 
       }
       
       // locators 
       
       @FindBy(xpath = "//input[@placeholder = 'Username']") 
       WebElement txt_username;
       
      /* @FindBy(how=How.XPATH, using = "//input[@placeholder = 'Username']") 
       WebElement txt_username1;*/
       
       
       @FindBy(xpath = "//input[@placeholder = 'Password']") 
       WebElement txt_passord;
       
       @FindBy(xpath = "//button[text() = ' Login ']") 
       WebElement btn_login;
       
       // Actions 
       
       public void setUser(String username)
	      {
    	     txt_username.sendKeys(username);
	      }
	
 	   public void setPassword(String password)
	     {
 		    txt_passord.sendKeys(password);
	     }
 	  
 	   public void clickLogin()
 	    {
 		btn_login.click();
 	    }     
}

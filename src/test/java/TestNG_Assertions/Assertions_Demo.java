package TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_Demo 
{
     @Test
     public void testTitle()
     {
    	 String expecterd_Title = "opencart";
    	 String Actual_Title = "openshort";
    	
    	 /*
    	 if (expecterd_Title.equals(Actual_Title))
    	 {
    		 System.out.println("TEST passed...");
    	 }
    	 
    	 else
    	 {
    		 System.out.println("TEST failed ");
    	 }
       */
    	 
    	// Assert.assertEquals(expecterd_Title, Actual_Title);
    	 
    	 if (expecterd_Title.equals(Actual_Title))
    	 {
    		 System.out.println("TEST passed...");
    		 Assert.assertTrue(true);
    	 }
    	 else
    	 {
    		 System.out.println("TEST failed ");
    		 Assert.assertTrue(false);
    	 }
     }
}

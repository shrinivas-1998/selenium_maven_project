package TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion_Demo 
{
    @Test
    public void Test()
    {
    	//Assert.assertEquals("123", 123); // failed 
    	
    	//Assert.assertEquals("123", "xyz"); // failed
    	
    	//Assert.assertEquals(123, 345); //failed
    	
        // Assert.assertTrue(true); // pass
         
        // Assert.assertTrue(1==2); // failed
         
    	//Assert.assertTrue(1==1); // passed
    	
    	//Assert.assertTrue(false); // failed
    	
    	Assert.assertTrue(true); // passed
         
    	
    	
    	
    	
    	
    	
    }
}

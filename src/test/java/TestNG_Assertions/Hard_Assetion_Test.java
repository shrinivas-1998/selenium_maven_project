package TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assetion_Test 
{
	@Test
    public void testHardAssertion() 
	{
        int actual = 5;
        int expected = 10;
        
        Assert.assertEquals(actual, expected); // This will cause the test to fail 
        
        // This print statement will not executed if above assertion fails 
        
        System.out.println("This will not print if assertion fails");
    }
}

package AssertionsInTestNGPractice1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	@Test
   public void testSoftAssertion()
   {
	   SoftAssert sa = new SoftAssert();
	   
	   int actual_value = 10;
	   int expected_value = 23;
	   
	   sa.assertEquals(actual_value, expected_value);
	   
	   String str = "hello";
	   sa.assertNull(str);
	   
	   System.out.println("This print ststement will get printed after softassertion execution fails");
	   
	   sa.assertAll(); 
   }
}

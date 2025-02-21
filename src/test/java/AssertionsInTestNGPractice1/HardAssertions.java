package AssertionsInTestNGPractice1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions 
{
    @Test
	public void testhardAssertion()
	{
		int actual = 4;
		int expected = 5;
		Assert.assertEquals(actual, expected);
		System.out.println("This print statement will not be print if assetion fails");	
	}
}

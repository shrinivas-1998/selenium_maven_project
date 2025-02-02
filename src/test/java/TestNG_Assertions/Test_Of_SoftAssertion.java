package TestNG_Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Of_SoftAssertion 
{
    @Test
    public void testSoftAssertion() {
        SoftAssert softAssert = new SoftAssert();

        int actual = 5;
        int expected = 10;
        softAssert.assertEquals(actual, expected);  // This will not stop the test

        // More assertions can follow
        String str = "Hello";
        softAssert.assertNull(str);

        // Print statements can still be executed
        System.out.println("This will print even if the soft assertion fails.");

        // At the end of the test, call assertAll to report any failed assertions
        softAssert.assertAll();
    }
}

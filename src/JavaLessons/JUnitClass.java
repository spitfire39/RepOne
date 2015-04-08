package JavaLessons;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
//import org.testng.Assert; --- incorrect import for Assertion
import org.junit.Assert; // --- correct import for Assertion

@RunWith(JUnit4.class)
public class JUnitClass
{
    @Test
    public void test1()
    {
        Assert.fail();
    }
    @Test
    public void test2()
    {
        int a = 10;
        int b = 6;
        int expectedResult = 15;
        // --- "assertEquals" allows to compare values in statement (value1 , value2)
        Assert.assertEquals("Expected results are incorrect: ", expectedResult, a + b);
        Assert.assertTrue(expectedResult == (a + b));
    }
    @Test
    public void test4()
    {
        int a = 10;
        int b = 6;
        int expectedResult = 15;
        Assert.assertTrue(expectedResult == (a + b));
    }
    @Test
    public void test3()
    {
        int a [] = {1, 2, 3};
        int b [] = {1, 2, 3};
        // --- there is no need to use "if" with "assertEquals", cause assert displays test result as passed or failed
        Assert.assertEquals(a, b);
    }
}

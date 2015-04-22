package JavaLessons;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordVerificationTest_Tests
{
//    @Before
//    public void start()
//    {
//        PasswordVerificationTest_MainFunctions.openBrowser();
//    }

    @Test
    public void passwordVerification() throws InterruptedException
    {
        PasswordVerificationTest_Path.field = "Your master password";
        PasswordVerificationTest_MainFunctions.openBrowser();
        PasswordVerificationTest_MainFunctions.setField(PasswordVerificationTest_Path.field = "Your master password");
        PasswordVerificationTest_MainFunctions.setField();
        PasswordVerificationTest_MainFunctions.getField();
        String expectedResult = "HFgKgXrqRuyRG@1a";
        Assert.assertEquals(expectedResult, PasswordVerificationTest_Path.value);
    }
    @After
    public void driverQuit() throws InterruptedException
    {
        Thread.sleep(2000);
        PasswordVerificationTest_Path.driver.quit();
    }
}

package JavaLessons;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLogin
{
    //--- use this to run in Chrome browser
    @Before
    public void startBrowserChrome()
    {
        LoginObject.openBrowserChrome("http://www.openforbeta.com/",  "c:/Work/workspace/WebDriverProject/chromedriver.exe");
    }
    //--- use this to run in FireFox browser
//    @Before
//    public void startBrowserFireFox()
//    {
//        LoginObject.openBrowserFireFox("http://www.openforbeta.com/");
//    }

    //--- positive test, login and verify that login was successfull
    @Test
    public void login()
    {
        Assert.assertEquals("Open for Beta", LoginObject.getPageTitle());
        LoginObject.setLogin("qwa", "qwa");
        Assert.assertEquals("qwa", LoginObject.getLoginName("qwa"));
    }
    //--- negative test, login with empty fields
    @Test
    public void negativeLogin1()
    {
        LoginObject.setLogin("", "");
        Assert.assertEquals("Error: Register before submission.", LoginObject.getErrorMessage());
    }
    //--- negative test, login with empty password
    @Test
    public void negativeLogin2()
    {
        LoginObject.setLogin("qwa", "");
        Assert.assertEquals("Error: Password not entered.", LoginObject.getErrorMessage());
    }
    //--- negative test, login with empty user_name field
    @Test
    public void negativeLogin3()
    {
        LoginObject.setLogin("", "qwa");
        Assert.assertEquals("Error: Register before submission.", LoginObject.getErrorMessage());
    }
    //--- negative test, login with not existing user
    @Test
    public void negativeLogin4()
    {
        LoginObject.setLogin("ksdfisdnfosdf", "oisdfiosdufsdf");
        Assert.assertEquals("Error: Wrong username/password combination.", LoginObject.getErrorMessage());
    }
    @After
    public void closeBrowser()
    {
        LoginObject.driver.close();
    }

}

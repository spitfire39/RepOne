package OpenForBeta;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSignUp
{
    //--- use this to run in Chrome browser
    @Before
    public void startBrowserChrome()
    {
        SignupObject.openBrowserChrome("http://www.openforbeta.com/signup", "c:/Work/workspace/WebDriverProject/chromedriver.exe");
    }
    //--- use this to run in FireFox browser
//    @Before
//    public void startBrowserFireFox()
//    {
//        LoginObject.openBrowserFireFox("http://www.openforbeta.com/");
//    }

    @Test
    //--- negative signUp with empty captcha
    public void signUp1()
    {
        Assert.assertEquals("Open for Beta - Sign up", SignupObject.getPageTitle());
        SignupObject.setSignUpData("User_name", "User_pwd", "User_pwd", "User_mail@a.com", "Female");
        Assert.assertEquals("Error: Image code wrong, please try again.", SignupObject.getErrorMessage());
    }
    //--- negative signUp with empty fields
    @Test
    public void signUp2()
    {
        Assert.assertEquals("Open for Beta - Sign up", SignupObject.getPageTitle());
        SignupObject.setSignUpData("", "", "", "", "Female");
        Assert.assertEquals("Error: Register before submission.", SignupObject.getErrorMessage());
    }
    //--- negative signUp with existing user name
    @Test
    public void signUp3()
    {
        Assert.assertEquals("Open for Beta - Sign up", SignupObject.getPageTitle());
        SignupObject.setSignUpData("a", "", "", "", "Female");
        Assert.assertEquals("Error: The username you entered is already taken.", SignupObject.getErrorMessage());
    }
    //--- negative signUp with different passwords
    @Test
    public void signUp4()
    {
        Assert.assertEquals("Open for Beta - Sign up", SignupObject.getPageTitle());
        SignupObject.setSignUpData("User_name", "User_pwd", "User_pwd_upd", "", "Female");
        Assert.assertEquals("Error: The password you entered does not match the confirm password.", SignupObject.getErrorMessage());
    }
    //--- negative signUp with empty Email
    @Test
    public void signUp5()
    {
        Assert.assertEquals("Open for Beta - Sign up", SignupObject.getPageTitle());
        SignupObject.setSignUpData("User_name", "User_pwd", "User_pwd", "", "Female");
        Assert.assertEquals("Error: Please enter your e-mail address.", SignupObject.getErrorMessage());
    }

    @After
    public void closeBrowser()
    {
        SignupObject.driver.close();
    }

}

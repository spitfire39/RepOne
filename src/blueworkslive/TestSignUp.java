package blueworkslive;

import OpenForBeta.SignupObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSignUp
{
    @Test
    //--- update path to ChromeDriver before execute
    public void signUp2() throws Exception {
        //--- populate all mandatory fields
        ObjectSignUp o = new ObjectSignUp("https://www.blueworkslive.com/"
                , "c:/Work/workspace/WebDriverProject/chromedriver.exe"
                , "Company Name"
                , "First Name"
                , "Last Name"
                //--- update email to create new account
                , "5@gmail.com"
                , "+380505050555"
                , "Job Title"
                , "Ukraine");
        //--- verify that some of populated fields is correct
        Assert.assertEquals("Company Name", o.getCompanyName());
        //--- confirm accoutn creation
        o.pressCreateAccountBtn();
        //--- verify that account has been craeted
        Assert.assertEquals("Confirming Account Creation", o.getValidationResults());
    }
    @After
    public void closeBrowser()
    {
        ObjectSignUp.driver.close();
    }

}


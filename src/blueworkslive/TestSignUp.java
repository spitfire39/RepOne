package blueworkslive;

import OpenForBeta.SignupObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSignUp
{
    @Test
    public void signUp2() throws Exception {
        ObjectSignUp o = new ObjectSignUp("https://www.blueworkslive.com/"
                , "c:/Work/workspace/WebDriverProject/chromedriver.exe"
                , "Company Name"
                , "First Name"
                , "Last Name"
                , "5@gmail.com"
                , "+380505050555"
                , "Job Title"
                , "Ukraine");
        Assert.assertEquals("Company Name", o.getCompanyName());
        o.pressCreateAccountBtn();
        Assert.assertEquals("Confirming Account Creation", o.getValidationResults());
    }
    @After
    public void closeBrowser()
    {
        ObjectSignUp.driver.close();
    }

}


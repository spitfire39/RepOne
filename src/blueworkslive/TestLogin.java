package blueworkslive;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestLogin {
    @Test
    //--- update path to ChromeDriver before execute
    public void login() throws Exception {
        //--- execution of login actions
        ObjectLogin o = new ObjectLogin("https://www.blueworkslive.com/"
                , "c:/Work/workspace/WebDriverProject/chromedriver.exe"
                , "automation.user.smtp@gmail.com"
                , "qwerty1234");
        //--- verification that we've login by corresponding user
        Assert.assertEquals("automation.user.smtp@gmail.com", o.getAdminInfo());
        //--- log out
        o.pressLogOut();
    }
    @After
    public void closeBrowser()
    {
        ObjectSignUp.driver.close();
    }
}

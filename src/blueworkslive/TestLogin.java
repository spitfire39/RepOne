package blueworkslive;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestLogin {
    @Test
    public void login() throws Exception {
        ObjectLogin o = new ObjectLogin("https://www.blueworkslive.com/"
                , "c:/Work/workspace/WebDriverProject/chromedriver.exe"
                , "automation.user.smtp@gmail.com"
                , "qwerty1234");
        Assert.assertEquals("automation.user.smtp@gmail.com", o.getAdminInfo());
        o.pressLogOut();
    }
    @After
    public void closeBrowser()
    {
        ObjectSignUp.driver.close();
    }
}

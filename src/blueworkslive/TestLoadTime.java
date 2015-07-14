package blueworkslive;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestLoadTime {
    @Test
    //--- update path to ChromeDriver before execute
    public void LoadTime() throws Exception {
        ObjectLogin o = new ObjectLogin("https://www.blueworkslive.com/"
                , "c:/Work/workspace/WebDriverProject/chromedriver.exe"
                , "automation.user.smtp@gmail.com"
                , "qwerty1234");
        //--- get laoding time for each tab
        o.getWorkTab();
        o.getCommunityTab();
        o.getLibraryTab();
    }

    @After
    public void closeBrowser()
    {
        ObjectLogin.driver.close();
    }
}

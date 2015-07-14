package blueworkslive;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestLoadTime {
    @Test
    public void LoadTime() throws Exception {
        ObjectLogin o = new ObjectLogin("https://www.blueworkslive.com/"
                , "c:/Work/workspace/WebDriverProject/chromedriver.exe"
                , "automation.user.smtp@gmail.com"
                , "qwerty1234");
        long startTime = System.currentTimeMillis()/1000;
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

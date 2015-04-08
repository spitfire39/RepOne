package JavaLessons;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;

@RunWith(JUnit4.class)
public class TitleVerificationTest
{
    public WebDriver driver;
    @Before // --- run before test
    public void main() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
        Thread.sleep(1000);
        driver.close();
    }
    @Test // --- body of the test
    public void test() throws InterruptedException
    {
        Assert.assertEquals("Password generator", driver.getTitle());
    }
    // --- in case, if test will fail, @After will close browser
    @After
    public void driverQuit()
    {
        driver.quit();
    }
}

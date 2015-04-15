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

public class PasswordVerificationTest2
{
    public static String value;
    public WebDriver driver;
    @Before
    public void openBrowser () throws InterruptedException
    {
        // --- run browser
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        driver = new ChromeDriver();
        // ---    open some page
        driver.get("http://angel.net/~nic/passwd.current.html");
        //driver.get("http://oxogamestudio.com/passwd.current2.htm");
    }
    public void enterMasterPassword (String sitePwd)
    {
        WebElement myPwd = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        myPwd.sendKeys(sitePwd);
    }
    public void enterSiteName (String siteName)
    {
        WebElement mySite = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        mySite.sendKeys(siteName);
    }
    public void generate ()
    {
        WebElement myBtn = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
        myBtn.submit();
    }
    public void getNewPassword ()
    {
        WebElement generatedPassword = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/input"));
        System.out.println(value = generatedPassword.getAttribute("value"));
    }
    public void generateBtn()
    {
        WebElement myBtn = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
        value = myBtn.getAttribute("value");
    }
    public void oldValues()
    {
        WebElement myPwd = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        value = myPwd.getAttribute("value");
    }

    @Test
    public void passwordVerification() throws InterruptedException
    {
        enterMasterPassword("MyMasterPassword");
        enterSiteName("MySiteName");
        generate();
        getNewPassword();
        String expectedResult = "jsTqcMgYxYn1L@1a";
        Assert.assertEquals(expectedResult, value);
    }
    @Test
    public void passwordVerification2() throws InterruptedException
    {
        enterMasterPassword("MyMasterPassword");
        enterSiteName("");
        generate();
        getNewPassword();
        String expectedResult = "OEA0jn6MrLmVw@1a";
        Assert.assertEquals(expectedResult, value);
    }
    @Test
    public void passwordVerification3() throws InterruptedException
    {
        enterMasterPassword("");
        enterSiteName("MySiteName");
        generate();
        getNewPassword();
        String expectedResult = "XXysKtBSIuiOO@1a";
        Assert.assertEquals(expectedResult, value);
    }
    @Test
    public void passwordVerification4() throws InterruptedException
    {
        enterMasterPassword("");
        enterSiteName("");
        generate();
        getNewPassword();
        String expectedResult = "BaefBs8/Z/cm2@1a";
        Assert.assertEquals(expectedResult, value);
    }
    @Test
    public void passwordVerification5() throws InterruptedException
    {
        generateBtn();
        Assert.assertEquals("Generate", value);
    }
    @Test
    public void passwordVerification6() throws InterruptedException
    {
        enterMasterPassword("MyMasterPassword");
        enterSiteName("MySiteName");
        generate();
        oldValues();
        String expectedResult = "MyMasterPassword";
        Assert.assertEquals(expectedResult, value);
    }
    @After
    public void driverQuit() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.quit();
    }
}

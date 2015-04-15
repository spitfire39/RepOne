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

public class PasswordVerificationTest3
{
    public static String value;
    public static boolean isTrue;
    public static String maxVal;
    public WebDriver driver;
    @Before
    public void openBrowser () throws InterruptedException
    {
        // --- run browser
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        driver = new ChromeDriver();
        // ---    open some page
        //driver.get("http://oxogamestudio.com/passwd.current2.htm");
        driver.get("http://oxogamestudio.com/passwd.current3.htm");
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
    public void enterSiteName2 (String siteName2)
    {
        WebElement mySite = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        mySite.sendKeys(siteName2);
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
    public void isLocked()
    {
        WebElement myPwd = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        isTrue = myPwd.isEnabled();
    }
    public void maxValue()
    {
        String j = "";
        for (int i = 0; i < 200; i++)
        {
            maxVal = maxVal + "1";
        }
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
        enterSiteName("MySiteName");
        generate();
        oldValues();
        String expectedResult = "MyMasterPassword";
        Assert.assertEquals(expectedResult, value);
    }
    @Test
    public void passwordVerification3() throws InterruptedException
    {
        enterMasterPassword("MyMasterPassword");
        enterSiteName("MySiteName");
        generate();
        isLocked();
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, isTrue);
    }
    @Test
    public void passwordVerification4() throws InterruptedException
    {
        maxValue();
        enterSiteName2(maxVal);
    }
    @After
    public void driverQuit() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.quit();
    }
}

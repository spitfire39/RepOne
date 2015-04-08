package JavaLessons;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;

@RunWith(JUnit4.class)
public class PasswordVerificationTest
{
    public static String password;
    public WebDriver driver;
    // --- send pwd and site name
    public  void main1() throws InterruptedException
    {
        // --- run browser
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        driver = new ChromeDriver();
        // ---    open some page
        driver.get("http://angel.net/~nic/passwd.current.html");
        //provide data (password and site name) to another function
        MyData(driver, "12345678", "gmail.com");
        Thread.sleep(1000);
        driver.close();
    }
    // --- send empty pwd and site name
    public void main2() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
        MyData(driver, "", "gmail.com");
        Thread.sleep(1000);
        driver.close();
    }
    // --- send pwd and empty site name
    public void main3() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
        MyData(driver, "123456789", "");
        Thread.sleep(1000);
        driver.close();
    }
    // --- verify title
    public void main4() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
        password = driver.getTitle();
        //MyData(driver, "123456789", "");
        Thread.sleep(1000);
        driver.close();
    }
    // --- send empty pwd and empty site name
    public void main5() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
        MyData(driver, "", "");
        Thread.sleep(1000);
        driver.close();
    }
    // --- verify submit btn name
    public void main6() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
        WebElement buttonName = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
        password = buttonName.getAttribute("value");
        Thread.sleep(1000);
        driver.close();
    }
    // --- type password, type site name, get generated password
    public static void MyData(WebDriver newDriver, String pwd, String site)
    {

        WebElement myPwd = newDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        myPwd.sendKeys(pwd);
        WebElement mySite = newDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        mySite.sendKeys(site);
        WebElement myBtn = newDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
        myBtn.submit();
        WebElement generatedPassword = newDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/input"));
        System.out.println(password = generatedPassword.getAttribute("value"));
    }

    // --- TESTS: compare generated password with expected result
    @Test
    public void passwordVerification1() throws InterruptedException
    {
        // --- use method "main"
        main1();
        String expectedResult = "W3Hdka0clbEI+@1a";
        Assert.assertEquals(expectedResult, password);
    }
    @Test
    public void passwordVerification2() throws InterruptedException
    {
        // --- use method "main"
        main2();
        String expectedResult = "zmcHOAyf2oZm+@1a";
        Assert.assertEquals(expectedResult, password);
    }
    @Test
    public void passwordVerification3() throws InterruptedException
    {
        // --- use method "main"
        main3();
        String expectedResult = "IYdpnqxVxT98+@1a";
        Assert.assertEquals(expectedResult, password);
    }
    @Test
    public void passwordVerification4() throws InterruptedException
    {
        // --- use method "main"
        main4();
        String expectedResult = "Password generator";
        Assert.assertEquals(expectedResult, password);
    }
    @Test
    public void passwordVerification5() throws InterruptedException
    {
        // --- use method "main"
        main5();
        String expectedResult = "BaefBs8/Z/cm2@1a";
        Assert.assertEquals(expectedResult, password);
    }
    @Test
    public void passwordVerification6() throws InterruptedException
    {
        // --- use method "main"
        main6();
        String expectedResult = "Generate";
        Assert.assertEquals(expectedResult, password);
    }
    @After // --- need only one @After and one @Before for multiple tests
    public void driverQuit()
    {
        driver.quit();
    }
}
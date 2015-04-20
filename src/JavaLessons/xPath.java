package JavaLessons;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// --- "//" - means search all
// --- "//Title" or "//TagName" - search all from current tag
// --- "/" - means search from level below
// --- "/html/Title/Body/" - search below this tag
// --- "@" - means attribute inside of tag
// --- "//book[@author = 'Lev Tolstoy']" - will find tag with attribute "author" = Lev Tolstoy
// --- "//book[2]" - will find second tag in HTML hierarchy under "book" tag
// --- "//book[5]" - will find fifth tag in HTML hierarchy under "book" tag
// --- "//*" - means find all
// --- "//*[@id = 'name'] - will find all with "id = name"
// --- ".." - means search from level above
// --- "//book/.." - will find all that above of tag "book"
public class xPath
{
    public WebDriver driver;
    public static String value;
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
        // --- find xpath by attribute names
        WebElement myPwd = driver.findElement(By.xpath("//*[@name = 'master' and @type = 'password']"));
        myPwd.sendKeys(sitePwd);
    }
    public void enterSiteName (String siteName)
    {
        // --- find xpath by attribute names
        WebElement mySite = driver.findElement(By.xpath("//*[@name='site' and @autocorrect= 'off' and @autocapitalize = 'off']"));
        mySite.sendKeys(siteName);
    }
    public void generate ()
    {
        // --- find xpath by attribute names
        WebElement myBtn = driver.findElement(By.xpath("//*[@type = 'submit' and @value = 'Generate']"));
        myBtn.submit();
    }
    public void getNewPassword ()
    {
        // --- find xpath by attribute names
        WebElement generatedPassword = driver.findElement(By.xpath("//*[@name='password']"));
        System.out.println(value = generatedPassword.getAttribute("value"));
    }
    public void siteNameValue()
    {
        // --- find xpath by third value "td" tag inside of "tbody" tag
        WebElement mySiteName = driver.findElement(By.xpath("(//tbody//td)[3]"));
        value = mySiteName.getText();
    }
    public void generatedPWD()
    {
        // --- find xpath by value in "td" tag inside of "tbody" tag
        WebElement myPWDName = driver.findElement(By.xpath("//tbody//td[text() = 'Generated password']"));
        value = myPWDName.getText();
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
    public void passwordVerification1() throws InterruptedException
    {
        siteNameValue();
        Assert.assertEquals("Site name", value);
    }
    @Test
    public void passwordVerification2() throws InterruptedException {
        generatedPWD();
        Assert.assertEquals("Generated password", value);
    }
    @After
    public void driverQuit() throws InterruptedException
    {
        Thread.sleep(1000);
        driver.quit();
    }
}

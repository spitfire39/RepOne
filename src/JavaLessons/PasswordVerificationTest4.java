package JavaLessons;
        import org.junit.After;
        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
public class PasswordVerificationTest4
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
    public void setField (String fieldName, String Pwd)
    {
        //WebElement myField = driver.findElement(By.xpath("//*[@name = 'master' and @type = 'password']"));
        WebElement myField = driver.findElement(By.xpath("(//tbody//td)[text() ='"+fieldName+"']"));
        myField.sendKeys(Pwd);
    }
    public void getField()
    {
        //some text
    }
    public void generate ()
    {
        // --- find xpath by attribute names
        WebElement myBtn = driver.findElement(By.xpath("//*[@type = 'submit' and @value = 'Generate']"));
        myBtn.submit();
    }
    public void passwordVerification() throws InterruptedException
    {
        setField("Your master password", "123456789");
        setField("MySiteName");
        generate();
        String expectedResult = getField("jsTqcMgYxYn1L@1a");
        Assert.assertEquals(expectedResult, value);
    }
}

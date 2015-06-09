package JavaLessons;


import com.gargoylesoftware.htmlunit.javascript.host.Selection;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignupObject
{
    public static WebDriver driver;

    //--- run Chrome browser
    static void openBrowserChrome(String sitePath, String chromeDriverPath)
    {
        // System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(sitePath);
    }
    //--- run FireFox browser
    static void openBrowserFireFox(String sitePath)
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(sitePath);
    }
    //--- this method returns page title
    public static String getPageTitle()
    {
        return driver.getTitle();
    }
    //--- this method populates user login, user password, user email, gender and clicks on confirm btn
    public static void setSignUpData(String userLogin, String userPwd, String userPwdConf, String userMail, String gender)
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement createNewAccBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ type=\"submit\" and @value=\"Create your account !\"]")));
        WebElement userName = driver.findElement(By.xpath("//*[@type=\"text\" and @name=\"username\"]"));
        userName.sendKeys(userLogin);
        WebElement userPassword = driver.findElement(By.xpath("//*[@type=\"password\" and @name=\"password\"]"));
        userPassword.sendKeys(userPwd);
        WebElement userPasswordConfirm = driver.findElement(By.xpath("//*[@type=\"password\" and @name=\"confirmpassword\"]"));
        userPasswordConfirm.sendKeys(userPwdConf);
        WebElement eMail = driver.findElement(By.xpath("//*[@type=\"text\" and @name=\"email\"]"));
        eMail.sendKeys(userMail);
        new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//*[@name=\"gender\"]"))).selectByVisibleText(gender);
        createNewAccBtn.click();
    }
    //--- this method works with error messages
    public static String getErrorMessage()
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement getError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"pasgood\"]")));
        return getError.getText();
    }
}


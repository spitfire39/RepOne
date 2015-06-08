package JavaLessons;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginObject
{
    public static WebDriver driver;

    static void openBrowserChrome(String sitePath, String chromeDriverPath)
    {
        // System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(sitePath);
    }
    static void openBrowserFireFox(String sitePath)
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(sitePath);
    }
    public static String getPageTitle()
    {
        return driver.getTitle();
    }
    public static void setLogin(String userLogin, String userPassword)
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement loginBtn = driver.findElement(By.xpath("//ul//*[contains(text(), 'Login')]"));
        loginBtn.click();
        WebElement confirmLoginBtm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr//*[@type=\"submit\"]")));
        WebElement userName = driver.findElement(By.xpath("//tr//*[@type=\"text\" and @class=\"input-text\" and @name=\"lusername\"]"));
        userName.sendKeys(userLogin);
        WebElement userPwd = driver.findElement(By.xpath("//tr//*[@type=\"password\" and @class=\"input-text\" and @name=\"lpassword\"]"));
        userPwd.sendKeys(userPassword);
        confirmLoginBtm.click();
    }
    public static String getLoginName(String userLogin)
    {
//        WebElement userLoginName = driver.findElement(By.xpath("//div/ul/li/a[@href=\"http://www.openforbeta.com/members/1641/qwa\"]"));
        WebElement userLoginName = driver.findElement(By.xpath("//div/ul/li/a[@href=\"http://www.openforbeta.com/members/1641/"+userLogin+"\"]"));
        return userLoginName.getText();
    }
    public static String getErrorMessage()
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement getError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"pasgood\"]")));
        return getError.getText();
    }

}

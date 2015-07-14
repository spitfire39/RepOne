package blueworkslive;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ObjectLogin {
    public static WebDriver driver;

    ObjectLogin(String sitePath, String chromeDriverPath, String email, String pwd) throws Exception {
        openBrowserChrome(sitePath, chromeDriverPath);
        pressLogin();
        setEmail(email);
        setPwd(pwd);
        pressSubmitBtn();
        closeGoPro();
        openAdmin();
//        pressLogOut();
    }

    //--- run Chrome browser
    public static void openBrowserChrome(String sitePath, String chromeDriverPath)
    {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(sitePath);
    }
    void pressLogin() throws Exception {
        try {
            WebElement element = driver.findElement(By.xpath("//*[@id='ibm-primary-tabs' and @class='light ibm-no-mobile']//*[@class='topButton' and @href='/login']"));
            element.click();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    void setEmail(String email) throws Exception {
        try{
            WebElement element = driver.findElement(By.xpath("//*[@name='txtLogin' and @type='text' and @id='txtLogin' and @class='textInput']"));
            element.sendKeys(email);
        }
        catch (NoSuchElementException e){
            throw (e);
        }
    }
    void setPwd(String pwd) throws Exception {
        try{
            WebElement element = driver.findElement(By.xpath("//*[@name='txtPassword' and @type='password' and @id='txtPassword' and @class='textInput']"));
            element.sendKeys(pwd);
        }
        catch (NoSuchElementException e){
            throw (e);
        }
    }
    void pressSubmitBtn() throws Exception {
        try {
            WebElement element = driver.findElement(By.xpath("//*[@type='submit' and @id='loginButton' and @class='squareTextButton' and @value='login']"));
            element.click();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    void closeGoPro() throws Exception {
        try {
//            WebElement element = driver.findElement(By.xpath("//*[@class='bpDialogHeaderXButtonImage']"));
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='bpDialogHeaderXButtonImage']")));
            element.click();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    void openAdmin() throws Exception {
        try {
            WebElement element = driver.findElement(By.xpath("//*[@title='Admin']"));
            element.click();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    String getAdminInfo(){
        try {
            WebElement element = driver.findElement(By.xpath("//*[@class='accountUsername' and contains(text(), 'automation.user.smtp@gmail.com')]"));
            return element.getText();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    void pressLogOut(){
        try {
            WebElement element = driver.findElement(By.xpath("//*[@title = 'Log Out']"));
            element.click();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    void getWorkTab() throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath("//li[contains(text(), 'Work')]"));
            element.click();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement gridElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'You are not following any work items.')]")));
            long startTime = System.currentTimeMillis()/1000;
            while(((System.currentTimeMillis()/1000)-startTime)<60){
                if(gridElement.isDisplayed()){
                    long endTime = System.currentTimeMillis()/1000;
                    long loadTime = endTime - startTime;
                    System.out.println("Load time is: " +loadTime + " seconds");
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    void getCommunityTab(){
        try {
            WebElement element = driver.findElement(By.xpath("//li[contains(text(), 'Community')]"));
            element.click();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement gridElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='gwt-InlineHTML' and contains(text(), 'Followed Items')]")));
            long startTime = System.currentTimeMillis()/1000;
            while(((System.currentTimeMillis()/1000)-startTime)<60){
                if(gridElement.isDisplayed()){
                    long endTime = System.currentTimeMillis()/1000;
                    long loadTime = endTime - startTime;
                    System.out.println("Load time is: " +loadTime + " seconds");
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    void getLibraryTab(){
        try {
            WebElement element = driver.findElement(By.xpath("//li[contains(text(), 'Library')]"));
            element.click();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement gridElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'You are not following any spaces.')]")));
            long startTime = System.currentTimeMillis()/1000;
            while(((System.currentTimeMillis()/1000)-startTime)<60){
                if(gridElement.isDisplayed()){
                    long endTime = System.currentTimeMillis()/1000;
                    long loadTime = endTime - startTime;
                    System.out.println("Load time is: " +loadTime + " seconds");
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
}

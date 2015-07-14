package blueworkslive;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectSignUp
{
    public static WebDriver driver;

    ObjectSignUp(String sitePath, String chromeDriverPath, String company, String name, String lastName, String email, String phone, String title, String country) throws Exception {
        openBrowserChrome(sitePath, chromeDriverPath);
        pressSignInForm();
        setCompanyName(company);
        setFirstName(name);
        setLastName(lastName);
        setEmail(email);
        setPhone(phone);
        setJobTitle(title);
        setCountry(country);
        setAccept();
        pressSubmitBtn();
//        pressCreateAccountBtn();
    }

    //--- run Chrome browser
    public static void openBrowserChrome(String sitePath, String chromeDriverPath)
    {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(sitePath);
    }
    void pressSignInForm() throws Exception {
        try {
            WebElement element = driver.findElement(By.xpath("//*[@class='ibm_cci-sb-join leadspace-button ibm-tooltip']"));
            element.click();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    void setCompanyName(String company) throws Exception {
        try{
            WebElement element = driver.findElement(By.xpath("//*[@type='text' and @class='gwt-TextBox' and @name='Ecom_ShipTo_Postal_Company' and @vcard_name='vCard.Company']"));
            element.sendKeys(company);
        }
        catch (NoSuchElementException e){
            throw (e);
        }
    }
    void setFirstName(String name) throws Exception {
        try{
            WebElement element = driver.findElement(By.xpath("//*[@type='text' and @class='gwt-TextBox' and @name='first_name' and @vcard_name='vCard.FirstName']"));
            element.sendKeys(name);
        }
        catch (NoSuchElementException e){
            throw (e);
        }
    }
    void setLastName(String lastName) throws Exception {
        try{
            WebElement element = driver.findElement(By.xpath("//*[@type='text' and @class='bpAccountControlRight' and @name='last_name' and @vcard_name='vCard.LastName']"));
            element.sendKeys(lastName);
        }
        catch (NoSuchElementException e){
            throw (e);
        }
    }
    void setEmail(String email) throws Exception {
        try{
            WebElement element = driver.findElement(By.xpath("//*[@type='text' and @class='bpFieldDefault' and @name='email' and @vcard_name='vCard.Email']"));
            element.sendKeys(email);
        }
        catch (NoSuchElementException e){
            throw (e);
        }
    }
    void setPhone(String phone) throws Exception {
        try{
            WebElement element = driver.findElement(By.xpath("//*[@type='text' and @class='bpAccountControlRight' and @name='phone' and @vcard_name='vCard.JobTitle']"));
            element.sendKeys(phone);
        }
        catch (NoSuchElementException e){
            throw (e);
        }
    }
    void setJobTitle(String title) throws Exception {
        try{
            WebElement element = driver.findElement(By.xpath("//*[@type='text' and @class='gwt-TextBox' and @name='jobTitle']"));
            element.sendKeys(title);
        }
        catch (NoSuchElementException e){
            throw (e);
        }
    }
    void setCountry(String country) throws Exception {
        try{
            Select droplist = new Select(driver.findElement(By.xpath("//*[@class='gwt-ListBox signupFormListBoxWithTranslatedOptions' and @name='Ecom_ShipTo_Postal_CountryCode']")));
            droplist.selectByVisibleText(country);
        }
        catch (NoSuchElementException e){
            throw (e);
        }
    }
    void setAccept() throws Exception {
        try {
            WebElement element = driver.findElement(By.xpath("//*[@type='checkbox' and @value='on' and @id='gwt-uid-2']"));
            element.click();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    void pressSubmitBtn() throws Exception {
        try {
            WebElement element = driver.findElement(By.xpath("//tr[38]//*[@type='button' and @class='squareTextButton']"));
            Thread.sleep(1000);
            element.click();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    String getCompanyName() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[3]//*[@class='bpConfirmationDataSection']")));
//            WebElement element = driver.findElement(By.xpath("//tr[3]//*[@class='bpConfirmationDataSection']"));
//            WebElement element = driver.findElement(By.xpath("//*[contains(text(), '"+companyName+"')]"));
//            Thread.sleep(1000);
            return element.getText();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    void pressCreateAccountBtn() throws Exception {
        try {
            WebElement element = driver.findElement(By.xpath("//*[@type='button' and @class='squareTextButton' and contains(text(), 'Create Account')]"));
            Thread.sleep(1000);
            element.click();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
    String getValidationResults() throws Exception {
        try {
            WebElement element = driver.findElement(By.xpath("//*[@class='bpProcessingText' and contains(text(), 'Confirming Account Creation')]"));
            return element.getText();
        } catch (NoSuchElementException e) {
            throw (e);
        }
    }
}


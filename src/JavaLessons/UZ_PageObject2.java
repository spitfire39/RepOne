package JavaLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UZ_PageObject2
{
    public static WebDriver driver;
    public static WebElement element;
    public static void openBrowser(String sitePath)
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(sitePath);
    }
    public static String getPageTitle()
    {
        return driver.getTitle();
    }
    public static void populateFromField(String from) throws InterruptedException
    {
        // --- find From field
        WebElement fromField = driver.findElement(By.xpath("//*[@name = 'station_from']"));
        //--- type destination in to From field
        fromField.sendKeys(from);
        Thread.sleep(1000);
        //--- select value from autocomplete field
        WebElement dropDownListFrom = driver.findElement(By.xpath("//*[. = '"+from+"']"));
        dropDownListFrom.click();
    }
    public static String getFromField() throws InterruptedException
    {
        WebElement fromField = driver.findElement(By.xpath("//*[@name = 'station_from']"));
        return fromField.getAttribute("value");
    }
    public static void populateToField(String to) throws InterruptedException
    {
        //--- find To field
        WebElement toField = driver.findElement(By.xpath("//*[@name = 'station_till']"));
        //--- type destination in to To field
        toField.sendKeys(to);
        Thread.sleep(1000);
        //--- select value from autocomplete field
        WebElement dropDownListTo = driver.findElement(By.xpath("//*[. = '"+to+"']"));
        dropDownListTo.click();
    }
    public static String getToField() throws InterruptedException
    {
        WebElement toField = driver.findElement(By.xpath("//*[@name = 'station_till']"));
        return toField.getAttribute("value");
    }
    public static void populateDepartureDate(String date) throws InterruptedException
    {
        //--- clear and set date in to Departure date
        WebElement departureDate = driver.findElement(By.xpath("//*[@id = 'date_dep']"));
        departureDate.clear();
        departureDate.sendKeys(date);
    }
    public static String getDepartureDateField() throws InterruptedException
    {
        WebElement departureDate = driver.findElement(By.xpath("//*[@id = 'date_dep']"));
        return departureDate.getAttribute("value");
    }
    public static void populateDepartureTime(String time) throws InterruptedException
    {
        //--- set departure time in to Departure time field
        WebElement departureTime = driver.findElement(By.xpath("//*[@name = 'time_dep']"));
        departureTime = element;
        selectElements(time);
    }
    public static void selectElements(String text)
    {
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }
}

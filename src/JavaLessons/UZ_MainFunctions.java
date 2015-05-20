package JavaLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UZ_MainFunctions
{
    //--- main elements
    public static WebDriver driver;
    public static WebElement element;
    public static void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(UZ_Path.sitePath);
    }

    public static String getPageTitle()
    {
        return driver.getTitle();
    }

    public static void findElement(String path)
    {
        element = driver.findElement(By.xpath(path));
    }
    public static void  selectElement(String text)
    {
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }

    public static void sendKeys(String keys)
    {
        element.sendKeys(keys);
    }

    public static void click()
    {
        element.click();
    }

    public static void clear()
    {
        element.clear();
    }

    public static String getText()
    {
        return element.getText();
    }

    public static String getAttribute()
    {
        return element.getAttribute("value");
    }

}

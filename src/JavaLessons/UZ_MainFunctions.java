package JavaLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UZ_MainFunctions
{
    public static void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        UZ_Path.driver = new ChromeDriver();
        UZ_Path.driver.manage().window().maximize();
        UZ_Path.driver.get(UZ_Path.sitePath);
    }

    public static String getPageTitle()
    {
        return UZ_Path.driver.getTitle();
    }

    public static void findElement(String path)
    {
        UZ_Path.element = UZ_Path.driver.findElement(By.xpath(path));
    }
    public static void  selectElement(String text)
    {
        Select s = new Select(UZ_Path.element);
        s.selectByVisibleText(text);
    }

    public static void sendKeys(String keys)
    {
        UZ_Path.element.sendKeys(keys);
    }

    public static void click()
    {
        UZ_Path.element.click();
    }

    public static void clear()
    {
        UZ_Path.element.clear();
    }

    public static String getText()
    {
        return UZ_Path.element.getText();
    }

    public static String getAttribute()
    {
        return UZ_Path.element.getAttribute("value");
    }

}

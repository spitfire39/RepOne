package JavaLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GT_MainFunctions
{
    public static void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        GT_Path.driver = new ChromeDriver();
        GT_Path.driver.manage().window().maximize();
        GT_Path.driver.get(GT_Path.sitePath);
    }
    public static void findElement(String path)
    {
        GT_Path.myField = GT_Path.driver.findElement(By.xpath(path));
    }
    public static void sendKeys(String keys)
    {
        GT_Path.myField.sendKeys(keys);
    }
    public static void click()
    {
        GT_Path.myField.click();
    }
    public static String getAttribute()
    {
        return GT_Path.myField.getText();
    }
}
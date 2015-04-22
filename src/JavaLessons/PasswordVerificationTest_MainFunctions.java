package JavaLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordVerificationTest_MainFunctions
{
    public static void openBrowser() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        PasswordVerificationTest_Path.driver = new ChromeDriver();
        PasswordVerificationTest_Path.driver.get(PasswordVerificationTest_Path.Page);
    }
    public static void setField (String text)
    {
        WebElement myField = PasswordVerificationTest_Path.driver.findElement(By.xpath("//tbody//td[text() = '" + PasswordVerificationTest_Path.field + "']/..//input"));
        myField.sendKeys(text);
    }

    public static void getField()
    {
        WebElement myField = PasswordVerificationTest_Path.driver.findElement(By.xpath("//tbody//td[text() = '"+PasswordVerificationTest_Path.field+"']/..//input"));
        PasswordVerificationTest_Path.value = myField.getText();
    }
    public static void generate ()
    {
        WebElement myBtn = PasswordVerificationTest_Path.driver.findElement(By.xpath("//*[@type = 'submit' and @value = 'Generate']"));
        myBtn.submit();
    }
}

package JavaLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PasswordGeneratorTest2 {

        public static String password;
        public static void main(String[] args) throws InterruptedException
        {
                System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("http://angel.net/~nic/passwd.current.html");
                MyData(driver, "new Password", "New Site");
                Thread.sleep(3000);
                driver.close();
        }

        public static void MyData(WebDriver newDriver, String pwd, String site)
        {

                WebElement myPwd = newDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
                myPwd.sendKeys(pwd);
                WebElement mySite = newDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
                mySite.sendKeys(site);
                WebElement myBtn = newDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
                myBtn.submit();
                WebElement generatedPassword = newDriver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/input"));
                System.out.println(generatedPassword.getAttribute("value"));
        }


}

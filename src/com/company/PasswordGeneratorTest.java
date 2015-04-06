package com.company;
       import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.util.List;

public class PasswordGeneratorTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("http://angel.net/~nic/passwd.current.html");


        WebElement myPassword = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        myPassword.sendKeys("test123");
        WebElement mySite = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        mySite.sendKeys("MySite");
        WebElement generateBtn = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
        generateBtn.submit();
        WebElement generatedPassword = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/input"));
        System.out.println(generatedPassword.getAttribute("value"));
        Thread.sleep(5000);
        driver.quit();
    }

}
package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OpenChromeBrowser
{
    public static void main(String[] args) throws InterruptedException {
        // --- set new property and path to chrome driver on a hard drive
        System.setProperty("webdriver.chrome.driver", "C:/Automation/Workspace/chromedriver.exe");
        // --- run Chrome
        WebDriver driver = new ChromeDriver();
        // --- run Chrome in maximized window
        driver.manage().window().maximize();
        // --- open Google page
        driver.get("https://google.com");
        // --- display title of the page
        System.out.println(driver.getTitle());
        // --- type some value in search field
        String path = "//*[@id=\"lst-ib\"]";
        WebElement googleSearch = driver.findElement(By.xpath(path));
        googleSearch.sendKeys("qa factory", Keys.ENTER);
        Thread.sleep(5000);
        //googleSearch.submit();
        // --- find some ID in rearch results
        WebElement searchResult = driver.findElement(By.id("rso")); //*[@id="rso"]

        WebElement linkText = searchResult.findElement(By.tagName("a"));
        System.out.println(linkText.getText());


        // --- wait for xxxx mili seconds
        Thread.sleep(5000);
        // --- close Chrome
        driver.quit();

    }
}
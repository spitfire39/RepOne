package com.company;
import org.openqa.selenium.WebDriver;
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
        // --- wait for xxxx mili seconds
        Thread.sleep(5000);

        // --- close Chrome
        driver.quit();

    }
}
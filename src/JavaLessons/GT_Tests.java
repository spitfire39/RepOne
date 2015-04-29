package JavaLessons;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class GT_Tests
{
    @Test
    public void test6()throws InterruptedException
    {
        GT_MainFunctions.openBrowser();
//        GT_Path.value = "Привет Мир";
        GT_MainFunctions.findElement(GT_Path.mainLangField);
        GT_MainFunctions.sendKeys("Hello World");
        Thread.sleep(500);
//---
        GT_MainFunctions.findElement(GT_Path.expMainLang);
        Thread.sleep(500);
        GT_MainFunctions.click();

        GT_MainFunctions.findElement(GT_Path.mainLang);
        Thread.sleep(500);
        GT_MainFunctions.click();
//---
        GT_MainFunctions.findElement(GT_Path.expAltLang);
        Thread.sleep(500);
        GT_MainFunctions.click();

        GT_MainFunctions.findElement(GT_Path.altLang);
        Thread.sleep(500);
        GT_MainFunctions.click();
        Assert.assertEquals("привет мир", GT_MainFunctions.getAttribute());
    }
    @After
    public void driverQuit() throws InterruptedException
    {
        Thread.sleep(2000);
        GT_Path.driver.quit();
    }
}

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

        GT_MainFunctions.findElement(GT_Path.translateValue);
        Thread.sleep(500);
        Assert.assertEquals("ahoj Svete", GT_MainFunctions.getAttribute());
    }
    @After
    public void driverQuit() throws InterruptedException
    {
        Thread.sleep(2000);
        GT_Path.driver.quit();
    }
}
//--- run this test from command line from C:\Automation\Workspace\src\JavaLessons\ folder with *.java tests
//--- C:/Automation/Workspace/selenium-2.44.0/* - path to selenium folder
//--- C:/Automation/Workspace/selenium-2.44.0/libs/* - path to libs folder
//--- C:/Automation/Workspace/out/production/Workspace - path to project folder
//--- org.junit.runner.JUnitCore JavaLessons.GT_Tests - select test from src folder, which you are going to use
//java -classpath "C:/Automation/Workspace/selenium-2.44.0/*;C:/Automation/Workspace/selenium-2.44.0/libs/*;C:/Automation/Workspace/out/production/Workspace" org.junit.runner.JUnitCore JavaLessons.GT_Tests
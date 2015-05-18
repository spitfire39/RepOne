package JavaLessons;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UZ_Tests
{
    @Test
    public void openBrowserTest() throws InterruptedException
    {
        UZ_MainFunctions.openBrowser();
        //--- verify page title
        Assert.assertEquals("Online reservation and purchase tickets - Ukrzaliznytsia", UZ_MainFunctions.getPageTitle());

        //--- populate From field function
        UZ_PageObject.populateFromField("kyiv");

        //--- verify text in From field
        UZ_MainFunctions.findElement(UZ_Path.fromField);
        Assert.assertEquals("Kyiv", UZ_MainFunctions.getAttribute());

        //--- populate to field function
        UZ_PageObject.populateToField("odesa");

        //--- verify text in From field
        UZ_MainFunctions.findElement(UZ_Path.toField);
        Assert.assertEquals("Odesa", UZ_MainFunctions.getAttribute());

        //--- populate Departure date
        UZ_PageObject.populateDepartureDate("05.30.2015");

        //--- verify text in From field
        UZ_MainFunctions.findElement(UZ_Path.departureDate);
        Assert.assertEquals("05.30.2015", UZ_MainFunctions.getAttribute());

        //--- populate Departure time
        UZ_PageObject.populateDepartureTime("12:00pm");

        //--- press Search btn
        UZ_MainFunctions.findElement(UZ_Path.searchBtn);
        UZ_MainFunctions.click();
        Thread.sleep(1000);
        //--- verify that train is present
        UZ_MainFunctions.findElement(UZ_Path.trainSearch);
        Assert.assertEquals("763 Л", UZ_MainFunctions.getText());
        //--- click on train
        UZ_MainFunctions.click();
    }
    @After
    public void driverQuit() throws InterruptedException
    {
        Thread.sleep(2000);
        UZ_Path.driver.quit();
    }
}

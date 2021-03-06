package JavaLessons;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UZ_Tests2
{
    @Test
    public void mainTest() throws InterruptedException
    {
        UZ_PageObject2.openBrowser("http://booking.uz.gov.ua/en/");
        //--- verify page title
        Assert.assertEquals("Online reservation and purchase tickets - Ukrzaliznytsia", UZ_PageObject2.getPageTitle());

        //--- populate From field function
        UZ_PageObject2.populateFromField("Kyiv");

        //--- verify text in From field
        Assert.assertEquals("Kyiv", UZ_PageObject2.getFromField());

        //--- populate to field function
        UZ_PageObject2.populateToField("Odesa");

        //--- verify text in From field
        Assert.assertEquals("Odesa", UZ_PageObject2.getToField());

        //--- populate Departure date
        UZ_PageObject2.populateDepartureDate("05.30.2015");

        //--- verify text in From field
        Assert.assertEquals("05.30.2015", UZ_PageObject2.getDepartureDateField());

        //--- populate Departure time
        UZ_PageObject.populateDepartureTime("12:00pm");
//
//        //--- press Search btn
//        UZ_PageObject.pressSearch();
//
//        //--- verify that train is present
//        Assert.assertEquals("763 Л", UZ_PageObject.getTrainSearchResult());
//
//        //--- click on train
//        UZ_MainFunctions.click();
//
//        //--- verify that train route is correct
//        Assert.assertEquals("Kyiv-Pasazhyrsky > Odesa-Holovna", UZ_PageObject.getRouteSearchResult());
//
//        //--- click on OK btn, close pop up window
//        UZ_PageObject.closeTrainRoute();
//
//        //--- Click on Choose btn on Available seats section
//        UZ_PageObject.clickChooseBtn();
//
//        //--- click on place in train

    }
    @After
    public void driverQuit() throws InterruptedException
    {
        Thread.sleep(1000);
        UZ_PageObject2.driver.quit();
    }
}

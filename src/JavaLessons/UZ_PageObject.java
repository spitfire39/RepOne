package JavaLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UZ_PageObject
{
    public static void populateFromField(String from) throws InterruptedException
    {
//        //--- find From field
//        UZ_MainFunctions.findElement(UZ_Path.fromField);
//        //--- type destination in to From field
//        UZ_MainFunctions.sendKeys(from);
//        Thread.sleep(1000);
//        //--- select value from autocomplete field
//        UZ_MainFunctions.findElement(UZ_Path.fromFieldValue);
//        UZ_MainFunctions.click();

        // --- find From field
        WebElement fromField = UZ_MainFunctions.driver.findElement(By.xpath("//*[@name = 'station_from']"));
        //--- type destination in to From field
        fromField.sendKeys(from);
        Thread.sleep(1000);
        //--- select value from autocomplete field
        WebElement dropDownList = UZ_MainFunctions.driver.findElement(By.xpath("//*[. = '"+from+"']"));
        dropDownList.click();
    }
    public static String getFromField() throws InterruptedException
    {
//        //--- verify text in From field
//        UZ_MainFunctions.findElement(UZ_Path.fromField);
//        return UZ_MainFunctions.getAttribute();

        WebElement fromField = UZ_MainFunctions.driver.findElement(By.xpath("//*[@name = 'station_from']"));
        return UZ_MainFunctions.getAttribute();
    }
    public static void populateToField(String to) throws InterruptedException
    {
        //--- find To field
        UZ_MainFunctions.findElement(UZ_Path.toField);
        //--- type destination in to To field
        UZ_MainFunctions.sendKeys(to);
        Thread.sleep(1000);
        //--- select value from autocomplete field
        UZ_MainFunctions.findElement(UZ_Path.toFieldValue);
        UZ_MainFunctions.click();
    }
    public static String getToField() throws InterruptedException
    {
        //--- verify text in To field
        UZ_MainFunctions.findElement(UZ_Path.toField);
        return UZ_MainFunctions.getAttribute();
    }
    public static void populateDepartureDate(String date) throws InterruptedException
    {
        //--- clear and set date in to Departure date
        UZ_MainFunctions.findElement(UZ_Path.departureDate);
        UZ_MainFunctions.clear();
        UZ_MainFunctions.sendKeys(date);
    }
    public static String getDepartureDateField() throws InterruptedException
{
    //--- verify text in Departure Date field
    UZ_MainFunctions.findElement(UZ_Path.departureDate);
    return UZ_MainFunctions.getAttribute();
}
    public static void populateDepartureTime(String time) throws InterruptedException
    {
        //--- set departure time in to Departure time field
        UZ_MainFunctions.findElement(UZ_Path.departureTime);
        UZ_MainFunctions.selectElement(time);
    }
    public static void pressSearch()  throws InterruptedException
    {
        //--- press Search btn
        UZ_MainFunctions.findElement(UZ_Path.searchBtn);
        UZ_MainFunctions.click();
        Thread.sleep(1000);
    }
    public static String getTrainSearchResult() throws InterruptedException
    {
        //--- verify text in From field
        Thread.sleep(1000);
        UZ_MainFunctions.findElement(UZ_Path.trainSearch);
        return UZ_MainFunctions.getText();
    }
    public static String getRouteSearchResult() throws InterruptedException
    {
        //--- verify text in From field
        Thread.sleep(1000);
        UZ_MainFunctions.findElement(UZ_Path.trainRoute);
        return UZ_MainFunctions.getText();
    }
    public static void closeTrainRoute() throws InterruptedException
    {
        //--- press close btn
        UZ_MainFunctions.findElement(UZ_Path.closeTrainRoute);
        UZ_MainFunctions.click();
        Thread.sleep(1000);
    }
    public static void clickChooseBtn() throws InterruptedException
    {
        UZ_MainFunctions.findElement(UZ_Path.chooseBtn);
        UZ_MainFunctions.click();
        Thread.sleep(1000);
    }
}

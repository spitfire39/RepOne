package JavaLessons;

public class UZ_PageObject
{
    public static void populateFromField(String from) throws InterruptedException
    {
        //--- find From field
        UZ_MainFunctions.findElement(UZ_Path.fromField);
        //--- type destination in to From field
        UZ_MainFunctions.sendKeys(from);
        Thread.sleep(1000);
        //--- select value from autocomplete field
        UZ_MainFunctions.findElement(UZ_Path.fromFieldValue);
        UZ_MainFunctions.click();
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
    public static void populateDepartureDate(String date) throws InterruptedException
    {
        //--- clear and set date in to Departure date
        UZ_MainFunctions.findElement(UZ_Path.departureDate);
        UZ_MainFunctions.clear();
        UZ_MainFunctions.sendKeys(date);
    }
    public static void populateDepartureTime(String time) throws InterruptedException
    {
        //--- set departure time in to Departure time field
        UZ_MainFunctions.findElement(UZ_Path.departureTime);
        UZ_MainFunctions.selectElement(time);
    }
}

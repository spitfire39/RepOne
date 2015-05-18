package JavaLessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UZ_Path
{
    //--- main elements
    public static WebDriver driver;
    public static WebElement element;

    //--- site path
    public static String sitePath = "http://booking.uz.gov.ua/en/";
    //--- page title
    public static String myElement;
    //--- destination From
    public static String fromField = "//*[@name = 'station_from']";
    //--- value in From drop down list
    public static String fromFieldValue = "//*[. = 'Kyiv']";
    //--- destination To
    public static String toField = "//*[@name = 'station_till']";
    //--- value in To drop down list
    public static String toFieldValue = "//*[. = 'Odesa']";
    //--- Search btn
    public static String searchBtn = "//*[@name = 'search']";
    //--- Departure date field
    public static String departureDate = "//*[@id = 'date_dep']";
    //--- Departure time field
    public static String departureTime = "//*[@name = 'time_dep']";
    public static String trainSearch = "//*[. = '763 Л']";
}

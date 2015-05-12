package JavaLessons;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GT_Path
{
    public static WebDriver driver;
    public static WebElement myField;
    public static String sitePath = "https://translate.google.com.ua/?hl=uk";


    public static String value;
    public static String mainLang = "//*[@id=\":7\"]/div";
    public static String altLang = "//*[@id=\":4f\"]/div";
    //*[@id=":4f"]/div
    public static String mainLangField = "//*[@id=\"source\"]";
    public static String expMainLang = "//*[@id=\"gt-sl-gms\"]/div[2]";
    public static String expAltLang = "//*[@id=\"gt-tl-gms\"]/div[2]";
    public static String translateValue = "//*[@id = 'result_box']";

}

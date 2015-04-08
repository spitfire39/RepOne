package JavaLessons;

public class NewClass
{
    public static void main(String[] args)
    {
        String s = "Hello";
        int i = s.length();
        i = 10;
        if (s.contains("e")) // --- operator "contains" verifies if some value contains some condition
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        s.substring(3,4);

        String var1 = new String(); // --- equals to variable "var1" = <empty> : var1 = "";
    }
}

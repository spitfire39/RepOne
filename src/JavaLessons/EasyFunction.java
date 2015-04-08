package JavaLessons;

public class EasyFunction
{
    public static void main(String[] args)
    {
        compare(sum(10, 20), 30);
        compare(sum(5, 5), 10);
        compare(sum(3, 4), 8);
    }

    public static void compare (int value1, int value2)
    {
        if ( value1 == value2 )
        {
            System.out.println("test passed");
        }
        else
        {
            System.out.println("test failed");
        }
    }
    public static int sum (int x, int y)
    {
        int itog = x + y;
        return itog;
    }
}

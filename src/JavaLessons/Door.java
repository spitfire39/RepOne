package JavaLessons;
public class Door // --- create new class "Door"
{
    // --- set parameters of "Door" class
    public int high;
    public boolean isOpened;
    public String doorColor;

    // --- set values of "Door" class parameters
    public Door (int high)
    {
        // --- operator "this" allows to show which parameter is from outside
        this.high = high;
        isOpened = true;
        doorColor = "red";

    }

    public void doorPrint()
    {
        System.out.println("door1 high is " + high);
        if (isOpened)
        {
            System.out.println("door1 is open");
        }
        else
        {
            System.out.println("door1 is closed");
        }
        System.out.println("door1 color is  " + doorColor);
    }
}

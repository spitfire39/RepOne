package JavaLessons;

public class NewDoor
{
    public static void main(String[] args) {
        Door door1 = new Door(100);
        //Door door2 = new Door(190);
        int doorHigh = door1.high;
        //door2.isOpened = true;
        String color = door1.doorColor;

        System.out.println("door1 high is " + door1.high);
        if (door1.isOpened)
        {
            System.out.println("door1 is open");
        }
        else
        {
            System.out.println("door1 is closed");
        }
        System.out.println("door1 color is  " + door1.doorColor);
        //Door doorPring new = do
    }
}

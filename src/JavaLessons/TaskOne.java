package JavaLessons;
public class TaskOne
{
    public static void main(String[] args)
    {
        //1
        // Hello Class
        System.out.println("Task 1:");
        String t = "Hello Class";
        System.out.println(t);
        // Hello Class, and Student!
        String ts = ", and Student!";
        System.out.println(t + ts);

        //2
        System.out.println("Task 2:");
        // Under key five
        int [] u = {0, 1, 9999, 3, 4, 9000};
        System.out.println(u[5]);
        // Under key one but three
        System.out.println(u[3-1]);

        //3
        System.out.println("Task 3:");
        // 8
        // 9
        // 10
        for (int x = 8; x < 11; x++)
        {
            System.out.println(x);
        }
        //4
        System.out.println("Task 4:");
        // How
        // are
        // you
        String [] s = {"How", "are", "you"};
        for (int i = 0; i < 3; i++)
        {
            System.out.println(s[i]);
        }

        //5
        System.out.println("Task 5:");
        // 10
        // 20
        int b = 25;
        int[] m = {10, 20, 25, 30};
        int i = 0;
        while (i < 4)
        {
            if (m[i] == b)  // --- in this case this value be a stop signal for our system
            {
                break;
            }
            System.out.println(m[i]);
            i++;
        }

        //6
        System.out.println("Task 6:");
        // 20
        // 25
        // 30
        int d = 10;
        int[] n = {10, 20, 25, 30};
        int j = 0;
        while (j < 4)
        {
            if (n[j] == d) // --- in this case this value will be excluded and not displayed from massive
            {
                j++;
                continue;
            }
            System.out.println(n[j]);
            j++;
        }

        //7
        // Hello World
        // Goodbye World
        System.out.println("Task 7:");

        TestClass c = new TestClass();
        c.say();
        c.update();

        //8
        // Door info:
        // Size: 2000x900 mm
        // Opened: yes
        // Locked: no
        System.out.println("Task 8:");

        /*ProDoor door = new ProDoor(2000, 900, true, false);
        String doorInfo = door.toString();
        System.out.println(doorInfo);
*/
    }
}

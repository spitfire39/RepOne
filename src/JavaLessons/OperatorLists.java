package JavaLessons;

import java.util.ArrayList;
import java.util.List;

public class OperatorLists
{
    public static void main(String[] args)
    {
        // --- this is a massive rows
        String [] mass1 = {"Hello ", "Class", "."};
        System.out.println(mass1[0]);
        System.out.println(mass1[1]);
        System.out.println(mass1[2]);

        // --- this is a list of rows
        List<String> newList = new ArrayList<String>();
        // --- add to list some values
        newList.add("Hello ");
        newList.add("Class");
        newList.add(".");
        // --- display values form the List
        System.out.println(newList.get(0));
        System.out.println(newList.get(1));
        System.out.println(newList.get(2));
    }
}

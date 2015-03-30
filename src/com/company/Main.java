package com.company;

public class Main {

    public static void main(String[] args) {
        //------ Work with integer and String
        String sum = "Sum of 256 and 3180 = ";
        String sum2 = ", 180/30 is = ";
        int x = 256;
        int y = 3180;
        int c = x + y;
        int z = 180;
        int v = 30;
        int d = z / v;
        System.out.println(sum + c + sum2 + d);
        // ---------- \ allows to use spec symbols which means something in java
        // ---------- \n allows to display in out put data from new row
        System.out.println("Sum of \n 256 \n and 3180 = \\" + (256 + 3180) + ", 180/30 is = \"" + (180 / 30));

        //--------Work with boolean
        boolean t = true;
        boolean g = false;
        t = 5 == 5;
        g = 5 > 10;
        System.out.println(t);
        System.out.println(g);

        //--------- work with operator 'equals'
        String var1 = "abc";
        String var2 = "abd";
        System.out.println(var1.equals(var2));

        //--------- work with massives
        //Preconditions:
        //existing massive = 10, 0,  0, 21, -5, 38
        //                 №0, №1,№2,№3, №4,№5
        int [] m = {10, 0, 0, 21, -5, 38};
        //--------- call value from massive 'm' by it order
        int m1 = m[0]; // set new variable 'm1' first value from massive 'm'
        int m2 = m[1];
        int m3 = m[2];
        int m4 = m[3];
        int m5 = m[4];
        int m6 = m[5];
        System.out.println("Massive: " + " " + m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5 + " " +m6);

        String [] words1 = {"a","b","c"};
        String [] words2 = {"a","d","c"};
        String w1 = words1[0];
        String w2 = words1[1];
        String w3 = words1[2];
        String w4 = words2[0];
        String w5 = words2[1];
        String w6 = words2[2];
        System.out.println("String massive is: " + w1 + " " + w3 + " " + w2 + " "+ w4 + " " + w3 + " " + w6) ;
    }
}
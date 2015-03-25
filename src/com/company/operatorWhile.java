package com.company;
public class operatorWhile {
    public static void main(String[] args) {
        int var0 = 10;
        // --- use operator "while" and set some check/verification/compare
        while (var0 < 15)
        {
            System.out.println("First value is" + var0);
            // --- add to variable "var0" +1
            var0 = (var0 + 1);
        }
        System.out.println("first while is over");

        int var1 = 10;
        // --- operator "while" works until it state is true
        while (true)
        {
            System.out.println("Second value is " + var1);
            // --- state of second while
            // --- use operator "if" to compare second variable
            if (var1 > 15)
            {
                // --- use operator "break" when state is not true
                break;
            }
            var1 = (var1 + 1);
        }
        System.out.println("Second while is over " + var1);

    }

}

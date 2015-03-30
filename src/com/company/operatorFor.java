package com.company;

public class operatorFor
{
    public static void main(String[] args)
    {
        int var1 = 0;
        while (var1 < 5)
        {
            var1 = var1 + 1; // or var++ - means "+1"
            System.out.println("var1 = " + var1);
        }

        // --- difference between "while" and "for" that variable "var2" was created inside "for" and will not be available outside
        for (int var2 = 0; var2 <5; var2 = var2 +1)
        {
            System.out.println("var2 = " + var2);
        }

        // --- set variables out of "for"
        int var3;
        String text1 = ("4");
        // --- run operator "for"
        for (var3 = 0; var3 <7; var3 = var3 +1) // --- condition of "for" function: function will work until variable will be < 7
        {
            System.out.println("var3 = " + var3);
            if (text1.equals(Integer.toString(var3))) /// --- add additional condition: function will work until variable will be = 4
            {
                break;
            }
        }
    }
}

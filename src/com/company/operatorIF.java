package com.company;

public class operatorIF {
    // --- type psvm and press Tab to create  public static void main(String[] args) {.....
    public static void main(String[] args) // --- Massive "args" which we will use further
    {
        // ------ example of IF and ELSE
        /*int var1 = 10;
        if (var1 < 9)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }*/

        // --- go to Edit Configuration and set Program Arguments to some value, in this case value = test0 test1 test2
        // --- print values form Massive "args"
        System.out.println(args[0] + " " + args[1] + " " + args[2]);
        // --- create string variable(s) and assign to it(them) value(s) from massive "args"
        String argsPar0 =args[0];
        String argsPar1 =args[1];
        String argsPar2 =args[2];

        String argsVal0 = "test0";
        // --- compare variable using oprator "equals" with some value
        // --- operator "&&" means "and"
        // --- variable.equals("somevalue") = true
        // --- !variable.equals("somevalue") = false
        if (argsPar0.equals(argsVal0) && argsPar1.equals("test1") && argsPar2.equals("test2"))
        {
            System.out.println("Text is correct");
        }
        else
        {
            System.out.println("Text is incorrect");
        }

        //
    }
}

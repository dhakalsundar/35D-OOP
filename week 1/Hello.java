
/*public class Hello{
    public static void main(String[] args) {
        /* 1. Write a program that prints Hello World! to the console. Save the program as Hello.java.*/
        /*  System.out.println("Hello World!");*/

        /*  2. Extend/Modify the above program to print two additional lines:

This is my first program

I am on module ST4003CEM

System.out.print (not println) and produces the same output.*/

/*public class Hello {
    public static void main(String[] args) {
        System.out.println("This is my first program!\n");
        System.out.println("I am on module ST4003CEM");
 } 
}    */


/*3. Write a program that prints the following output:

A "quoted" String is

'much' better if you learn

the rules of "escape sequences."

Also, "" represents an empty

String. Don't forget: use \"

instead of " !

'' is not the same as " */

/*public class Hello{
    public static void main(String[] args) {
        System.out.println("A \"quoted\" String is");
        System.out.println("'much' better if you learn");
        System.out.println("the rule of \"escape sequences.\"");
        System.out.println("Also, \"\"represent an empty");
        System.out.println("String.\"Don't\"forget: use\\\"");
        System.out.println("insted of \"!''is not the same as \\");

    }
}*/

/*4. WAP that prints the following pattern:

*

**

***

**** */

/*public class Hello{
    public static void main(String[]args){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }
}

/*5. WAP prints the following pattern:

*********

*********

*********

********* */

/*public class Hello{
    public static void main(String[]args){
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
    }
}*/

/* 6. WAP that prints the following output:

A well-formed Java program has a main method with { and } braces.



A System.out.println statement has ( and ) and usually a String that starts and ends with a " character.

(But we type \" instead!)

What is the difference between

a ' and a "?  Or between a " and a \"?



One is what we see when we're typing our program. The other is what appears on the "console."*/

public class Hello{
    public static void main(String[] args){
        System.out.println("A well-formed java program has a main method with { and } braces.");
        System.out.println("A System.out.println statement has ( and ) and usually a String that starts and ends with a \" character.");
        System.out.println("(But we type \\\" instead!)\n");
        System.out.println("What is the difference between\n");
        System.out.println("a ' and a \"? Or between a \" and a \\\"?\n");
        System.out.println("One is what we see when we're typing our program. The other is what appears on the \"console.\"");
    }
}
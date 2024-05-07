//import java.util.Scanner;
/* or
 * import java.util.*;
 */
// public class InputOutput { 
//     public static void main(String[] args) {
//         /* User Output */
//         System.out.println("This sentence will have line break");
//         /* System.out.print */
//         System.out.print("This will not have break");
//         System.out.print("This line will continue. \n");
//         /* String formating using System.out.print
//          * %s String, %d Integral, ;
//          * %f floating point, %b boolean
//          * This will also not break line
//          */
//         System.out.printf("Hello %s, good morning", "world");
//         System.out.printf("This number is %d", 10);
//         /* can use multiple formatter */
//         System.out.printf("\nThe floating %f and boolean %b", 10.3f, false);

//         /* User input
//          *  import java.util.scanner; // copy this line at the top of the code
//          */
//         Scanner scan = new Scanner(System.in);
//         System.out.println("The following take whole sentence");
//         String wholeOutput = scan.nextLine();

//         System.out.println("The input take is" + wholeOutput);
//         System.out.println("The following take intiger");
//         int intInput = scan.nextInt();

//         System.out.println("The input take is" + intInput);
//         System.out.println("The following take double");
//         double doubleInput= scan.nextDouble();

//         System.out.println("The input taken is" + doubleInput);
//         System.out.println("The following takes boolean");

//         boolean booleanInput = scan.nextBoolean();
//         System.out.println("The input taken is" + booleanInput);
//         scan.close();// you must close the scanner once all input is taken

        /* Task
         * make a new scanner object scan1
         * Promote the following and take input
         * What is your name? save the input to string -> name
         * Are you over 18? Save the input to boolean -> status
         * How many sibling? save the input to integer-> sibling
         * print the following
         * Hello name,
         * Over 18?, status
         * you have sibling number of sibling 
         */
 
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Create a new scanner object
        Scanner scan1 = new Scanner(System.in);

        // Prompt user for their name and save it to a variable
        System.out.print("What is your name? ");
        String name = scan1.nextLine();

        // Prompt user to know if they are over 18 and save it to a variable
        System.out.print("Are you over 18? (true/false) ");
        boolean status = scan1.nextBoolean();

        // Prompt user for the number of siblings and save it to a variable
        System.out.print("How many siblings do you have? ");
        int siblings = scan1.nextInt();

        // Print the collected information
        System.out.println("Hello " + name + ",");
        System.out.println("Over 18? " + status);
        System.out.println("You have " + siblings + " number of siblings");

        // Close the scanner
        scan1.close();
    }

    }
    

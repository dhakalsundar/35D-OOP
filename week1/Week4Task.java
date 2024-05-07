
/*Task To Do
1. Write a program that asks your name and prints “Hello your name” five times. Use a loop.
import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + name);
        }
    }
}
2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
Miles    Kilometers
1    1.609
2    3.218
…    ….
9    14.481
10    16.090
import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of miles: ");
        int miles = scanner.nextInt();
        System.out.println("Miles\tKilometers");
        for (int i = 1; i <= miles; i++) {
            System.out.println(i + "\t" + (i * 1.609));
        }
    }
}
3. Write a program that generates the following table: 
Number    Square
10    100
9    81
..    ….2    4
1    1
import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Number\tSquare");
        for (int i = number; i >= 1; i--) {
            System.out.println(i + "\t" + (i * i));
        }
    }
}
4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:
*****
*****
*****
*****
*****
import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a width: ");
        int width = scanner.nextInt();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:
Sample Run:
Enter a positive non-zero integer 4
Sum of 1 to 4 is 10
Do you want to continue? Enter ‘y’ for yes or any other character for no.
y
Enter a positive non-zero integer 3
Sum of 1 to 3 is 6
Do you want to continue? Enter ‘y’ for yes and any other character for no.
n.
import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;
        do {
            System.out.println("Please enter a width: ");
            int width = scanner.nextInt();
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Do you want to continue? (y/n)");
            response = scanner.next();
        } while (response.equals("y"));
    }
}
6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:
*
**
***
****
*****
Use a nested for loop to generate the above pattern.
import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a width: ");
        int width = scanner.nextInt();
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
7. Write a program to calculate the HCF of Two given numbers.
public class Week4Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = scanner.nextInt();
        int hcf = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);
    }
}

8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num = scanner.nextInt();
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        System.out.println("The reversed number is " + reversed);
    }
}
9. Write a program that reads ten integer numbers and outputs the number of inputs which are greater than 50, less than 50 or equal to 50. The program should also display the average of all numbers greater than 50 and the average of all numbers less than 50.
import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGreaterThan50 = 0;
        int countLessThan50 = 0;
        int countEqualTo50 = 0;
        int sumGreaterThan50 = 0;
        int sumLessThan50 = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter an integer: ");
            int num = scanner.nextInt();
            if (num > 50) {
                countGreaterThan50++;
                sumGreaterThan50 += num;
            } else if (num < 50) {
                countLessThan50++;
                sumLessThan50 += num;
            } else {
                countEqualTo50++;
            }
        }
        double avgGreaterThan50 = (double) sumGreaterThan50 / countGreaterThan50;
        double avgLessThan50 = (double) sumLessThan50 / countLessThan50;
        System.out.println("Number of inputs greater than 50: " + countGreaterThan50);
        System.out.println("Number of inputs less than 50: " + countLessThan50);
        System.out.println("Number of inputs equal to 50: " + countEqualTo50);
        System.out.println("Average of inputs greater than 50: " + avgGreaterThan50);
        System.out.println("Average of inputs less than 50: " + avgLessThan50);
    }
}
10. Write a program that asks the user for a positive nonzero integer value. The program should use a loop to get the sum of all the integers from 1 up to the number entered. For example, if the user enters 50, the loop will find the sum of 1+2+3+4+….+50.
import java.util.Scanner;

public class Week4Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive nonzero integer value: ");
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Invalid input. Please enter a positive nonzero integer value.");
        } else {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("The sum of all the integers from 1 up to " + num + " is " + sum);
        }
    }
}*/

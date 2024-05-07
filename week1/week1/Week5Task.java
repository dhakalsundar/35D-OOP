/*1. Make a method to check if a number is prime or not.

public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

2. Make a method to check if a given number n is even or not.

public static boolean isEven(int num) {
    return num % 2 == 0;
}

3. Make a method to print the table of a given number n.

public static void printTable(int num) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
    }
}

4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.

public static int multiply(int num1, int num2, int num3) {
    return num1 * num2 * num3;
}

5. Write a program for calculating Simple Interest using a method and print the result from the method itself.

public static double calculateSI(double principal, double rate, double time) {
    return (principal * rate * time) / 100;
}

6. Write a program to calculate the area of a rectangle using a method of your choice.

public static double calculateRectangleArea(double length, double width) {
    return length * width;
}

7. Calculates the factorial of a given number using the Java method.

public static long calculateFactorial(int num) {
    long result = 1;
    for (int i = 2; i <= num; i++) {
        result *= i;
    }
    return result;
}

8. Calculate the nth Fibonacci number using the method.

public static long calculateFibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    long prevPrev = 0;
    long prev = 1;
    long current = 0;
    for (int i = 2; i <= n; i++) {
        current = prev + prevPrev;
        prevPrev = prev;
        prev = current;
    }
    return current;
}

9. Write a Java program to find the greatest common divisor (GCD) of two numbers.

public static int findGCD(int num1, int num2) {
    if (num2 == 0) {
        return num1;
    }
    return findGCD(num2, num1 % num2);
}

10. Write a Java program to display all prime numbers less than a given number and count all the prime numbers less than that number using functions.  

Your program should contain two functions: 

a.    print_prime_less_than that takes a number as a parameter and prints the prime number less than that number 

b.    is_prime that takes a number as a parameter and then returns whether that number is prime. */

package week1;
public class Week5Task {
public static boolean isprime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

public static void printPrimeLessThan(int num) {
    int count = 0;
    for (int i = 2; i < num; i++) {
        if (isprime(i)) {
            System.out.print(i + " ");
            count++;
        }
    }
    System.out.println("\nTotal prime numbers less than " + num + ": " + count);
}}
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int num1 = 0;
        while(num1 < 0){
            System.out.println("While checks condition first");

        }
        /* Do while checks condition after first iteration */
        do{
            System.out.println("Do while checks condition after");

        }while(num1 < 0);
        /* This means do while loop run at least once */

        /* use a while loop to
         * ask user for an int value
         * if the user is input positive value
         * promt user to input negative value
         * loop until the user input negative int value
         */

        int num;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a negative integer:");
        num = scanner.nextInt();

        while (num >= 0) {
        System.out.println("Please enter a negative integer:");
        num = scanner.nextInt();
        }scanner.close();
    }
    
}

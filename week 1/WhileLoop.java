import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        /* While takes boolean expression inside()
         * the loop will run respectively when the boolean is true
         * If the boolean is false the loop will end
         */
        while (count < 5){
            System.out.println("While loop" + count);
            ++count;
        }
        /* inside the loop the condition is checked at the begining
         * if the condition is false in initial check the loop will not run
         */
        System.out.println("Please type the value between 0-100");
        Scanner scan  = new Scanner (System.in);
        int inputvalue = scan.nextInt();
        while( inputvalue < 0 || inputvalue > 100){
            System.out.println("Please input between 0-100");
            inputvalue = scan.nextInt();

        }
        System.out.println("End loop");
        scan.close(); 
    }
    
}

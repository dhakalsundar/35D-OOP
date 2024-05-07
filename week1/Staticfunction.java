public class Staticfunction{
    /* in the following public and static is optional */
    public static int addTwoNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static String vendingMachine(int menu){
        if( menu == 1){
            return "Coke";
        }
        if( menu == 2){
            return "Water";
    }
        if (menu == 3){
        return " Frooti";
    }
        return "Nothing";
        
    }
      /* Task make a function checkEven
         * that takes one int
         * that returns a boolean
         * if the int is even return true else false
         */
    public static boolean checkEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
     /* task 2 
         * make a function checkEligible
         * that takes one int age, one String name
         * if the age is < 18
         * return String "Sorry name, you are not eligible"
         * else return " Congraturation name, you are eligible"
         */
        public static String checkEligible(int age, String Hakku) {
            if (age < 18) {
                return "Sorry " + Hakku + ", you are not eligible to vote.";
            } else {
                return "Congratulations " + Hakku + ", you are eligible to vote.";
            }
        }

        /* Task3 
         * make a function makeMultiply
         * that takes 2 double
         * return a double with the multiplication of two
         */
        public static double makeMultiply(double num1, double num2) {
            return num1 * num2;
        }


    public static void main(String[] args) {
        // if a function is static no need to make object
        // if the function is static in same class you can simple call the method
        int sumReturn = addTwoNumber(10, 30);
        System.out.println("This sum is " + sumReturn);

        String frooti = vendingMachine(3);
        System.out.println("Frooti check" + frooti);

    }
    
}

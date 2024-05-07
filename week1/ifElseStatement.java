public class ifElseStatement {
    public static void main(String[] args) {
        /* Simple if example */
        if (true){
            System.out.println("True statement");
        }
        /* If tasks an expression with boolean  */
        int num1 = 10, num2 = 20;
        if(num1 > num2){
            System.out.println("Greater");
        }else{
            System.out.println("Lesser");
        }
        /* If else if, two condition  */
        if(num1 == num2){
            System.out.println("Equals");
        }else if (num1 < num2){
            System.out.println("Lesser num2");
        }else{
            System.out.println("Greater");
        }
        /* Note that else should ba at last and is not mandatory */
        /* If else if ladder multiple conditio */

        if (num1 < 0){
            System.out.println(" Num1 is negative");

        }else if(num2 < 0){
            System.out.println("num 2 is negative");
        }else if (num1 != num2){
            System.out.println("Not equal");
        }else if( num1 > num2){
            System.out.println("Greater");
        }else{
            System.out.println("Default statement");
        }
        /* If any condition matches it will all the remaining condition including else, condition will be checked from top-bottom */

        /* Nested if condition */
        if(num1>0){
            if(num1 > num2){
                System.out.println("Positive and Greater");
            }else{
                System.out.println("Positive and lesser");
            }
        }else{
            if (num1> num2){
                System.out.println("Negative and Greater");
            }else{
                System.out.println("Negative and lesser");
            }
       }


    }
    
}

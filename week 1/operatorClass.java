public class operatorClass {
    public static void main(String[] args) {
        /* Arthematic Operation */
        int a =10, b = 10;
        int sum = a+b; // here the "+" is an arithmetic operation
        System.out.println("Addition for a+b is" +sum);
        System.out.println("Difference for a-b is" + (a-b));
        System.out.println("Multiplication for a*b is" +(a*b));
        System.out.println("Division for a/b is" +(a/b));
        System.out.println("Module for a and b is" + (a%2));

        /* Assignment Operation */
        int aNumber1;
        aNumber1 = 10;
        /* or declear and assign */
        int aNumber2 = 20;
        /* assign with another variable */
        int aNumber3 = aNumber1;
        System.out.println("Assignment with += " + (aNumber1+=10));
        aNumber2 -= 30; // same as aNumber2 = aNumber2 -30;
        System.out.println("Assignment with -=" + aNumber2);
        

    }
    
}

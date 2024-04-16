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

         /* Relational Operation */
         int rNumber1 = 10, rNumber2 = 20;
         System.out.println("rNumber1 equal to rNumber2?" + (rNumber1 == rNumber2));
         System.out.println("rNumber1 greater than rNumber2?" + (rNumber1 > rNumber2));
         System.out.println("rNumber1 lessthan or equal to rNumber2?" + (rNumber1 <= rNumber2));
         System.out.println("rNumber1 notequal to rNumber2?" + (rNumber1 != rNumber2));
        
         /* Logical Operation */
         int lNumber1 = 10, lNumber2 = 12;
         boolean lExpression1 = lNumber1 == lNumber2;
         boolean lExpression2 = lNumber1 <= lNumber2;
         System.out.println("And operation uses &&" + (lExpression1 && lExpression2));
         System.out.println("Or operation uses ||" + (lExpression1 || lExpression2));
         System.out.println("Not operator uses!" + !lExpression1);

         /* Unary operator */
         int uNumber1 = 10;
         uNumber1++; // meaning uNumber1 = uNumber1 + 1;
         System.out.println("Unary for increament is ++" + uNumber1);
         uNumber1--;
         System.out.println("Unary for decrement is --" + uNumber1);

         /* Ternary operator */
         int tNumber1 = 10 , tNumber2 = 10;
         boolean tExpression = tNumber1 == tNumber2;
         /*
          * one line if else, see the given example in if else
          string output;
          if(tExpression == true){
            output = "True statement";
          }else{
            output = "False statement";
          }
          */
          String output = tExpression ? "True Statement" : "False Statement";
          /* Here we can assign a string out with one expression
           * if expression is true it will return the value after the"?"
           * if the expression is false it wil return the value after the":"
           */
          int numberOutput = tNumber1 < tNumber2 ? 10:20;
          System.out.println(output);
          System.out.println(numberOutput);




    }
    
}

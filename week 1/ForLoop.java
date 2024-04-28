public class ForLoop {
    public static void main(String[] args) {
        /* use for loop when condition is fixed */
        for( int index =0; index < 5; index ++){
            System.out.println("Loop running" + index);
        }

        /* Decrement loop */
        for( int index = 10; index >=0 ; index --){
            System.out.println("Loop running" +index);

        }
        /* Make the loop table for this */
        /* Task
         * Make a multiplication table of 2
         * print like the following
         * 2*1=2
         * 2*2=4
         * .
         * .
         * 2*10=20
         * note: inilitalize 1
         * condition <=10 or < 11
         * Increment ++
         */
        
            
                int number = 2;
                int max = 10; 
        
                for (int i = 1; i <= max; i++) {
                    System.out.println(number + " * " + i + " = " + (number * i));
                }
            }
        }


    

    


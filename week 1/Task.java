
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

         public class Task {
            public static void main(String[] args) {
                int number = 10; 

                
                int max = 10; 
        
                for (int i = 1; i <= max; i++) {
                    System.out.println(number + " * " + i + " = " + (number * i));
                }
            }
        }


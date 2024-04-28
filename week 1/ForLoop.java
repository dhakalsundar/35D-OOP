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
       

        /* Nested loop */
        for (int outer = 0; outer < 3; outer ++){
            for ( int inner = 2; inner >= 0; inner --){
                System.out.println("Inner" + inner);
            }
            System.out.println("Outer " + outer);
        } 
        

    }

    
}

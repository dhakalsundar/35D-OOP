public class jumpstatement {
    public static void main(String[] args) {
        /* break and continue are jump statement in java */
        /* brek will terminate the loop */
        for (int index = 0; index < 5; index ++){
            if(index==3){
                break; // this line will break the loop scope

            }
            System.out.println("Index" + index);
        }
        /* can be used in any loop */
        int count = 0;
        while(count <=10){
            if(count == 1){
                break;

            }
            System.out.println("Count" + count);
            count++;


        }
        /* continue statement will skip the loop */
        for (int index = 0; index < 5; index ++){
            if (index == 3){
                continue;
            }
            System.out.println("Continue index" + index);

        }
        /* Task WAP to run for loop from -5 to 5
         * break the loop if the index is positive
         */
        for (int index = -5; index <= 5; index++) {
            if (index > 0) {
                break;
            }
            System.out.println("Index: " + index);
        }

         /* Task 2
          * Loop from 1 - 20 using any loop
          Only print the value if it is even 
          use continue to do this task
          */
          for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }


    }
    
}

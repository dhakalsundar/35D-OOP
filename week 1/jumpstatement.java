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
    }
    
}

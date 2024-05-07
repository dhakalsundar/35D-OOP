public class ArrayClass {
    public static void main(String[] args) {
        /* to create an array define datatype followed by [] */
        int[] myFirstArray;
        /* initializating the array we need new reference  */
        myFirstArray  = new int[6]; // here the new int[6] -> refers to the size of array
        /* the size of array can be further access by length */
        int myFirstArrayLength = myFirstArray.length;
        System.out.println("My First array size is" + myFirstArrayLength);

        /* using index for array operation */
        myFirstArray[0] = 10;
        myFirstArray[1] = 30;
        myFirstArray[2] = 100;

        /* to print the array use the same index */
        System.out.println("The first eliment is in 0 index" + myFirstArray[0]);
        /* can also create a new int value */
        int secondArrayIndex = myFirstArray[1];
        System.out.println("The second element stored" + secondArrayIndex);
        
        /* Decleration and initialization */
        int[] mySecondArray = new int[6];
        
        /* Decleration, initialization and value assign */
        int[] myThirdArray = {10, 20, 30, 0, 100};
        /* or using constructor */
        int[] myForthArray = new int[] {1, 2, 3, 4};

        /*Task
         * create a array of int called myfifth array
         * with size of 5
         * insert the value of 10, 20 ,30, 40, 50
         * print the value of an array as well as the multiplied by 2
         * Eg:
         * 10 20
         * 20 40
         * 30 60
         * 40 80 
         * 50 100
         */

                int[] myfifthArray = new int[5];
                myfifthArray[0] = 10;
                myfifthArray[1] = 20;
                myfifthArray[2] = 30;
                myfifthArray[3] = 40;
                myfifthArray[4] = 50;
        
                for (int i = 0; i < myfifthArray.length; i++) {
                    System.out.println(myfifthArray[i] +"\t" + myfifthArray[i] * 2);
                }
            }
        }

        

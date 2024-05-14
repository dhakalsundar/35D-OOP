public class multidimarray {
    public static void main(String[] args) {
        /*create N-dimension array add number of squate bracked */
        /* 1D Array */
        int[] oneDArray;
        /* 2D Array */
        int[][] twoDArray;

        /* 3D Array */
        int[][][] threeDArray;

        /* Allocating memory/ size*/
        twoDArray = new int[3][5];
        /* first size 3 represent how many inner array */
        /* second size 5 represent how many value in inner array */

        /*[
            [0,0,0,0,0], -> 0
            [0,0,0,0,0], -> 1
            [0,0,0,0,0], -> 2
        ]
         */
        /* to make the first inner array use index */
        twoDArray[0];
        /* to take the value in first inner array use internal index */
        twoDArray[0][0] = 10;
        twoDArray[0][1] = 20;
        twoDArray[1][2] = 100;
        twoDArray[2][4] = 200;

        /* fill the array like the following
         * [
         * [10,20,30,40,50,], -> 0
         * [80,90,100,110,120], ->1
         * [150,160,170,180,200], ->2
         * ]
         */
                int[][] twoDArray = {
                    {10, 20, 30, 40, 50},  // Row 0
                    {80, 90, 100, 110, 120},  // Row 1
                    {150, 160, 170, 180, 200}  // Row 2
                };
        
                // Access elements in the array
                System.out.println("Accessing elements:");
                System.out.println("twoDArray[0][0] = " + twoDArray[0][0]);  // Output: 10
                System.out.println("twoDArray[1][2] = " + twoDArray[1][2]);  // Output: 100
                System.out.println("twoDArray[2][4] = " + twoDArray[2][4]);  // Output: 200
            }
        }

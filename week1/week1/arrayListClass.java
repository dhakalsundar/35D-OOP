package week1;
import java.util.ArrayList;
public class arrayListClass {
    public static void main(String[] args) {
        /* to use Arraylist import at the top like scanner from java.utils */
        ArrayList<String> animals = new ArrayList<>();
        /* size is automatically allocated according to the element */
        /* to add data in animal */
        animals.add("cat");
        animals.add("Dog");
        animals.add("Elephant");
        System.out.println(animals);
        /* can add element directly to index, it will shift rest to +1 of index */
        animals.add(1, "Tiger");
        System.out.println("animals");
        /* notice how the previous 1 and rest are shifted by 1 index */

        /* to remove use. remove (index) */
        animals.remove(2);
        System.out.println(animals);
        /* it will remove the item/element in 2nd index */

        // to update .set (index, value)
        animals.set(1, "Snake");
        System.out.println(animals);
        // to access cannot use [index] -> square bracket, use .get(index)
        System.out.println(animals.get(0)); // get 0th indexed element

        /* task
         * Make an arraylist of int
         * [100,200,300,400,500]
         * remove the value 300
         * Add -100 at the first of array list
         * change 200 -> 210
         * change 400 -> 420
         * print the array list
         */
        ArrayList <Integer> intList = new ArrayList<Integer>();
        intList.add(100);
        intList.add(200);
        intList.add(300);
        intList.add(400);
        intList.add(500);
 
        intList.remove(2);
        intList.add(0,-100);
        intList.set(1,210);
        intList.set(3,420);
        System.out.println(intList);
    }
}
    
   
    
           




    


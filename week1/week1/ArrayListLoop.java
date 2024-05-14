package week1;
import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args) {
        /* import Arraylist from java.util */
        ArrayList<String> names = new ArrayList<>();

        names.add("Aayam");
        names.add("Aadhar");
        names.add("Aarav");
        names.add("Niraj");
        names.add("Rijan");

        /* to loop, find the length/element count, .size() */
        int namesLength = names.size();
        /* loop same as array  */
        for (int index = 0; index < namesLength; index++){
            //get each element with .get(index)
            String singleName = names.get(index);
            System.out.println("Index :" + index + " value" + singleName);   
        }

        /* using foreach in java, iterate with element/ actual value */
        for (String element : names) {
            System.out.println(element);
            
    }
    
}
}

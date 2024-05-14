package week1;
import java.util.Arrays;
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
     /*Task
         * make ande arraylist animals
         * ["Cat","Tiger","Dog","Elephant"]
         * make two more arraylist called wildanimal ,domestic animal
         * loop the animals
         * if the element/value is "Cat", 'Dog" add in domestic animal
         * same for 'Tiger AND "elephant'
         * print domestic animal and widl animal
         *
         */
        ArrayList <String> animals = new ArrayList<String>(Arrays.asList("Cat","Tiger","Dog","Elephant"));
        ArrayList<String> wildanimal = new ArrayList<>();
        ArrayList<String> domesticanimal = new ArrayList<>();
        for(String animal : animals) {
            if(animal == "Cat" || animal == "Dog") {
                domesticanimal.add(animal);
        }else{
            wildanimal.add(animal);
        }

System.out.println("Wild animal: "+ wildanimal);
System.out.println("Domestic animal: "+ domesticanimal);
}
    }
}
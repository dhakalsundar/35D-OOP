public class InheritanceConstruction {
    public static void main(String[] args) {
        TShirt ts1 = new TShirt();
        ts1.nameDifference("New");
        TShirt ts2 = new TShirt ("My shirt");
    }
}

class Shirt{
    String name = "Parent Shirt"; // super.name
    String type;
    Shirt(){
        System.out.println("parent constructor");
    }
    Shirt(String name){
        this.name = name;
        System.out.println("parent constructor with String params");
    }
    }

    class TShirt extends Shirt{
        String name= "Class shirt"; // this.name
        TShirt(){
            // defult parent construction is called automatically
            // super () or Shirt()
            System.out.println("child constructor");
        }

        // overloading
        //same name function with different logic/ parameters
        TShirt(String name){
            this.name = name;
            System.out.println("child with String params");
        }
        TShirt(int number){
            

        }
        TShirt(String name, int number){

        }
        void nameDifference(String name){
            System.out.println("Param name" + name);
            System.out.println("Class name" + this.name);
            System.out.println("Parent name" + super.name);
        }
    }

public class Polymorphism {
public static void main(String[] args) {
    mathoperation mo = new mathoperation();
    System.out.println(mo.add(10,20));
    System.out.println(mo.add(1,2,3));
    mo.add();

    // method overriding
    //polymorphism allow parent class to
    // hold child class object
    Document d1 = new Document();
    d1.print("Dell XPS");
    Document d2 = new MSWord();
    d2.print("Xeroz");
    // when doing so, though we are creating
    // from childclass msword() we can only function/attribute from document
    Document d3 = new office365();
    d3.print("Xeroz");
    // cannot access d3.internet
    
}    
}
// method overloading
//same function with different in parameter
class mathoperation{
    int add(int num1, int num2){
        return num1+num2;
    }
    //1. method overloading with change in number of parameter
    int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    //2. method overloading with change in data type of parameter
    double add(double num1, double num2){
        return num1+num2;
        }

  //Note :the change in return type does not determine overloading
    //method overloading only determine with change in parameter
    //Eg:int add(int a,int b) -> not allowed as function with 2 int is already made

    void add(){
        System.out.println("invalid operation");
    }
}

// method overriding
// when childclass has the same function as parent class
class Document{
    public void print(String printer) {
    System.out.println("Document Printing");
    }
}
// method overeiding can only be done in child class
class MSWord extends Document{
    @Override
    public void print (String printer) {
        System.out.println("MSWord Printing");
        }
        }
class office365 extends MSWord{
    boolean internet = true;
    // overriding can be done in multi layer inheritance
    @Override
    public void print(String printer){
        System.out.println("Online Printer");
    }
}        

// Homework

// Make a class Spreadsheet
// Make a function addRow that takes one int -> print( int row added)
// Make a function addColumn that takes one int -> print( int coloumn added)
// Make a subclass from Spreadsheet, MsExcel
// override both the function and print different output
// make attribute fileType as String
// Make an object of Spreadsheet
// Make an Object of Spreadsheet as MsExcel
// run both function from each object

// Task
// Make a function substraction
// take two int and return int
// take three double and return double
// take 1 double and print invalid operation
// take 1 int and print invalid operation
// take 2 int and double and return double
// call these function from MathOperation object 
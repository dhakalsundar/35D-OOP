package week1;

public class AccessModifier {
    public static void main(String[] args) {
        
    }
    
}
class AccessExample{
    private int intValue; // Can only be used only inside class scope
    public String strValue; // can be used anywhere
    boolean boolVal; // automatically  default, can be used only inside a same package/folder

    // similarly can be used in function

    private void dopublic(){
        System.out.println("I can be accessed only in this class");

    }
    public void doPublic(){
        System.out.println("I can accessed from anywhere");
    }

    void doDeafult(){
        System.out.println("I can be accessed only in this package/folder");
    }
    // private can be used jin class
    void setPrivate(){
        intValue = 100; // private can be accessed here
        doPrivate(); // same goes to private functions
    }
}

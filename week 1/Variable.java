public class Variable {
    public static void main(String[] args) {
        /* Non Primitive data type */
        /*Declaration */
        byte bytevalue;
        /* Initialization */
        bytevalue = 100;
        /* Decleration and Initialization */
        short Shortvalue = 200;
        /* Multiple declaration */
        int intvalue1, intvalue2;
        intvalue1 = 10000;
        intvalue2 = 2000;
        /* multiple decleration and initialization */
        long longval1 = -9000, longval2 = 9000;
        float floatvalue = 90.90f;// the letter 'f' is needed
        double doublevalue = 100.897d; // the letter 'd' is optional
        char charvalue = 'c'; // must use single quote
        boolean booleanvalue = false;
        /* Illegal action below */
        // byte bytevalue = 100; // we cannot redeclare the variable
        // bytevalue = 200; // insted use reassignment
        // boolean boolval2 = 'false'; // cannot use different type
        // byte bytevalue2 = 10000000000; // cannot exceed min and max

        /* Non primitive data type*/ 
        String stringvalue = "This is a string value";
        /* using class */
        String stringvalue2 = new String("This string uses class");
        System.out.println(stringvalue2);
        /* object, for this we can use the same public class made */
        Variable variableobject = new Variable();
    }
    
}


public class Variable {
    /* Instance variable
     * well need object to acess this variable
     * Not shared between the object
     */

     int instancevariable = 100;
     /* static/class variable
      * No need of object, can be called from class
      Shared between the objects
      */
    
}
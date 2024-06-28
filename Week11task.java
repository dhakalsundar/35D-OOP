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
// Class Spreadsheet
class Week11task {
    public static void main(String[] args) {
        Spreadsheet spreadsheet = new Spreadsheet();
        spreadsheet.addRow(5);
        spreadsheet.addColumn(7);

        MsExcel msExcel = new MsExcel("xlsx");
        msExcel.addRow(3);
        msExcel.addColumn(4);

        MathOP newmaths = new MathOP();
        System.out.println(newmaths.subtraction(10, 5));
        System.out.println(newmaths.subtraction(10.0, 5.0, 2.0));
        newmaths.subtraction(10.0);
        newmaths.subtraction(10);
        System.out.println(newmaths.subtraction(10, 5, 2.0));
    }
}
 class Spreadsheet {
     void addRow(int row) {
        System.out.println(row + " row added");
    }

     void addColumn(int column) {
        System.out.println(column + " column added");
    }
}

 class MsExcel extends Spreadsheet {
    private String fileType;

     MsExcel(String fileType) {
        this.fileType = fileType;
    }

    @Override
     void addRow(int row) {
        System.out.println(row + " row added in " + fileType);
    }

    @Override
     void addColumn(int column) {
        System.out.println(column + " column added in " + fileType);
    }
}

 class MathOP {
     int subtraction(int a, int b) {
        return a - b;
    }

     double subtraction(double a, double b, double c) {
        return a - b - c;
    }

     void subtraction(double a) {
        System.out.println("Invalid operation");
    }

     void subtraction(int a) {
        System.out.println("Invalid operation");
    }

     double subtraction(int a, int b, double c) {
        return a - b - c;
    }
}

 
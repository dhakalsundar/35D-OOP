/* 1 To check if a person can cast a vote or not, you can use the following code:

public class week2task {
    public static void main(String[] args) {
        int age = 18; 
        if (age >= 18) {
            System.out.println("You can cast a vote.");
        } else {
            System.out.println("You cannot cast a vote.");
        }
    }
}*/
/* 2 To calculate simple interest, you can use the following code:

public class week2task {
    public static void main(String[] args) {
        double principleAmount = 1000;
        int time = 2; 
        double rate = 5; 
        double simpleInterest = (principleAmount * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
3 To calculate the area of a triangle and the volume of a cube and cuboid, you can use the following code:

public class week2task {
    public static void main(String[] args) {
        double base = 5; 
        double height = 10; 
        double side = 3; 
        double areaOfTriangle = 0.5 * base * height;
        double volumeOfCube = side * side * side;
        double length = 4; 
        double width = 5; 
        double heightOfCuboid = 6; 
        double volumeOfCuboid = length * width * heightOfCuboid;
        System.out.println("Area of Triangle: " + areaOfTriangle);
        System.out.println("Volume of Cube: " + volumeOfCube);
        System.out.println("Volume of Cuboid: " + volumeOfCuboid);
    }
}
The ternary operator for question no. 1 can be used as follows:

public class week2task {
    public static void main(String[] args) {
        int age = 18; 
        String result = (age >= 18)? "You can cast a vote." : "You cannot cast a vote.";
        System.out.println(result);
    }
}
To take two integer inputs from the user and print the sum and product of them, you can use the following code:

public class week2task {
    public static void main(String[] args) {
        int num1 = 5; 
        int num2 = 10; 
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
To take two integer inputs from the user, calculate the sum of two, then the product of two, and finally calculate the division of the thus obtained sum and product and print the result, you can use the following code:

public class week2task {
    public static void main(String[] args) {
        int num1 = 5; 
        int num2 = 10; 
        int sum = num1 + num2;
        int product = num1 * num2;
        double division = (double) sum / product;
        System.out.println("Division: " + division);
    }
}
To take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz, you can use the following code:

public class week2task {
    public static void main(String[] args) {
        String name = "John Doe"; 
        int rollNumber = 123;
        String fieldOfInterest = "Computer Science"; 
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest are " + fieldOfInterest + ".");
    }
}
To take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input, you can use the following code:

public class week2task {
    public static void main(String[] args) {
        double side = 5; 
        double areaOfSquare = side * side;
        double perimeterOfSquare = 4 * side;
        System.out.println("Area of Square: " + areaOfSquare);
        System.out.println("Perimeter of Square: " + perimeterOfSquare);

        double principleAmount = 1000; 
        int time = 2;
        double rate = 5; 
        double simpleInterest = (principleAmount * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        double base = 5; 
        double height = 10; 
        double areaOfTriangle = 0.5 * base * height;
        System.out.println("Area of Triangle: " + areaOfTriangle);

        double sideOfCube = 3; 
        double volumeOfCube = sideOfCube * sideOfCube * sideOfCube;
        System.out.println("Volume of Cube: " + volumeOfCube);

        double length = 4; 
        double width = 5; 
        double heightOfCuboid = 6; 
        double volumeOfCuboid = length * width * heightOfCuboid;
        System.out.println("Volume of Cuboid: " + volumeOfCuboid);
    }
}
To take two double inputs for length and breadth of a rectangle and print area type casted to int, you can use the following code:

public class week2task {
    public static void main(String[] args) {
        double length = 4; 
        double breadth = 5; 
        int area = (int) (length * breadth);
        System.out.println("Area: " + area);
    }
}
To calculate the total marks of four subjects of a student and the total percentage secured, and use the following conditions to generate the final result, you can use the following code:
public class week2task {
    public static void main(String[] args) {
        int sub1 = 70;
        int sub2 = 60; 
        int sub3 = 50; 
        int sub4 = 40; 
        int totalMarks = sub1 + sub2 + sub3 + sub4;
        double percentage = (totalMarks * 100) / 400.0;
        String result = (percentage >= 70)? "First Class" : (percentage > 59)? "Upper Second Class" : (percentage > 49)? "Second Class" : (percentage >= 39)? "Third Class" : "Fail";
        System.out.println("Total Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }
}*/
/* 1 To check if a person can cast a vote or not, you can use the following code:
Copy code
public class week2task {
    public static void main(String[] args) {
        int age = 18; // replace with user input
        if (age >= 18) {
            System.out.println("You can cast a vote.");
        } else {
            System.out.println("You cannot cast a vote.");
        }
    }
}*/
/* 2 To calculate simple interest, you can use the following code:
Copy code
public class week2task {
    public static void main(String[] args) {
        double principleAmount = 1000; // replace with user input
        int time = 2; // replace with user input
        double rate = 5; // replace with user input
        double simpleInterest = (principleAmount * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
3 To calculate the area of a triangle and the volume of a cube and cuboid, you can use the following code:
Copy code
public class week2task {
    public static void main(String[] args) {
        double base = 5; // replace with user input
        double height = 10; // replace with user input
        double side = 3; // replace with user input
        double areaOfTriangle = 0.5 * base * height;
        double volumeOfCube = side * side * side;
        double length = 4; // replace with user input
        double width = 5; // replace with user input
        double heightOfCuboid = 6; // replace with user input
        double volumeOfCuboid = length * width * heightOfCuboid;
        System.out.println("Area of Triangle: " + areaOfTriangle);
        System.out.println("Volume of Cube: " + volumeOfCube);
        System.out.println("Volume of Cuboid: " + volumeOfCuboid);
    }
}
The ternary operator for question no. 1 can be used as follows:
Copy code
public class week2task {
    public static void main(String[] args) {
        int age = 18; // replace with user input
        String result = (age >= 18)? "You can cast a vote." : "You cannot cast a vote.";
        System.out.println(result);
    }
}
To take two integer inputs from the user and print the sum and product of them, you can use the following code:
Copy code
public class week2task {
    public static void main(String[] args) {
        int num1 = 5; // replace with user input
        int num2 = 10; // replace with user input
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
To take two integer inputs from the user, calculate the sum of two, then the product of two, and finally calculate the division of the thus obtained sum and product and print the result, you can use the following code:
Copy code
public class week2task {
    public static void main(String[] args) {
        int num1 = 5; // replace with user input
        int num2 = 10; // replace with user input
        int sum = num1 + num2;
        int product = num1 * num2;
        double division = (double) sum / product;
        System.out.println("Division: " + division);
    }
}
To take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz, you can use the following code:
Copy code
public class week2task {
    public static void main(String[] args) {
        String name = "John Doe"; // replace with user input
        int rollNumber = 123; // replace with user input
        String fieldOfInterest = "Computer Science"; // replace with user input
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest are " + fieldOfInterest + ".");
    }
}
To take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input, you can use the following code:
Copy code
public class week2task {
    public static void main(String[] args) {
        double side = 5; // replace with user input
        double areaOfSquare = side * side;
        double perimeterOfSquare = 4 * side;
        System.out.println("Area of Square: " + areaOfSquare);
        System.out.println("Perimeter of Square: " + perimeterOfSquare);

        double principleAmount = 1000; // replace with user input
        int time = 2; // replace with user input
        double rate = 5; // replace with user input
        double simpleInterest = (principleAmount * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        double base = 5; // replace with user input
        double height = 10; // replace with user input
        double areaOfTriangle = 0.5 * base * height;
        System.out.println("Area of Triangle: " + areaOfTriangle);

        double sideOfCube = 3; // replace with user input
        double volumeOfCube = sideOfCube * sideOfCube * sideOfCube;
        System.out.println("Volume of Cube: " + volumeOfCube);

        double length = 4; // replace with user input
        double width = 5; // replace with user input
        double heightOfCuboid = 6; // replace with user input
        double volumeOfCuboid = length * width * heightOfCuboid;
        System.out.println("Volume of Cuboid: " + volumeOfCuboid);
    }
}
To take two double inputs for length and breadth of a rectangle and print area type casted to int, you can use the following code:
Copy code
public class week2task {
    public static void main(String[] args) {
        double length = 4; // replace with user input
        double breadth = 5; // replace with user input
        int area = (int) (length * breadth);
        System.out.println("Area: " + area);
    }
}
To calculate the total marks of four subjects of a student and the total percentage secured, and use the following conditions to generate the final result, you can use the following code:
Copy code
public class week2task {
    public static void main(String[] args) {
        int sub1 = 70; // replace with user input
        int sub2 = 60; // replace with user input
        int sub3 = 50; // replace with user input
        int sub4 = 40; // replace with user input
        int totalMarks = sub1 + sub2 + sub3 + sub4;
        double percentage = (totalMarks * 100) / 400.0;
        String result = (percentage >= 70)? "First Class" : (percentage > 59)? "Upper Second Class" : (percentage > 49)? "Second Class" : (percentage >= 39)? "Third Class" : "Fail";
        System.out.println("Total Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }
}*/
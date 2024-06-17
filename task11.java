// Task
// You are building a shape hierarchy for a drawing application.
// Design an abstract class named "Shape" with the following abstract methods:
// calculateArea():
// This method should calculate and return the area of the shape.
// calculatePerimeter():
// This method should calculate and return the perimeter of the shape.
// Implement the abstract class and provide concrete implementations for
// the abstract methods. Create subclasses for different shapes such as "Circle," "Rectangle," and "Triangle."
// Each subclass should provide specific implementations for calculating the area and perimeter of that shape.
// Create instances of each shape class and demonstrate
// how you can calculate their respective areas and perimeters.
// 
public class task11 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0, 6.0, 7.0);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
 abstract class Shape {
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

 class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

 class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

 class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}


// Make a class Pant
// Make 2 attribute, texture and color
// Make a class HalfPant that extends Pant
// Make 1 attribute color
// Make a Construtor of Pant that takes texture and color
// Make a Non-Param Constructor for Half pant, and call 
// Parent Parameterized Constructor, "Wool" and "Red"
// Make a function in HalfPant called changePant
// Takes color as params, and set the current color of Pant to HalfPant
// And change the  new color to HalfPant 

public class practiceiheritance {

  public static void main(String[] args) {
    Car myCar = new Car("Toyota", "Camry", 2022);
    myCar.drive();
    myCar.display();

    Book myBook = new Book("To Kill a Mockingbird", "Harper Lee");
    myBook.displayDetails();

    FictionBook myFictionBook = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald");
    myFictionBook.displayDetails();

    NonFictionBook myNonFictionBook = new NonFictionBook("The Diary of a Young Girl", "Anne Frank");
    myNonFictionBook.displayDetails();

    TechnicalBook myTechnicalBook = new TechnicalBook("Java Programming", "John Doe");
    myTechnicalBook.displayDetails();
}
}
class Pant {
 String texture;
 String color;

     Pant(String texture, String color) {
        this.texture = texture;
        this.color = color;
    }

     String getTexture() {
        return texture;
    }

     void setTexture(String texture) {
        this.texture = texture;
    }

     String getColor() {
        return color;
    }

     void setColor(String color) {
        this.color = color;
    }
}


 class Halfpant extends Pant {
    private String color;

   
     Halfpant() {
        super("Wool", "Red"); 
    }

    
     String getColor() {
        return color;
    }

     void setColor(String color) {
        this.color = color;
    }

    
     void changePant(String newColor) {
        super.setColor(newColor); 
        this.color = newColor;
    }
}

/* 
1. Write a Java program to create a class called Vehicle with a method called drive(). 
Create a subclass called Car with method display() method to print details of the Car.


Let's examine the Java program given. 
It involves multiple classes that depict different book types, 
including Book, FictionBook, NonFictionBook, and TechnicalBook. 
The Book class features a constructor and a method called displayDetails(). 
This method is responsible for outputting the title and author of a book. 
The remaining classes inherit both the constructor 
and methods of the Book class as they extend it.
*/ 

 class Vehicle {
     void drive() {
        System.out.println("The vehicle is driving.");
    }
}

 class Car extends Vehicle {
     String make;
     String model;
     int year;

     Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

     void display() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

 class Book {
    private String title;
    private String author;

     Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

     void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

 class FictionBook extends Book {
     FictionBook(String title, String author) {
        super(title, author);
    }
}

 class NonFictionBook extends Book {
     NonFictionBook(String title, String author) {
        super(title, author);
    }
}

 class TechnicalBook extends Book {
     TechnicalBook(String title, String author) {
        super(title, author);
    }
}


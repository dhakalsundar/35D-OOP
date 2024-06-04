   //Create a class car
        // attribute
        // -name
        // -year
        // functions
        // -start() => print Car name is starting
        // -stop() => print Car name of colour is stopping
        // -expiry() => return 100 added to year
        // Create 3 object of car
        // start all object/cars
        // stop only 1st object/car
        // print the expiry of last 2 object/car
package week1;

// class Car {
    
//      String name;
//     int year;

//     public Car(String name, int year) {
//         this.name = name;
//         this.year = year;
//     }

//     void start() {
//         System.out.println(name + " is starting.");
//     }

//     void stop() {
//         System.out.println(name + " is stopping.");
//     }

//     int expiry() {
//         return year + 100;
//     }
// }

// public class task {
//     public static void main(String[] args) {
//         Car car1 = new Car("Toyota", 2020);
//         Car car2 = new Car("Honda", 2018);
//         Car car3 = new Car("Nissan", 2019);

//         car1.start();
//         car2.start();
//         car3.start();

//         car1.stop();

//         System.out.println("Expiry of car2: " + car2.expiry());
//         System.out.println("Expiry of car3: " + car3.expiry());
//     }
// }

// task 2
// -create a class student
// attribute
// - firstname
// -lastname
// -studentId
// -age
// functions
// - fullName() => return firstName + lastName
// -description() => print fullName and studentId
// -overEighteen() => return boolean of weather student is over 18
//make object of your detail
// call sdescription
// print if you are overEighteen or not

 class Student {
     String firstName;
     String lastName;
     int studentId;
     int age;

     Student(String firstName, String lastName, int studentId, int age) {
        firstName = firstName;
        lastName = lastName;
        studentId = studentId;
        age = age;
    }

     String fullName() {
        return firstName + " " + lastName;
    }

     void description() {
        System.out.println("Full Name: " + fullName() + ", Student ID: " + studentId);
    }

     boolean overEighteen() {
        return age >= 18;
    }
}

public class task {
    public static void main(String[] args) {
        Student s = new Student("John", "Doe", 12345, 25);
        s.description();
        System.out.println("Is over 18: " + s.overEighteen());
    }
}
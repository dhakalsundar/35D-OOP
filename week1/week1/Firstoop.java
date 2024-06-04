package week1;

public class Firstoop {
        public static void main(String[] args) {
            Person person1 = new Person();
        person1.name = "Ram";
        person1.age = 10;
        person1.gender = 'M';
        System.out.println(person1.name);
        person1.introduction();

        //Task create two object of the person and call introduction
        Person person2 = new Person();
        person2.name = "Shyam";
        person2.age = 20;
        person2.gender = 'M';
        System.out.println(person2.name);
        person2.introduction();

        Person person3 = new Person();
        person3.name = "Sita";
        person3.age = 30;
        person3.gender = 'F';
        System.out.println(person3.name);
        person3.introduction();

        Rectangle rec1 = new Rectangle();
        rec1.length = 10;
        rec1.breadth = 90;
        int areaRec1 = rec1.area0fRectange();
        System.out.println("Area of rec1 is" + areaRec1);

        
        Student student1 = new Student();
        student1.firstname = "Ram";
        student1.lastname = "Poudel";
        student1.studentID = 1;
        student1.age = 20;
        student1.introduction();

    }

    
}
class Student{
    String firstname;
    String lastname;
    int studentID;
    int age;

    void introduction(){
        System.out.println("FullName :" + firstname + lastname +"StudentID:" + studentID + "Age" + age);
    }

}
class Rectangle{
    int length;
    int breadth;

    int area0fRectange(){
        int area = length * breadth;
        return area;
    }
}

class Person{
    String name;
    int age;
    char gender;

    void introduction(){
        System.out.println("Name :" + name +"Age" + age);
    }
}

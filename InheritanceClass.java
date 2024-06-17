public class InheritanceClass {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.lastname = "Test";
        cc.firstname = "ABC";
        cc.info();
        cc.greet();
        GrandChild gc = new GrandChild();
        gc.lastname = "Doe";
        gc.middlename = "Foo";
        gc.firstname = "John";
        gc.info();
        gc.call();

        labrador lb = new labrador();
        lb.lifespan = 10;
        lb.speaks();

        lb.legs =4;
        lb.fur();

        lb.diet = "MASU";
        lb.bark();

    }
    
}
class ParentClass{
    String lastname;
    private int salary;
    protected String address;

    void info() {
        System.out.println("Lastname" + lastname);
    }
}
// extend keyword used to create a child class
// single level, one parent has one child
class ChildClass extends ParentClass{
    String firstname;
    void greet(){
        System.out.println("Firstname:" + firstname + "Lastname:" + lastname);
    }
}

// multi level
class GrandChild extends ChildClass{
    String middlename;
    void call(){
        System.out.println(firstname + " " + middlename + " " + lastname);
    }
}
// Tree
class UncleClass extends ParentClass{
    String job;
    void detail(){
        System.out.println( job + "" + lastname);
    }
} 

class Animal{
    int lifespan;
    void speaks(){
        System.out.println("Animal speaks");
    }
}


class mamal extends Animal{
    int legs;
    void fur(){
        System.out.println(legs + "Mamal has fur");
    }
}

class Reptile extends Animal{
    int eggs;
    void shed(){
        System.out.println("Reptile sheds");
    }
}

class Dog extends mamal{
    String diet;
    void bark(){
        System.out.println("Dog barks");
    }
}

class Germanshepherd extends Dog{

}

class labrador extends Dog{

}
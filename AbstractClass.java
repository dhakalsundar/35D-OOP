public class AbstractClass {
    public static void main(String[] args) {
        apple iphone = new apple();
        iphone.call();
        iphone.message();

    }
    
}
// to make abstract class, use abstract keyword before"class"
// if a class is abstract, it cannot be make object of
abstract class Smartphone{
    // abstract function do not have a body
    // abstract class may or may not contain abstract function    
// if there is at least one abstract function, class have to be abstract abstract public void call();
abstract public void call();
abstract public void message();
abstract public boolean text (String text);
}

// To use abstract class it has to be extended into sub/child class
class Samsung extends Smartphone{
// When abstract class is extended
// all the abstract function must be overriden/ implemented
@Override
public void call(){
    System.out.println( "Samsung calling");
}
@Override
public void message() {
    System.out.println( "Samsung message");
}
@Override
public boolean text (String text) {
return true;
}
}
class apple extends Smartphone{
    @Override 
    public void call(){
        System.out.println("Apple calling");
        }
        @Override
        public void message(){
            System.out.println("Apple message");
            }
            @Override
            public boolean text(String text){
                return true;
                }
}


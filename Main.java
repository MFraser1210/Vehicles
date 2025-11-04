
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    public static void Main(String []args){
        Vehicle v = new Vehicle("sedan",5,4);
        System.out.println("the " + v.getType() + " is at location: " + v.getLocation());
        v.drive();
        System.out.println("the " + v.getType() + " is at location: " + v.getLocation());
        v.reverse();
        System.out.println("the " + v.getType() + " is at location: " + v.getLocation());
        Motorcycle m = new Motorcycle(2);
        System.out.println("the " + m.getType() + " is at location: " + m.getLocation());
        m.drive();
        System.out.println("the " + m.getType() + " is at location: " + m.getLocation());
        m.reverse();
        System.out.println("the " + m.getType() + " is at location: " + m.getLocation());
    }
}

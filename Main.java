
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String []args){
        vehicle v = new vehicle("sedan",5,4);
        System.out.println("the " + v.getType() + " is at location: " + v.getLocation());
        v.drive();
        System.out.println("the " + v.getType() + " is at location: " + v.getLocation());
        v.reverse();
        System.out.println("the " + v.getType() + " is at location: " + v.getLocation());
        motorcycle m = new motorcycle(2);
        System.out.println("the " + m.getType() + " is at location: " + m.getLocation());
        m.drive();
        System.out.println("the " + m.getType() + " is at location: " + m.getLocation());
        m.reverse();
        System.out.println("the " + m.getType() + " is at location: " + m.getLocation());
    }
}

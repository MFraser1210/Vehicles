
/**
 * Write a description of class motorcycle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motorcycle extends Vehicle
{
    // instance variables - replace the example below with your own
    public Motorcycle(int c){
        super("motorcycle",c,2);
    }
    @Override
    public void drive(){
        System.out.println("vroom vroom");
        setLocation(getLocation() + 2);
    }
    @Override 
    public void reverse(){
        System.out.println("beep beep");
        setLocation(getLocation() - 2);
    }
}

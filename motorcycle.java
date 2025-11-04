
/**
 * Write a description of class motorcycle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class motorcycle extends vehicle
{
    // instance variables - replace the example below with your own
    public motorcycle(int c){
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

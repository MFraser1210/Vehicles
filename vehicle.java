
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vehicle
{
    private String type;
    private int capacity;
    private int wheels;
    private int location;
    
    public vehicle(String t, int c, int w){
        type = t;
        capacity = c;
        wheels = w;
        location = 0;
    }
    public String getType(){
        return type;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getWheels(){
        return wheels;
    }
    public int getLocation(){
        return location;
    }
    public void setLocation(int newLocation){
        location = newLocation;
    }
    public void drive(){
        System.out.println("vroom vroom");
        location = location + 1;
    }
    public void reverse(){
        System.out.println("beep beep");
        location = location - 1;
    }
}

/*
 * Class / category named Car
 */
package oot;

/**
 * Class / category named Car
 * @author gheor
 */
public class Car {
    // contants & enum
    private static final String DEFAULT_CAR_NAME = "Initial name of car";
    private static final short DEFAULT_CAR_SPEED = 100;
    public enum Color {BLACK, WHITE, RED, GREEN, BLUE}; // Color.WHITE - Car.Color.WHITE
    // define constants for all car names
    public static final String MERCEDES = "Mercedes";
    public static final String RENAULT = "Renault";
    public static final String DACIA = "Dacia";
    // attributes - variables
    private String name = DEFAULT_CAR_NAME;
    private short speed = DEFAULT_CAR_SPEED;
    private Color color = Color.WHITE;
    // class methods
    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    // increase speed
    public void increaseSpeed(short newSpeed){
        if(speed<=newSpeed)
            speed = newSpeed;
        else
            decreaseSpeed(newSpeed);
    }
    // decrease speed
    public void decreaseSpeed(short newSpeed){
        if(speed >= newSpeed)
            speed = newSpeed;
        else
            increaseSpeed(newSpeed);
    }
    // prints all information about this car
    public void printDetails(){
        System.out.println("---------------------------------------------------");
        System.out.println("Car name: "+name);
        System.out.println("Car color: "+color);
        System.out.println("Car speed: "+speed);
    }
}

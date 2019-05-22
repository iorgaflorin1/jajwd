/*
 * Class Car
 */
package oot;

/**
 * Class Car
 * @author gheor
 */
public class Car {
    //class contants and enumerations
    private static final String DEFAULT_CAR_NAME = "Default name";
    public enum CarColors {RED, BLUE, YELLOW, WHITE, BLACK, GREEN};
    private static final short DEFAULT_CAR_SPEED = 100;
    // class attributes
    String name = DEFAULT_CAR_NAME;
    // class methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarColors getColor() {
        return color;
    }

    public void setColor(CarColors color) {
        this.color = color;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }
    CarColors color = CarColors.RED;
    short speed = DEFAULT_CAR_SPEED;
    // constructor

    public Car(String name, CarColors color, short speed) { // formal parameters
        this.color = color;
        this.name = name;
        this.speed = speed;
    }
    
    // increase speed increase the speed to new value
    public void increaseSpeed(short finalSpeed){
        if(finalSpeed < speed){
            decreaseSpeed(finalSpeed);
        }
        else {
            speed = finalSpeed;
        }
    }
    // decrease speed increase the speed to new value
    public void decreaseSpeed(short finalSpeed){
        if(finalSpeed > speed){
            increaseSpeed(finalSpeed);
        }
        else {
            speed = finalSpeed;
        }
    }
    
    
    
}

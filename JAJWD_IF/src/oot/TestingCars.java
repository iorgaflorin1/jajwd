/*
 * Testing Cars
 */
package oot;

/**
 * Testing Cars
 * @author gheor
 */
public class TestingCars implements Saleable, Rentable{
    // elininate HARD CODING.
    public static final String MERCEDES = "Mercedes";
    public static final String RENAULT = "Renault";
    public static final String DACIA = "Dacia";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create 3 cars
        Car m = new Car(MERCEDES, Car.CarColors.RED, (short)230);
        Car r = new Car(RENAULT, Car.CarColors.RED, (short)180);
        Car d = new Car(DACIA, Car.CarColors.BLACK, (short)160);
        // load attributes of the 3 new cars
        //m.setName(MERCEDES);
        //r.setName(RENAULT);
        //d.setName(DACIA);
        //m.setColor(Car.CarColors.RED);
        //r.setColor(Car.CarColors.RED);
        //d.setColor(Car.CarColors.BLACK);
        //m.setSpeed((short)230);
        //r.setSpeed((short)180);
        //d.setSpeed((short)160);
        
    }

    @Override
    public double getSalePrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public double getDailyRentingPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

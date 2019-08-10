/*
 * Testing OOT concepts
 */
package oot;

/**
 * Testing OOT concepts
 * @author gheor
 */
public class TestConcepts {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        // create three cars to be rented and also saled
        /*
        SaleableAndRentableCar car11B210 = new SaleableAndRentableCar();
        SaleableAndRentableCar car1PH234 = new SaleableAndRentableCar();
        SaleableAndRentableCar car1B211 = new SaleableAndRentableCar();
        // set correct values
        car11B210.setName(Car.MERCEDES);
        car11B210.setColor(Car.Color.RED);
        car11B210.setSpeed((short)230);
        car11B210.setSalePrice((double)23000.0);
        car11B210.setDailyRentPrice((double)100.0);
        car1PH234.setName(Car.RENAULT);
        car1PH234.setColor(Car.Color.RED);
        car1PH234.setSpeed((short)180);
        car1PH234.setSalePrice((double)10000.0);
        car1PH234.setDailyRentPrice((double)50.0);
        car1B211.setName(Car.DACIA);
        car1B211.setColor(Car.Color.BLACK);
        car1B211.setSpeed((short)160);
        car1B211.setSalePrice((double)500.0);
        car1B211.setDailyRentPrice((double)10.0);
        */
        //using constructor with parameters
        SaleableAndRentableCar car11B210 = new SaleableAndRentableCar(Car.MERCEDES, Car.Color.RED, (short)230, (double)23000.0,(double)100.0);
        SaleableAndRentableCar car1PH234 = new SaleableAndRentableCar(Car.RENAULT, Car.Color.RED, (short)180, (double)10000.0,(double)50.0);
        SaleableAndRentableCar car1B211 = new SaleableAndRentableCar(Car.DACIA, Car.Color.BLACK, (short)160, (double)500.0,(double)10.0);
        // create a vector of cars
        SaleableAndRentableCar[] cars = {car11B210,car1PH234,car1B211};
        /* print details
        car11B210.printDetails();
        car1PH234.printDetails();
        car1B211.printDetails();
        */
        // print all cars infos
        for(SaleableAndRentableCar currentCar:cars){
            currentCar.printDetails();
        }
        // create a Mother with child 
        Mother motherOne = new Mother(2); 
    }
}

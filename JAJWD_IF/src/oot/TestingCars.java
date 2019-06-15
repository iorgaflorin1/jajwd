/*
 * Testing Cars
 */
package oot;

import java.util.LinkedList;

/**
 * Testing Cars
 * @author gheor
 */
public class TestingCars {
    // elininate HARD CODING.
    public static final String MERCEDES = "Mercedes";
    public static final String RENAULT = "Renault";
    public static final String DACIA = "Dacia";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create 3 saleable cars
        SaleableCar sm = new SaleableCar(MERCEDES, Car.CarColors.RED, (short)230,20000.0);
        SaleableCar sr = new SaleableCar(RENAULT, Car.CarColors.RED, (short)180,2500.0);
        SaleableCar sd = new SaleableCar(DACIA, Car.CarColors.BLACK, (short)160,1000.0);
        //create 3 rentable cars
        RentableCar rm = new RentableCar(MERCEDES, Car.CarColors.RED, (short)230,200.0);
        RentableCar rr = new RentableCar(RENAULT, Car.CarColors.RED, (short)180,25.0);
        RentableCar rd = new RentableCar(DACIA, Car.CarColors.BLACK, (short)160,10.0);       
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
        // create a list of Car
        LinkedList<Car> listOfCars = new LinkedList<>();
        // add SaleableCars and RentableCar in the list
        listOfCars.addFirst(rd);
        listOfCars.addFirst(sd);
        listOfCars.addFirst(rr);
        listOfCars.addFirst(sm);
        listOfCars.addFirst(rm);
        listOfCars.addFirst(sr);
        // primnt all info from list based on concrete type/class
        for(Car currentCar:listOfCars){
            Class saleableClass = SaleableCar.class;
            Class currentCarClass = currentCar.getClass();
            if(saleableClass==currentCarClass){
                SaleableCar currentSaleableCar = (SaleableCar)currentCar;
                System.out.println("Sale price is:" + currentSaleableCar.getSalePrice());
            }
            else{
                RentableCar currentRentableCar = (RentableCar)currentCar;
                System.out.println("Daily renting price is:" + currentRentableCar.getDailyRentingPrice());
            }
        }
        
    } 
}

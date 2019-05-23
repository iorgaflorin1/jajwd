/*
 * Rentable car is a car that can be sold.
 */
package oot;

/**
 * Rentable car is a car that can be sold.
 * @author gheor
 */
public class RentableCar extends Car implements Rentable{

    private double dailyRentPrice;
    
    /**
     * Methods creates a Saleable Car instance/object.
     * @param name brand name of Car
     * @param color color of Car
     * @param speed speed of Car
     * @param dailyRentPrice daily rent price of SaleableCar
     */
    public RentableCar(String name, CarColors color, short speed, double dailyRentPrice) {
        super(name, color, speed);
        this.dailyRentPrice = dailyRentPrice;
    }

    @Override
    public double getDailyRentingPrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dailyRentPrice;
    }

}

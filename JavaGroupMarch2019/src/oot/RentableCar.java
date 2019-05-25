/*
 * A car that could be rented
 */
package oot;

/**
 * A car that could be rented
 * @author gheor
 */
public class RentableCar extends Car implements Rentable{
    private static final double INITIAL_DAILY_RENTING_PRICE = 100.0;
    
    private double dailyRentPrice = INITIAL_DAILY_RENTING_PRICE;

    public void setDailyRentPrice(double rentPrice) {
        this.dailyRentPrice = rentPrice;
    }

    @Override
    public double getDailyRentingPrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dailyRentPrice;
    }
}

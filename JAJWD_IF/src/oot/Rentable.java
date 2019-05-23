/*
 * Rentable interface
 */
package oot;

/**
 * Rentable interface
 * @author gheor
 */
public interface Rentable {
    public static final double DEFAULT_DAILY_RENT_PRICE = 100.0;
    /**
     * Method returns daily renting price of an object
     * @return double number as daily renting price
     */
    double getDailyRentingPrice();
}

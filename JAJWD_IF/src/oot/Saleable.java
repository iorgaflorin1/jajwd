/*
 * Saleable interface
 */
package oot;

/**
 * Saleable interface
 * @author gheor
 */
public interface Saleable {
    public static final double DEFAULT_SALE_PRICE = 1000.50;
    
    /**
     * Method returns sale price of a saleable object
     * @return sale price of object
     */
    double getSalePrice();
}

/*
 * Saleable car is a car that can be sold.
 */
package oot;

/**
 * Saleable car is a car that can be sold.
 * @author gheor
 */
public class SaleableCar extends Car implements Saleable{

    private double salePrice;
    
    /**
     * Methods creates a Saleable Car instance/object.
     * @param name brand name of Car
     * @param color color of Car
     * @param speed speed of Car
     * @param salePrice sales price of SaleableCar
     */
    public SaleableCar(String name, CarColors color, short speed, double salePrice) {
        super(name, color, speed);
        this.salePrice = salePrice;
    }

    @Override
    public double getSalePrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return salePrice;
    }
}

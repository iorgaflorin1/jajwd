/*
 * A car that could be sold
 */
package oot;

/**
 * A car that could be sold
 * @author gheor
 */
public class SaleableCar extends Car implements Saleable{
    private static final double INITIAL_SALES_PRICE = 1000.0;
    
    private double salePrice = INITIAL_SALES_PRICE;

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public double getSalePrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return salePrice;
    }
    
}

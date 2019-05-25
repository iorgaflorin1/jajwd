/*
 * A car that could be sold and rented
 */
package oot;

/**
 * A car that could be sold and rented
 * @author gheor
 */
public class SaleableAndRentableCar extends Car implements Saleable, Rentable{
    private static final double INITIAL_SALES_PRICE = 1000.0;
    private static final double INITIAL_DAILY_RENTING_PRICE = 100.0;
    
    private double salePrice = INITIAL_SALES_PRICE;
    private double dailyRentPrice = INITIAL_DAILY_RENTING_PRICE;
    
    // constructors
    public SaleableAndRentableCar(String name, Car.Color color, short speed, double salePrice, double dailyRentPrice){
        super.setName(name);
        super.setColor(color);
        super.setSpeed(speed);
        this.salePrice = salePrice;
        this.dailyRentPrice = dailyRentPrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
    public void setDailyRentPrice(double rentPrice) {
        this.dailyRentPrice = rentPrice;
    }
    
    @Override
    public double getSalePrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return salePrice;
    }
    @Override
    public double getDailyRentingPrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dailyRentPrice;
    }    
    
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Sale price: "+salePrice+" EURO");
        System.out.println("Daily renting price: "+dailyRentPrice+" EURO");
    }
}

/*
 * Testing collections in Java
 */
package collections;

import java.util.LinkedList;
import oot.Car;
import oot.RentableCar;
import oot.SaleableCar;
import static oot.TestingCars.DACIA;
import static oot.TestingCars.MERCEDES;
import static oot.TestingCars.RENAULT;

/**
 * Testing collections in Java
 * @author gheor
 */
public class TestCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare, instantiate and initialize arrays
        //Number[] vector;
        Integer i1 = 20;
        Double d1 = -345.44;
        Float f1 = 23.4f;
        Number[] vector = {i1,d1,f1};
        int[] values = {123,-33,56};
        String[][] matrix = { {"I", "love", "Java"}, 
                              {"You", "love", "Java"},
                              {"We", "love", "Java"},
                              {"They", "love", "Java"}
                            }; // declaration, instantiation and initialization
        System.out.println("Element e[2.2] = "+matrix[2][2]);
        Double[][][] cube;				// declaration
        cube = new Double[3][3][3];		// instantiation
        cube[0][0][0] = 0.0;				// one value initialization
        cube[1][1][1] = 1.0; 				// one value initialization
        cube[1][0][0] = 1.0; 				// one value initialization
        for(String[] currentElement:matrix){
            for(String anotherElelement: currentElement)
                System.out.println("Elelemntul urmator este: "+anotherElelement);
        }
        // create collection
        LinkedList<Car> myCars = new LinkedList<>();
        // create Cars
         //create 3 saleable cars
        SaleableCar sm = new SaleableCar(MERCEDES, Car.CarColors.RED, (short)230,20000.0);
        SaleableCar sr = new SaleableCar(RENAULT, Car.CarColors.RED, (short)180,2500.0);
        SaleableCar sd = new SaleableCar(DACIA, Car.CarColors.BLACK, (short)160,1000.0);
        //create 3 rentable cars
        RentableCar rm = new RentableCar(MERCEDES, Car.CarColors.RED, (short)230,200.0);
        RentableCar rr = new RentableCar(RENAULT, Car.CarColors.RED, (short)180,25.0);
        RentableCar rd = new RentableCar(DACIA, Car.CarColors.BLACK, (short)160,10.0);
        // add cars in list
        myCars.add(rd);
        myCars.add(rr);
        myCars.add(rm);
        myCars.add(sd);
        myCars.add(sm);
        myCars.add(sr);
        // make inventory
        for(Car currentCar:myCars){
            System.out.println("Car details:"+currentCar.getName()+" "+currentCar.getColor()+" "+currentCar.getSpeed());
        }
    }
}

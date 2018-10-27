/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheor
 */
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of getRentPrice method, of class Car.
     */
    @Test
    public void testGetRentPrice() {
        System.out.println("getRentPrice");
        Car instance = new Car();
        instance.setRentPrice(250);
        int expResult = 250;
        int result = instance.getRentPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isRENTABLE method, of class Car.
     */
    @Test
    public void testIsRENTABLE() {
        System.out.println("isRENTABLE");
        boolean expResult = true;
        boolean result = Car.isRENTABLE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isSALEABLE method, of class Car.
     */
    @Test
    public void testIsSALEABLE() {
        System.out.println("isSALEABLE");
        boolean expResult = true;
        boolean result = Car.isSALEABLE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSalePrice method, of class Car.
     */
    @Test
    public void testSetSalePrice() {
        System.out.println("setSalePrice");
        int salePrice = 0;
        Car instance = new Car();
        instance.setSalePrice(salePrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRentPrice method, of class Car.
     */
    @Test
    public void testSetRentPrice() {
        System.out.println("setRentPrice");
        int rentPrice = 0;
        Car instance = new Car();
        instance.setRentPrice(rentPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = new Car();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Car.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Car instance = new Car();
        Car.Color expResult = null;
        Car.Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class Car.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Car instance = new Car();
        short expResult = 0;
        short result = instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Car.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "";
        Car instance = new Car();
        instance.setName(newName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Car.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Car.Color newColor = null;
        Car instance = new Car();
        instance.setColor(newColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class Car.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        short newSpeed = 0;
        Car instance = new Car();
        instance.setSpeed(newSpeed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increaseSpeed method, of class Car.
     */
    @Test
    public void testIncreaseSpeed() {
        System.out.println("increaseSpeed");
        short newSpeed = 0;
        Car instance = new Car();
        instance.increaseSpeed(newSpeed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseSpeed method, of class Car.
     */
    @Test
    public void testDecreaseSpeed() {
        System.out.println("decreaseSpeed");
        short newSpeed = 0;
        Car instance = new Car();
        instance.decreaseSpeed(newSpeed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalePrice method, of class Car.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getSalePrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyRentPrice method, of class Car.
     */
    @Test
    public void testGetDailyRentPrice() {
        System.out.println("getDailyRentPrice");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getDailyRentPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

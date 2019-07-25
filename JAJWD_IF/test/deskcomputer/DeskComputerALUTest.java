/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deskcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gheor
 */
public class DeskComputerALUTest {
    
    public DeskComputerALUTest() {
    }

    /**
     * Test of getFirstOperand method, of class DeskComputerALU.
     */
    @Test
    public void testGetFirstOperand() {
        System.out.println("getFirstOperand");
        DeskComputerALU instance = new DeskComputerALU();
        int expResult = 0;
        int result = instance.getFirstOperand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstOperand method, of class DeskComputerALU.
     */
    @Test
    public void testSetFirstOperand() {
        System.out.println("setFirstOperand");
        int firstOperand = 0;
        DeskComputerALU instance = new DeskComputerALU();
        instance.setFirstOperand(firstOperand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecondOperand method, of class DeskComputerALU.
     */
    @Test
    public void testGetSecondOperand() {
        System.out.println("getSecondOperand");
        DeskComputerALU instance = new DeskComputerALU();
        int expResult = 0;
        int result = instance.getSecondOperand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecondOperand method, of class DeskComputerALU.
     */
    @Test
    public void testSetSecondOperand() {
        System.out.println("setSecondOperand");
        int secondOperand = 0;
        DeskComputerALU instance = new DeskComputerALU();
        instance.setSecondOperand(secondOperand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperator method, of class DeskComputerALU.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        DeskComputerALU instance = new DeskComputerALU();
        char expResult = ' ';
        char result = instance.getOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperator method, of class DeskComputerALU.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        char operator = ' ';
        DeskComputerALU instance = new DeskComputerALU();
        instance.setOperator(operator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class DeskComputerALU.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        DeskComputerALU instance = new DeskComputerALU();
        int expResult = 0;
        int result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class DeskComputerALU.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        int result_2 = 0;
        DeskComputerALU instance = new DeskComputerALU();
        instance.setResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

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
public class DeskComputerScreenTest {
    
    public DeskComputerScreenTest() {
    }

    /**
     * Test of getDisplay method, of class DeskComputerScreen.
     */
    @Test
    public void testGetDisplay() {
        System.out.println("getDisplay");
        DeskComputerScreen instance = new DeskComputerScreen();
        String expResult = "";
        String result = instance.getDisplay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisplay method, of class DeskComputerScreen.
     */
    @Test
    public void testSetDisplay() {
        System.out.println("setDisplay");
        String display = "";
        DeskComputerScreen instance = new DeskComputerScreen();
        instance.setDisplay(display);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class DeskComputerScreen.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        DeskComputerButton.ButtonsMarkups markup = null;
        DeskComputerScreen instance = new DeskComputerScreen();
        instance.display(markup);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

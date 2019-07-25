/*
 * Tested by GAP 7/25/2019 4:19
 */
package deskcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tested by GAP 7/25/2019 4:19
 * @author gheor
 */
public class DeskComputerTest {
    
    public DeskComputerTest() {
    }

    /**
     * Test of getScreen method, of class DeskComputer.
     */
    @Test
    public void testGetScreen() {
        System.out.println("getScreen");
        DeskComputer instance = new DeskComputer();
        DeskComputerScreen expResult = instance.getScreen();
        DeskComputerScreen result = instance.getScreen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setScreen method, of class DeskComputer.
     */
    @Test
    public void testSetScreen() {
        System.out.println("setScreen");
        DeskComputerScreen screen = new DeskComputerScreen();
        DeskComputer instance = new DeskComputer();
        instance.setScreen(screen);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of pushCalculatorButton method, of class DeskComputer.
     */
    @Test
    public void testPushCalculatorButton() {
        System.out.println("pushCalculatorButton");
        DeskComputerButton.ButtonsMarkups markup = DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_1;
        DeskComputer instance = new DeskComputer();
        instance.pushCalculatorButton(markup);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

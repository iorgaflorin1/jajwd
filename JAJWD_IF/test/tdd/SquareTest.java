/*
 * Unitary test for Square
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unitary test for Square
 * @author gheor
 */
public class SquareTest {
    
    public SquareTest() {
    }

    /**
     * Test of getDefinition method, of class Square.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Square instance = new Square();
        String expResult = "SQUARE: a plane figure with four equal straight sides and four right angles.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}

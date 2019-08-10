/*
 * Unitary test of class Shape
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unitary test of class Shape
 * @author gheor
 */
public class ShapeTest {
    
    public ShapeTest() {
    }

    /**
     * Test of getDefinition method, of class Shape.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Shape instance = new Shape();
        String expResult = " a plane figure ";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}

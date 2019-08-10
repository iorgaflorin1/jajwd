/*
 * Tests final classes
 */
package oot;

/**
 * Tests final classes
 * @author gheor
 */
public class TestFinalClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrozenClass fz = new FrozenClass();
        boolean response = fz.checkValidity("12qq33");
        System.out.append("Key is valid: "+response);
    }
    
}

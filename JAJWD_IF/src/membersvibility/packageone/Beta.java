/*
 * Beta class in the same package with Alpha to test members visibility
 */
package membersvibility.packageone;

/**
 * Beta class in the same package with Alpha to test members visibility
 * @author gheor
 */
public class Beta {
    public int publicVariable =0;
    protected int protectedVariable = 2;
    private int privateVariable = 1;
    int packageVariable = 4;
    
    public void printVariablesFromAlpha(){
        Alpha alphaObject = new Alpha();
        System.out.println("I am an instance/object of class Beta: ");
        System.out.println("Private variable from Alpha: " + "IS NOT VISIBBLE!");
        System.out.println("Public variable from Alpha: " + alphaObject.publicVariable);
        System.out.println("Protected variable from Alpha: " + alphaObject.protectedVariable);
        System.out.println("Package variable from Alpha: " + alphaObject.packageVariable);
    }
    
}

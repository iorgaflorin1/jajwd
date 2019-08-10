/*
 * Beta class in the same package with Alpha to test members visibility
 */
package membersvibility.packageone;

/**
 * Beta class in the same package with Alpha to test members visibility
 * @author gheor
 */
public class Beta extends Alpha{

    public int publicBetaVariable = 0;
    protected int protectedBetaVariable = 2;
    private int privateBetaVariable = 1;
    int packageBetaVariable = 4;
    
    public Beta(int cucu, int baw, int banana, int lemn) {
        super(20,33,55,66);
        publicVariable = cucu;
        protectedVariable = baw;
        //privateVariable = banana;
        packageVariable = lemn;
    }
    public void printVariablesFromAlpha(){
        Alpha alphaObject = new Alpha(23,22,15,12);
        System.out.println("I am an instance/object of class Beta: ");
        System.out.println("Private variable from Alpha: " + "IS NOT VISIBBLE!");
        System.out.println("Public variable from Alpha: " + alphaObject.publicVariable);
        System.out.println("Protected variable from Alpha: " + alphaObject.protectedVariable);
        System.out.println("Package variable from Alpha: " + alphaObject.packageVariable);
        // Testing inheritance paradigm
        System.out.println("I am an inherited instance/object of class Alpha: ");
        System.out.println("Private variable from Alpha: " + "IS NOT VISIBBLE!");
        System.out.println("Public variable from Alpha: " + super.publicVariable);
        System.out.println("Protected variable from Alpha: " + super.protectedVariable);
        System.out.println("Package variable from Alpha: " + super.packageVariable);
    }
    
}

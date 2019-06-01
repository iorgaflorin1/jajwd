/*
 * Class Alpha used to create objects having different members with 
 * different access/visibility specifiers.
 */
package accessspecifiers.packageone;

/**
 * Class Alpha used to create objects having different members with 
 * different access/visibility specifiers.
 * @author gheor
 */
public class Alpha {
    public int publicAlphaVariable = 0;
    protected int protectedAlphaVariable = 10;
    private int privateAlphaVariable = 20;
    int packagePrivateAlphaVariable = 30;
    
    // create a method to print all variable values in console
    public void printVariablesValues(){
        System.out.println("======================== Print from class A object =============================");
        System.out.println("Public variable value: "+publicAlphaVariable);
        System.out.println("Protected variable value: "+protectedAlphaVariable);
        System.out.println("Private variable value: "+privateAlphaVariable);
        System.out.println("Package private variable value: "+packagePrivateAlphaVariable);
        
    }
}

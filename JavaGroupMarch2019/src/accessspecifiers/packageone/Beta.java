/*
 * Class beta in same package with Alpha try to access Alpha members
 */
package accessspecifiers.packageone;

/**
 * Class beta in same package with Alpha try to access Alpha members
 * @author gheor
 */
public class Beta {
    
    
// create a method to print all variable values in console
    public void printVariablesValues(){
    // create an object of class Alpha
    Alpha alphaObject = new Alpha();        
    // Try to access all members of the object created from class A
    System.out.println("======================== Print from class Beta an Alpha object =============================");
    System.out.println("Public variable value: "+alphaObject.publicAlphaVariable);
    System.out.println("Protected variable value: "+alphaObject.protectedAlphaVariable);
    //System.out.println("Private variable value: "+alphaObject.privateAlphaVariable);
    System.out.println("Package private variable value: "+alphaObject.packagePrivateAlphaVariable);    
    // Access public method
    alphaObject.printVariablesValues();
    // generate an error
        int cucu = 10;
        int error = cucu/0;
    }
}

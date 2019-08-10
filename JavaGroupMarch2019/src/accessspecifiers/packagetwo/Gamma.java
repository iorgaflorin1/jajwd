/*
 * Class Gamma wil, try to access members of class Alpha defined in other package
 */
package accessspecifiers.packagetwo;

import accessspecifiers.packageone.Alpha;

/**
 *
 * @author gheor
 */
public class Gamma {
// create a method to print all variable values in console
    public void printVariablesValues(){
    // create an object of class Alpha
    Alpha alphaObject = new Alpha();        
    // Try to access all members of the object created from class A
    System.out.println("======================== Print from class Gamma an Alpha object members =============================");
    System.out.println("Public variable value: "+alphaObject.publicAlphaVariable);
    // System.out.println("Protected variable value: "+alphaObject.protectedAlphaVariable);
    //System.out.println("Private variable value: "+alphaObject.privateAlphaVariable);
    //System.out.println("Package private variable value: "+alphaObject.packagePrivateAlphaVariable);    
    // Access public method
    alphaObject.printVariablesValues();
    
    }    
    
}

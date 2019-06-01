/*
 * Testing visibility/access specifiers
 */
package accessspecifiers;

import accessspecifiers.packageone.*;
import accessspecifiers.packagetwo.Gamma;

/**
 * Testing visibility/access specifiers
 * @author gheor
 */
public class TestVisibilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object of class Alpha
        Alpha alphaObject = new Alpha();
        // try to access object attributes and methods (members)
        System.out.println("=================== Test Access/Visibility specified members ===========================");
        System.out.println("Public variable value: "+alphaObject.publicAlphaVariable);
        //System.out.println("Protected variable value: "+alphaObject.protectedAlphaVariable);
        //System.out.println("Private variable value: "+alphaObject.privateAlphaVariable);
        //System.out.println("Package private variable value: "+alphaObject.packagePrivateAlphaVariable);
        System.out.println("Public method caLL: ");
        alphaObject.printVariablesValues();
        // Create an object of type Beta which is defined in the same package with class Alpha
        Beta betaObject = new Beta();
        betaObject.printVariablesValues();
        // Create an object of type Gamma
        Gamma gammaObject = new Gamma();
        gammaObject.printVariablesValues();
        
        
    }
    
}

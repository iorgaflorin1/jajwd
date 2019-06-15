/*
 * Class Gamma tests visibility from class Alpha in other package
 */
package membersvibility.packagetwo;

import membersvibility.packageone.Alpha;

/**
 * Class Gamma tests visibility from class Alpha in other package
 * @author gheor
 */
public class Gamma {
    
    public void printVariablesFromAlpha(){
        Alpha alphaObject = new Alpha(10,20,30,40);
        System.out.println("I am an instance/object of class Gamma: ");
        System.out.println("Private variable from Alpha: "+"IS NOT VISIBLE!");
        System.out.println("Public variable from Alpha: " + alphaObject.publicVariable);
        System.out.println("Protected variable from Alpha: " + "IS NOT VISIBLE!");
        System.out.println("Package variable from Alpha: " + "IS NOT VISIBLE!");    
    
    }
    
}

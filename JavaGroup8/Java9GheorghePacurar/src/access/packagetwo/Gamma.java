package access.packagetwo;

import access.packageone.Alpha;

/*
 * Class Gamma in packagetwo
package access.packagetwo;

/**
 *
 * @author gheor
 */
public class Gamma {
    private int privateGammaVariable = 10;
    protected int protectedGammaVariable = 20;
    int packageGammaVariable = 30;
    public int publicGammaVariable = 40;
    
    public void visibilityInOtherPackage(){
        Alpha alphaObject = new Alpha();
        //System.out.println("Private member visibility:" + alphaObject.privateAlphaVariable);
        //System.out.println("Protected member visibility:" + alphaObject.protectedAlphaVariable);
        //System.out.println("Package member visibility:" + alphaObject.packageAlphaVariable);
        System.out.println("Public member visibility:" + alphaObject.publicAlphaVariable);
    }
}

/*
 * Ipsilon in packageone
 */
package access.packageone;

/**
 *
 * @author gheor
 */
public class Ipsilon {
    private int privateIpsilonVariable = 10;
    protected int protectedIpsilonVariable = 20;
    int packageIpsilonVariable = 30;
    public int publicIpsilonVariable = 40;
    
    public void visibilityInClass(){
        Alpha alphaObject = new Alpha();
        
        //System.out.println("Private member visibility:" + alphaObject.privateAlphaVariable);
        System.out.println("Protected member visibility:" + alphaObject.protectedAlphaVariable);
        System.out.println("Package member visibility:" + alphaObject.packageAlphaVariable);
        System.out.println("Public member visibility:" + alphaObject.publicAlphaVariable);
    }
    
}

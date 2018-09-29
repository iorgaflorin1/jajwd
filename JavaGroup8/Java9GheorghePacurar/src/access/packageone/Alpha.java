/*
 * Class Alpha
 */
package access.packageone;

/**
 *
 * @author gheor
 */
public class Alpha {
    
    private int privateAlphaVariable = 10;
    protected int protectedAlphaVariable = 20;
    int packageAlphaVariable = 30;
    public int publicAlphaVariable = 40;
    
    public void visibilityInClass(){
        System.out.println("Private member visibility:" + privateAlphaVariable);
        System.out.println("Protected member visibility:" + protectedAlphaVariable);
        System.out.println("Package member visibility:" + packageAlphaVariable);
        System.out.println("Public member visibility:" + publicAlphaVariable);
    }
}

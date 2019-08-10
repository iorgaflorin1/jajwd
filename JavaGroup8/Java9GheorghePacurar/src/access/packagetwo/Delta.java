/*
 * Delta extends Alpha
 */
package access.packagetwo;

import access.packageone.Alpha;

/**
 *
 * @author gheor
 */
public class Delta extends Alpha{
    private int privateDeltaVariable = 10;
    protected int protectedDeltaVariable = 20;
    int packageDeltaVariable = 30;
    public int publicDeltaVariable = 40;
    
    public void visibilityInSuperClassInOtherPackage(){
        
        //System.out.println("Private member visibility:" + super.privateAlphaVariable);
        System.out.println("Protected member visibility:" + super.protectedAlphaVariable);
        //System.out.println("Package member visibility:" + super.packageAlphaVariable);
        System.out.println("Public member visibility:" + super.publicAlphaVariable);
    }
}

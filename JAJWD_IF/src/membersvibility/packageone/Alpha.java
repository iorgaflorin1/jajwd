/*
 * Class Alpha to test visibility
 */
package membersvibility.packageone;

/**
 * Class Alpha to test visibility
 * @author gheor
 */
public class Alpha {
    public int publicVariable = 10;
    protected int protectedVariable = 20;
    private int privateVariable = 30;
    int packageVariable = 40;

    public Alpha(int pV, int prV, int privVar, int packVar) {
        publicVariable = pV;
        protectedVariable = prV;
        privateVariable = privVar;
        packageVariable = packVar;
    }
    
    public void printVariables(){
        System.out.println("I am an instance/object of class Alpha: ");
        System.out.println("A public variable: " + publicVariable);
        System.out.println("A protected variable: " + protectedVariable);
        System.out.println("A private variable: " + privateVariable);
        System.out.println("A package variable: " + packageVariable);
    }
}

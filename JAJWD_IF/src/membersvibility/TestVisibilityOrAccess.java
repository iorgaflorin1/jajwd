/*
 * Testes access or visibility specifiers
 */
package membersvibility;

import membersvibility.packageone.Alpha;
import membersvibility.packageone.Beta;
import membersvibility.packagetwo.Gamma;

/**
 * Testes access or visibility specifiers
 * @author gheor
 */
public class TestVisibilityOrAccess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v = 0;
        Alpha alphaObiect = new Alpha(10,20,30,40);
        alphaObiect.printVariables();
        Beta betaObject = new Beta(33,44,55,66);
        betaObject.printVariablesFromAlpha();
        Gamma gammaObject = new Gamma();
        gammaObject.printVariablesFromAlpha();
        alphaObiect = null;
        betaObject = null;
        gammaObject = null;
    }
    
}

/*
 * Test Exceptions in Java
 */
package exceptions;

import org.omg.IOP.CodecPackage.FormatMismatch;

/**
 * Test Exceptions in Java
 * @author gheor
 */
public class TestExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        LearningExceptions le = new LearningExceptions();
        try{
            le.divide();
        }
        catch(ArithmeticException ex){
            System.out.println("Exception message is:" + ex.getMessage());
        }
        catch(FormatMismatch ex1){
            System.out.println("Exception message is:" + ex1.getMessage());
        }        
        finally{
            System.out.println("This code is always executed");
        }
    }
}


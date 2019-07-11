/*
 * Learning exceptions
 */
package exceptions;

import java.util.Scanner;
import org.omg.IOP.CodecPackage.FormatMismatch;

/**
 * Learning exceptions
 * @author gheor
 */
public class LearningExceptions{
    public double divide() throws ArithmeticException, FormatMismatch{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert over: ");
        int over = scanner.nextInt();
        Scanner scannerOne = new Scanner(System.in);
        System.out.println("Insert under: ");
        int under = scannerOne.nextInt();
        double result =0.0;
        //try{
            result = over/under;
        //} catch(ArithmeticException ex){
        //    System.out.println("Exception message:"+ex.getMessage());
        //} finally {
        //    System.out.println("This code is executed no matter an exception occurs or not!");
        //}
        if(true)
            throw new FormatMismatch();
        return result;
    }
}

/*
Tema nr 1:Calculator
 */
package teme.simplecalculator;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Callculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int num1,num2;
        String operator,equal;
        System.out.println("Introduce your first number.");
        num1 = var.nextInt();
        System.out.println("Introduce your operator.");
        operator = var.next();
        System.out.println("Introduce your second number.");
        num2 = var.nextInt();
        System.out.println("Please introduce =");
        equal = var.next();
        switch(operator) {
            case "+":
                System.out.println("Your result is " +(num1+num2)+".");
                break;
            case "-":
                System.out.println("Your result is "+(num1-num2)+".");
                break;
                
            case"*":
                System.out.println("Your result is "+(num1*num2)+".");
                break;
                
            case"/":
                System.out.println("Your result is "+(num1/num2)+".");
                break;
            default:
                System.out.println("Sorry, you introduced wrong data. I quit :)");
                }
       
    }
    
}

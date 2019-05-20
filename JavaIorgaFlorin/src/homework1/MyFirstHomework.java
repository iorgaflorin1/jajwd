/*
 * This is my first homework
 */
package homework1;
import java.util.Scanner;

/**
 * This is my first homework
 * @author Florin
 */
public class MyFirstHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner firstTriangle = new Scanner(System.in);
        
        System.out.println("We'll create a program which will result the area of two triangles and then compare them.");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("1)Insert the first cathetus (the base) of the first triangle: ");
        int firstCathetusTriangleOne = firstTriangle.nextInt();
        
        System.out.println("Insert the second catheter of the first triangle");
        int secondCatheterTriangleOne = firstTriangle.nextInt();
        
        System.out.println("Insert the hypotenuse of the first triangle");
        int theHypotenuseTriangleOne = firstTriangle.nextInt();
        
        int theHeightTriangleOne = (firstCathetusTriangleOne*secondCatheterTriangleOne)/theHypotenuseTriangleOne;
        System.out.println("The height of the first triangle is: " + theHeightTriangleOne);
        
        int theAreaTriangleOne = (firstCathetusTriangleOne*theHeightTriangleOne)/2;
        System.out.println("Following the calculation: "+ "(base=" + firstCathetusTriangleOne + " *" + " height=" + theHeightTriangleOne + ")/" + "2 " + "the firs triangle has area " + theAreaTriangleOne);
        System.out.println();
        System.out.println();
        
        
        Scanner secondTriangle = new Scanner(System.in);
        
        System.out.println("2)Insert the first cathetus (the base) of the second triangle): ");
        int firstCathetusTriangleTwo = secondTriangle.nextInt();
        
        System.out.println("Insert the second catheter of the second triangle");
        int secondCatheterTriangleTwo = secondTriangle.nextInt();
        
        System.out.println("Insert the hypotenuse of the second triangle");
        int theHypotenuseTriangleTwo = secondTriangle.nextInt();
        
        int theHeightTriangleTwo = (firstCathetusTriangleTwo*secondCatheterTriangleTwo)/theHypotenuseTriangleTwo;
        System.out.println("The height of the second triangle is: " + theHeightTriangleTwo);
        
        int theAreaTriangleTwo = (firstCathetusTriangleTwo*theHeightTriangleTwo)/2;
        System.out.println("Following the calculation: "+ "(base=" + firstCathetusTriangleTwo + " *" + " height=" + theHeightTriangleTwo + ")/" + "2 " + "the second triangle has area " + theAreaTriangleTwo);
        System.out.println();
        
        /*
            boolean compareTrianglesTrue = (theAreaTriangleOne > theAreaTriangleTwo);
            boolean compareTrianglesFalse = (0 == 1);
            boolean compareTriangles = (compareTrianglesTrue?compareTrianglesTrue:compareTrianglesFalse);
            System.out.println("The first triangle is higher than the second: " + compareTriangles);
        */
                                             
        if(theAreaTriangleOne > theAreaTriangleTwo){
            System.out.print("The first triangle is higher than the second triangle.");
        }
        else{
            if(theAreaTriangleOne == theAreaTriangleTwo){
                System.out.println("The first triangle is equal with the second triangle.");
            }
            else{
                if(theAreaTriangleOne < theAreaTriangleTwo){
                    System.out.println("The second triangle is higher than the first triangle.");
                }
            }
        }
        System.out.println();
        System.out.println();
       
        
    }
    
}

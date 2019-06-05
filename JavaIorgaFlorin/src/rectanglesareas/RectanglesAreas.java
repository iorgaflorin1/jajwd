/*
 * Create a program who compare the perimeter and the area of two rectangles and then display who is bigger
 */
package rectanglesareas;
import java.util.Scanner;
import mypackage.RectanglesAreasLibrary;
/**
 * Create a program who compare the perimeter and the area of two rectangles and then display who is bigger
 * @author Florin
 */
public class RectanglesAreas {

    /**
     * Import the java class, create a scanner object who reads from keyboard four values, create some variables and final calculation will be displayed like a comparison between tho rectangles
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner firstRectangle = new Scanner(System.in);
        
        System.out.println("Insert the lenght of first rectangle: ");
        double lenghtRectangleOne = firstRectangle.nextInt();
        
        System.out.println("Insert the width of the first rectangle");
        double widthRectangleOne = firstRectangle.nextInt();
        System.out.println();
     
        Scanner secondRectangle = new Scanner(System.in);
        
        System.out.println("Insert the lenght of second rectangle: ");
        double lenghtRectangleTwo = firstRectangle.nextInt();
        
        System.out.println("Insert the width of the second rectangle");
        double widthRectangleTwo = firstRectangle.nextInt();
         
        
        System.out.println();
        System.out.println("Answers: ");
        
        RectanglesAreasLibrary ob1 = new RectanglesAreasLibrary();
        ob1.biggerPerimeter(lenghtRectangleOne, widthRectangleOne, lenghtRectangleTwo, widthRectangleTwo);
        ob1.biggerArea(lenghtRectangleOne, widthRectangleOne, lenghtRectangleTwo, widthRectangleTwo);
       
        
    }
        
    
}

/*
 * Testing DEFALL user story
 */
package tdd;

import java.util.LinkedList;

/**
 * Testing DEFALL user story
 * @author gheor
 */
public class TestShapesDefinition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a list of shapes
        LinkedList<Shape> listOfShapes = new LinkedList<>();
        listOfShapes.add(new Rectangle());
        listOfShapes.add(new Circle());
        listOfShapes.add(new Square());
        listOfShapes.add(new Triangle());
        listOfShapes.add(new Rectangle());
        listOfShapes.add(new Circle());
        listOfShapes.add(new Square());
        listOfShapes.add(new Triangle());
        // See on different consecutive lines all definitions of all figures in my list of figures.
        for(Shape currentShape: listOfShapes){
            String currentDefinition = currentShape.getDefinition();
            System.out.println(currentDefinition);
        }
    }
}

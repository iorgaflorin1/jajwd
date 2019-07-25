/*
 * Class Circle display definition of a circle
 */
package tdd;

/**
 * Class Circle display definition of a circle
 * @author gheor
 */
public class Circle extends Shape{
    
    private static final String SHAPE_NAME = "CIRCLE:";
    private static final String SHAPE_PARTIAL_DEFINITION = "whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";
    
    public String getDefinition(){
        StringBuilder response = new StringBuilder(SHAPE_NAME);
        response.append(super.getDefinition());
        response.append(SHAPE_PARTIAL_DEFINITION);
        return response.toString();
    }
            
}

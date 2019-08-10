/*
 * Class Rectangle
 */
package tdd;

/**
 * Class Rectangle
 * @author gheor
 */
public class Rectangle extends Shape{
    
    private static final String SHAPE_NAME = "RECTANGLE:";
    protected static final String SHAPE_PARTIAL_DEFINITION_SQUARE_ONE = "with four ";
    protected static final String SHAPE_PARTIAL_DEFINITION_SQUARE_TWO = "straight sides and four right angles";
    private static final String SHAPE_PARTIAL_DEFINITION_RECTANGLE = ", especially one with unequal adjacent sides, in contrast to a square.";
    
    public String getDefinition(){
        StringBuilder result = new StringBuilder(SHAPE_NAME);
        result.append(super.getDefinition());
        result.append(SHAPE_PARTIAL_DEFINITION_SQUARE_ONE);
        result.append(SHAPE_PARTIAL_DEFINITION_SQUARE_TWO);
        result.append(SHAPE_PARTIAL_DEFINITION_RECTANGLE);
        return result.toString();
    }
}

/*
 * Square class
 */
package tdd;

/**
 * Square class
 * @author gheor
 */
public class Square extends Rectangle{
    private static final String SHAPE_NAME = "SQUARE:";
    private static final String SHAPE_PARTIAL_DEFINITION_EQUAL = "equal ";
    private static final String SHAPE_PARTIAL_DEFINITION_END = ".";
    
    public String getDefinition(){
        StringBuilder result = new StringBuilder(SHAPE_NAME);
        result.append(Shape.SHAPE_DEFINITION);
        result.append(super.SHAPE_PARTIAL_DEFINITION_SQUARE_ONE);
        result.append(SHAPE_PARTIAL_DEFINITION_EQUAL);
        result.append(super.SHAPE_PARTIAL_DEFINITION_SQUARE_TWO);
        result.append(SHAPE_PARTIAL_DEFINITION_END);
        return result.toString();
    }
    
}

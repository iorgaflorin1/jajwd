/*
 * Class Triangle
 */
package tdd;

/**
 * Class Triangle
 * @author gheor
 */
public class Triangle extends Shape{
    private static final String SHAPE_NAME = "TRIANGLE:";
    private static final String SHAPE_PARTIAL_DEFINITION = "with three straight sides and three angles.";
    
    public String getDefinition(){
        StringBuilder result = new StringBuilder(SHAPE_NAME);
        result.append(super.getDefinition());
        result.append(SHAPE_PARTIAL_DEFINITION);
        return result.toString();
    }
}

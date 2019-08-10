/*
 * Nested classes example
 */
package specialclasses;

/**
 * Nested classes example
 * @author gheor
 */
public class NestedClasses {
    /**
     * A static nested class
     */
    public static class StaticNestedClass{
        private int intValue = 0;

        public int getIntValue() {
            return intValue;
        }

        public void setIntValue(int intValue) {
            this.intValue = intValue;
        }
    }
    /**
     * An inner nested class
     */
    public class InnerNestedClass{
        private int intValue = 0;

        public int getIntValue() {
            return intValue;
        }

        public void setIntValue(int intValue) {
            this.intValue = intValue;
        }
    }
    
    static StaticNestedClass staticNestedObject = new StaticNestedClass();
    InnerNestedClass innerNestedObject = new InnerNestedClass();
    /**
     Method prints content of inner nested content.
     */
    public void printInnerContent(){
        System.out.println("Inner nested content is: "+innerNestedObject.getIntValue());
    }
    /**
     Method prints content of inner nested content.
     */
    public static void printStaticContent(){
        System.out.println("Static nested content is: "+staticNestedObject.getIntValue());
    }    
}

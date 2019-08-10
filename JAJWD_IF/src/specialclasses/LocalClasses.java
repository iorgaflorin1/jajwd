/*
 * Class has into a method defined a new class
 */
package specialclasses;

/**
 * Class has into a method defined a new class
 * @author gheor
 */
public class LocalClasses {
    public static enum Color {RED, BLUE, GREEN};
    
    public void printLocalClassIncluded(){
        /** local Class */
        class LocalClassToy{
            LocalClasses.Color toyColor = LocalClasses.Color.GREEN;

            public Color getToyColor() {
                return toyColor;
            }

            public void setToyColor(Color toyColor) {
                this.toyColor = toyColor;
            }
        }
        
        LocalClassToy localObject = new LocalClassToy();
        System.out.println("Toy color is: "+localObject.getToyColor());
    }
}

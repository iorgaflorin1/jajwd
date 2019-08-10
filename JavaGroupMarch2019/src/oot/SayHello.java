/*
 * Abstract class for saying hello :)
 */
package oot;

/**
 * Abstract class for saying hello :)
 * @author gheor
 */
public abstract class SayHello {
    public static final String LINE = "--------------------------------------";
    private String line = LINE;
    
    /**
     Methods print a line in console
     */
    public void displayLine(){
        System.out.println(line);
    }
    /**
     Method display a greeting into a specified language. 
     * Specific language greeting is implemented into an inherited class.
    */
    public abstract void sayHello();
}

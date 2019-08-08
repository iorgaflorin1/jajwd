/*
 * See how Java keywords prepared for synch are working.
 */
package multiprocess;

/**
 * See how Java keywords prepared for synch are working.
 * @author gheor
 */
public class TestSynchronization {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter counter = new Counter();
        // create an increment thread
        Increment add = new Increment(counter);
        Decrement sub = new Decrement(counter);
        // start threads
        add.start();
        sub.start();
    }
}

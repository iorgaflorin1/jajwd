/*
 * Clasa lanseaza threaduri
 */
package multithreading;

/**
 *
 * @author gheor
 */
public class UiteAsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Thread tha = new HelloAllThread();
	System.out.println("Prioritatea threadului tha este:" + tha.getPriority());
        Thread thw = new HelloWorldThread();
        System.out.println("Prioritatea threadului thw este:" + thw.getPriority());
        thw.setPriority(Thread.MAX_PRIORITY);
        tha.setPriority(Thread.MIN_PRIORITY);
	tha.start();
        thw.start();
    }
    
}

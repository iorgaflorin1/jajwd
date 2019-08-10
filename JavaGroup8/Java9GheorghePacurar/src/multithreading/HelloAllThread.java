/*
 * Just a Thread
 */
package multithreading;

/**
 *
 * @author gheor
 */
public class HelloAllThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello all!");
    }
}

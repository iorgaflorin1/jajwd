/*
 * Another Thread
 */
package multithreading;

/**
 *
 * @author gheor
 */
public class HelloWorldThread extends Thread {

    @Override
    public void run() {
        System.out.println("Salut lume!");
    }
}

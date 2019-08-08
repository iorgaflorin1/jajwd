/*
 * A thread class
 */
package multiprocess;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A thread class
 * @author gheor
 */
public class HelloAll extends Thread{
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("Hello world!");
        } catch (InterruptedException ex) {
            Logger.getLogger(HelloAll.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hello all thread is done!");
    }
}

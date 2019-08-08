/*
 * A new thread class
 */
package multiprocess;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A new thread class
 * @author gheor
 */
public class SalutLume extends Thread{
    public void run(){
        System.out.println("Salut lume!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SalutLume.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Salut lume thread is done!");
    }
    
}

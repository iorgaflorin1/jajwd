/*
 * Substracts 1 for each call to a shared variables from another thread.
 */
package multiprocess;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Substracts 1 for each call to a shared variables from another thread.
 * @author gheor
 */
public class Decrement extends Thread{
    private Counter localCounter;

    public Decrement (Counter remoteCounter){
        localCounter = remoteCounter;
    }
    @Override
    public void run(){
        int cycles = 60;
        while(cycles>0){
            localCounter.setCounter(localCounter.getCounter()-1);
            System.out.println("Substracted 1: "+localCounter.getCounter());
            cycles--;           
        }
    }
}

/*
 * It will be a shared object between threads
 */
package multiprocess;

/**
 * It will be a shared object between threads
 * @author gheor
 */
public class Counter {
    
    private volatile int counter = 0;
    private boolean canWrite = true;

    public synchronized int getCounter() {
        return counter;
    }

    public synchronized void setCounter(int counter) {
        if(canWrite){
            canWrite = false;
            this.counter = counter;
            canWrite = true;
        }        
    } 
}

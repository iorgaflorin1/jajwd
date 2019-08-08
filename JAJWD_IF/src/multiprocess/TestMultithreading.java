/*
 * Testing launching of 2 threads
 */
package multiprocess;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Testing launching of 2 threads
 * @author gheor
 */
public class TestMultithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create two threads
        HelloAll firstThread = new HelloAll();
        SalutLume secondThread = new SalutLume();
        // try to synchronize the threads using priorities
        firstThread.setPriority(10);
        secondThread.setPriority(1);
        // starts the two threads
        firstThread.start();
        secondThread.start();
        //call few specific thread methods
        System.out.println("Priority of first thread is: "+firstThread.getPriority());
        System.out.println("Priority of second thread is: "+secondThread.getPriority());
        System.out.println("Max priority of a thread is: "+Thread.MAX_PRIORITY);
        System.out.println("Normal priority of a thread is: "+Thread.NORM_PRIORITY);
        System.out.println("Min priority of a thread is: "+Thread.MIN_PRIORITY);
        // display name, status and IDs of threads
        System.out.println("Name of first thread is: "+firstThread.getName());
        System.out.println("Name of first thread is: "+secondThread.getName());
        System.out.println("Status of first thread is: "+firstThread.getState());
        System.out.println("Status of second thread is: "+secondThread.getState());
        System.out.println("ID of first thread is: "+firstThread.getId());
        System.out.println("ID of first second is: "+secondThread.getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestMultithreading.class.getName()).log(Level.SEVERE, null, ex);
        }
        // interrupt firstThread
        firstThread.interrupt();
        try {
            // try to make firstThread to wait finish of this main thread
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestMultithreading.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
        try {
            // try to put threads on wait
            firstThread.wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestMultithreading.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        System.out.println("Main thread is done!");
    }
}

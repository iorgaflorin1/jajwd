/*
 * Testing multiprocess
 */
package multithreading;

/**
 * Testing multiprocess
 * @author gheor
 */
public class TestMultiprocess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClassOne o1 = new ClassOne();
        //o1.sayHello();
        o1.start();
        ClassTwo o2 = new ClassTwo();
        //o2.sayHello();
        o2.run();
        // write a message
        System.out.println("Main thread is done!");
    }
    
}

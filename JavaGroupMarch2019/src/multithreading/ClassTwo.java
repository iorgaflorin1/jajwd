/*
 * Class Two
 */
package multithreading;

/**
 * ClassTwo
 * @author gheor
 */
public class ClassTwo implements Runnable{
    /*
    public void sayHello(){
    
        System.out.println("Salut");
    
    }
*/

    @Override
    public void run() {
        System.out.println("Salut");
        // write a message
        System.out.println("run method of ClassTwo thread is done!");
    }
    
}

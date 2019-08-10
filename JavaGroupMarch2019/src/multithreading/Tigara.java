/*
 * Tigara
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Tigara
 * @author gheorgheaurelpacurar
 */
class Tigara extends Thread{
    
    @Override
    public void run(){
        for(int numarDeAsteptari = 0; numarDeAsteptari <5;numarDeAsteptari++){
        System.out.println("Tigara arde.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Aspirator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

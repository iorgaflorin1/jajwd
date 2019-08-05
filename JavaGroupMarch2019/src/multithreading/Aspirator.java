/*
 * Aspiratorul
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Aspiratorul functioneaza si aspira, in scena noastra fara sa apara vreun semn ca va fi pornit sau oprit.
 * @author gheorgheaurelpacurar
 */
class Aspirator extends Thread{
    
    @Override
    public void run(){
        for(int numarDeAsteptari = 0; numarDeAsteptari <5;numarDeAsteptari++){
            System.out.println("Aspiratorul functioneaza.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Aspirator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
}

/*
 * Televizor
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Televizor
 * @author gheorgheaurelpacurar
 */
class Televizor extends Thread{
    
    // o variabila care va fi setata pe true cand emisiunea preferata este afisata
    volatile boolean isEmisiuneaPreferata = false;
    
    public void run(){
       for(int numarDeAsteptari = 0; numarDeAsteptari <5;numarDeAsteptari++){
            System.out.println("TV afiseaza emisiuni");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Aspirator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       System.out.println("TV afiseaza emisiunea preferata");
       isEmisiuneaPreferata = true;
    }
    
}

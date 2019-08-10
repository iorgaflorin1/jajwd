/*
 * Scadere este un thread paralel care va scadea o unitate din contorul comun
 */
package multithreading;

/**
 *
 * @author gheor
 */
public class Scadere extends Thread{
    private Contor contor;
    
    public Scadere(Contor contorComun){
        contor = contorComun;
    }
    
    @Override
    public void run(){
        for(int i=0;i<5000;i++){
        contor.decrementeaza();
        }
    }
}

/*
 * Obiectul partajat de cele doua threaduri
 */
package multithreading;

/**
 *
 * @author gheor
 */
public class Contor {
    
    private volatile double valoare = 0.0;
    
    /**
     * Metoda incremeneteaza valoarea
     */
    public synchronized void  incrementeaza(){
        valoare++;
    }
    
    /**
     *Metoda decrementeaza valoarea
     */
    
    public synchronized void decrementeaza(){
        valoare --;
    }
    
    /**
     * Metoda returneaza valoarea
     * @return valoare
     */
    public double getValoare(){
    
        return valoare;
    }
}

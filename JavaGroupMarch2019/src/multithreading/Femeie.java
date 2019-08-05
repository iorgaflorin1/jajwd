/*
 * Femeia doarme pana cand barbatul o trezeste si apoi urmareste emisiunea
 */
package multithreading;

/**
 *
 * @author gheorgheaurelpacurar
 */
class Femeie extends Thread{
    // creem variabilele necesare pentru femeie
    private Tigara tigaraMea;
    private Televizor tvulMeu;
    // variabile de notificare din partea barbatului ei
    private volatile boolean trezestete = false; // initial doarme linistita

    public synchronized boolean isTrezestete() {
        return trezestete;
    }

    public synchronized void setTrezestete(boolean trezestete) { // va fi apelata de barbat
        this.trezestete = trezestete;
    }
    
    public Femeie(Tigara t, Televizor tv){
        tigaraMea = t;
        tvulMeu = tv;
    }
    @Override
    public void run(){
        // femeia doarme pana este notificata sa se trezeasca
        while(trezestete){
            System.out.println("Sunt femeie si dorm.");
        }
        // cand a fost trezita de sot se uita la TV
        System.out.println("Sunt gemeie si ma uit la televizor!");    
    }
}

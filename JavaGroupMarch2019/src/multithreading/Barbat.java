/*
 * Barbatul foloseste aspiratorul si urmareste programul TV. 
 * Cand observa ca a aparut emisiunea preferata de sotie, o trezeste pe aceasta.
 */
package multithreading;

/**
 *
 * @author gheorgheaurelpacurar
 */
class Barbat extends Thread{
    // variabilele necesare pentru a pastra informatiile utile barbatului
    private Femeie femeiaBarbatului;
    private Aspirator aspiratorulNostru;
    private Televizor televizorulNostru; 
    private boolean nuAmAnuntatSotia = true;
    //constructorul cu paramterii
    public Barbat(Femeie f,Aspirator a,Televizor tv){
        femeiaBarbatului = f;
        aspiratorulNostru = a;
        televizorulNostru = tv;
    }
    
    @Override
    public void run(){
        // activitatea importanta a barbatului este sa urmareasca televizorul si
        // in cazul in care identifica emisiunea preferata sa isi trezeasca sotia
        while(nuAmAnuntatSotia){
            System.out.println("Sunt barbatul, aspir si ma uit la TV.");
            if(televizorulNostru.isEmisiuneaPreferata){
                System.out.println("Sunt barbatul care aspir si imi trezesc sotia!.");
                femeiaBarbatului.setTrezestete(true); // isi notifica sotia ca a inceput emisiunea
                System.out.println("Sunt barbatul care aspir si mi-am trezit sotia!.");
                nuAmAnuntatSotia = false;
            }    
        } // bucla infinita din care se iese dupa ce isi anunta sotia    
    }
    
}

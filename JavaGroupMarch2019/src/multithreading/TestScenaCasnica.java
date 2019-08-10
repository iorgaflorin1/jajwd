/*
 * Implementare scena casnica
 */
package multithreading;

/**
 * Implementare scena casnica
 * @author gheorgheaurelpacurar
 */
public class TestScenaCasnica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // obiectele electrocanice si cele neinsufletite exista in casa
        Aspirator a = new Aspirator();
        Tigara t = new Tigara();
        Televizor tv = new Televizor();
        // Creeare instante din scena si pornirea lor ca si threaduri separate
        Femeie f = new Femeie(t,tv);    // femeia are tigara in mana si vede TVul
        Barbat b = new Barbat(f,a,tv); // Barbatul cunoaste femeia si aspiratorul si vede TV
        // fiind toate threaduri ele vor trebui pornite in ordinea existentei lor, acestea evoluind apoi singure
        a.start();
        t.start();
        tv.start();
        f.start();
        b.start();
    }
    
}

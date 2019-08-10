/*
 * Testing flow control instructions
 */
package javainstructions;

import java.util.LinkedList;

/**
 * Testing flow control instructions
 * @author gheor
 */
public class TestingInstructions {
    // attributes
    private static boolean afaraPloua = false;
    private static boolean afaraNinge = false;
    private static boolean afaraEsteFrumos = false;
    // constants
    private static final String IMI_IAU_UMBRELA = "Imi iau umbrela!";
    private static final String MA_IMBRAC_DE_VARA = "Ma imbrac de vara!";
    private static final String MA_IMBRAC_DE_IARNA = "Ma imbrac de iarna!";
    private static final String INDECIS = "Greu de decis cum sa ma imbrac!";
    public static final String UNU = "unu";
    public static final String DOI = "doi";
    public static final String TREI = "trei";
    public static final String PATRU = "patru";  
        
    /**
     * @param args the command line arguments
     * user should launch program like that
     * java TestingInstructions true false false
     */

    public static void main(String[] args) {
        System.out.println("This is a program");
        int length = args.length;
        if("unu".equals(args[0])){
            System.out.println("Unu la parameteru!");
        }
        else if(DOI.equals(args[1])){
            System.out.println("Doi la parameteru!");
        }
        else if(args[2].equals("trei")){
            System.out.println("Trei la parameteru!");
        }        
        else{
            System.out.println("Trei la parameteru!");
        }
        // switch
        switch(args[0]) {
        case UNU:
           System.out.println("Unu la parameteru!");
           break; // optional
        case DOI:
           System.out.println("Doi la parameteru!");
           break; // optional
        case TREI:
           System.out.println("Trei la parameteru!");
           break; // optional   
        case PATRU:
           System.out.println("Unu la parameteru!");
           break; // optional   
        default: // optional
           System.out.println("Alta Valoare!");
        }

        // classic for
        for(int counter=0;counter<length;counter++){
            System.out.println("Parameter number "+counter+" has value "+args[counter]);
        }
        // create a list of Integers
        LinkedList<Integer> listaDeIntregi = new LinkedList<>();
        // Add few elements in our list
        listaDeIntregi.addFirst(12);
        listaDeIntregi.addFirst(-20);
        listaDeIntregi.addFirst(129);
        listaDeIntregi.addFirst(100);
        listaDeIntregi.addFirst(400);
        listaDeIntregi.addFirst(-333);        
        // read the list and print values with a for for collections
        for(Integer currentValue:listaDeIntregi){
            System.out.println("Found value: "+currentValue.toString());
        }
        // using a while instruction to print the list of values
        int lungime = listaDeIntregi.size();
        int contor = 0;
        while(contor < lungime){
            System.out.println("Found value: "+listaDeIntregi.get(contor));
            contor++;
        }
        contor = 0;
        // implement the same thing with do-while
        do{
            System.out.println("Found value: "+listaDeIntregi.get(contor));
            contor++;
        }while(contor < lungime);
    }
}

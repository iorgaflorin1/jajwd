/*
 * Testing Java instructions
 */
package instructions;
/**
 *
 * @author gheor
 */
public class NewMain {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is a program");
        // if else
        System.out.println("============================ if else =======================");
        // ploua / soare
        if("ploua".equals(args[0])){
            System.out.println("Afara ploua! Imi iau umbrela!");
        }
        else if("soare".equals(args[0])){ // avoid NullPointerException !!!
            System.out.println("Afara NU ploua! NU imi iau umbrela!");
        } else {
            System.out.println("Inseamna ca nu este nimic despre vreme!");
        }
        // switch
        System.out.println("============================ switch =======================");
        switch(args[0]){
            case "ploua": {
                    System.out.println("Afara ploua! Imi iau umbrela!");
            }
            break;
            case "soare": {
                    System.out.println("Afara NU ploua! NU imi iau umbrela!");
            }
            break;    
            default: {
                System.out.println("Inseamna ca nu este nimic despre vreme!");
            }
        }
        // while
        System.out.println("============================ while =======================");
        int lengthArgumentsList = args.length;
        int counter = 0;
        while(counter < lengthArgumentsList){
            System.out.println("Parameter number "+counter+" has value "+args[counter]);
            counter = counter +1;
        }
        // do-while
        System.out.println("============================ do while =======================");
        int doWhileCounter = lengthArgumentsList-1;
        do {
            System.out.println("Parameter number "+doWhileCounter+" has value "+args[doWhileCounter]);
            doWhileCounter = doWhileCounter -1;
        }
        while(doWhileCounter >= 0);
        // for
        System.out.println("============================ for =======================");
        for(int fcounter=0;fcounter<lengthArgumentsList;fcounter = fcounter +1){
            System.out.println("Parameter number "+fcounter+" has value "+args[fcounter]);
        }
        // for on collections
        System.out.println("============================ for on collections =======================");
        int fcounter = 0;
        for(String currentArgument : args){
            System.out.println("Parameter number "+fcounter+" has value "+currentArgument);
            fcounter++;
        }        
    }
}

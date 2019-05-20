/*
 * MyFirstJavaProgram
 */
package com.astiro.helloworld;

import java.util.LinkedList;

/**
 *
 * @author gheor
 */
public class MyFirstJavaProgram {
    
    public static final String UNU = "unu";
    public static final String DOI = "doi";
    public static final String TREI = "trei";
    public static final String PATRU = "patru";    
    
    /**
     * @param args the command line arguments
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
    }
}

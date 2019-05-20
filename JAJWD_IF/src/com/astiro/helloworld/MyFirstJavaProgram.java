/*
 * MyFirstJavaProgram
 */
package com.astiro.helloworld;

/**
 *
 * @author gheor
 */
public class MyFirstJavaProgram {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is a program");
        int length = args.length;
        for(int counter=0;counter<length;counter++){
            System.out.println("Parameter number "+counter+" has value "+args[counter]);
        }
    }
}

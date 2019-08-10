/*
 * Test Java instructions
 */
package usinginstructions;

import java.util.LinkedList;

/**
 * Test Java instructions
 * @author gheor
 */
public class TestJavaInstructions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test if instruction
        String intersection = "left";
        if("left".equals(intersection)){
            System.out.println("Go left!");
        }
        else{
            System.out.println("Go right!");
        }
        // test switch instruction
        int value = 4;
        int otherValue = 2;
        switch(value+otherValue){
            case 3:
                System.out.println("value+otherValue = 3");
                break;
            case 6:
                System.out.println("value+otherValue = 6");
                break;
            default:    
                System.out.println("value+otherValue is not 3 or 6");
        }
        // test do-while instruction
        int counter = 0;
        do{
            System.out.println("counter = "+counter);
            counter = counter + 1; // could be also written counter++
        }while(counter < 5);
        // test while instruction
        int decreaser = 5;
        while(decreaser > 0){
            System.out.println("decreaser = "+decreaser);
            decreaser = decreaser-1; // it could be written also decreaser--
        }
        // test for instruction
        for(int numberOfLoops = 0;numberOfLoops<5;numberOfLoops++){
            System.out.println("Loop number: "+numberOfLoops);
        }
        // test for instruction for collections
        LinkedList<Integer> listOfIntegers = new LinkedList<>();
        // add elements to new created collection - list of Integers
        listOfIntegers.add(10);
        listOfIntegers.add(-2);
        listOfIntegers.add(4);
        // display all elements of collection
        for(Integer currentElement:listOfIntegers){
            System.out.println("Element value is: "+currentElement.intValue());
        }
    }
}

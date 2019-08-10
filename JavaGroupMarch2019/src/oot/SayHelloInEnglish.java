/*
 * Class says hello in English Language
 */
package oot;

/**
 * Class says hello in English Language
 * @author gheor
 */
public class SayHelloInEnglish extends SayHello{
    @Override
    public void sayHello() {
        super.displayLine();
        System.out.println("Hello world!");
    }
}

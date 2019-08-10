/*
 * Class says hello in German Language
 */
package oot;

/**
 * Class says hello in German Language
 * @author gheor
 */
public class SayHelloInGerman extends SayHello{
    @Override
    public void sayHello() {
        super.displayLine();
        System.out.println("Hallo Welt!");
    }
}

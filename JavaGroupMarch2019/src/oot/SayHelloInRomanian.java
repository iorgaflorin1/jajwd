/*
 * Class says hello in Romanian Language
 */
package oot;

/**
 * Class says hello in Romanian Language
 * @author gheor
 */
public class SayHelloInRomanian extends SayHello{
    @Override
    public void sayHello() {
        super.displayLine();
        System.out.println("Salut lume!");
    }
}

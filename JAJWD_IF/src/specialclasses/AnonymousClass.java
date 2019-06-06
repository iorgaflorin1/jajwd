/*
 * Use a class in a code for creating a single object is done using anonymous class.
 */
package specialclasses;

/**
 * Use a class in a code for creating a single object is done using anonymous class.
 * @author gheor
 */
public class AnonymousClass {
   // Inner interface HelloWorld
    interface HelloWorld {
        // method says hello in a specific language to a specified person
        public void greetSomeone(String someone);
    }
    // Method sayHello prints 
    public void sayHelloInManyLanguages() {
        // Local class 
        class EnglishGreeting implements HelloWorld {
            /*@Override*/
            public void greetSomeone(String someone) {
                System.out.println("Hello " + someone);
            }
        } ;
        //Anononymous class
        HelloWorld frenchGreeting = new HelloWorld(){
            @Override
            public void greetSomeone(String someone) {
                System.out.println("Bon jour " + someone);
            } };
        //Lambda Expression
        HelloWorld spanishGreeting = (String someone) -> {
            System.out.println("Hola, " + someone);
        }; 
        //  reate 3 objects for each Language
        HelloWorld englishGreeting = new EnglishGreeting();
        //HelloWorld frenchGreeting = new FrenchGreeting();
        //HelloWorld spanishGreeting = new SpanishGreeting();
        // says hello in 3 different languages
        englishGreeting.greetSomeone("Clark");
        frenchGreeting.greetSomeone("Bijou");
        spanishGreeting.greetSomeone("Don Quijote");
    }
}
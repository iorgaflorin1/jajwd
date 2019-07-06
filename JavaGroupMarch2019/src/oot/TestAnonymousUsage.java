package oot;

/*
 * Testing anonymous classes usage

/**
 * Testing anonymous classes usage
 * @author gheor
 */
public class TestAnonymousUsage {
    interface SayHello{
        public void sayHello();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // usage of classical local class
        class SayHelloInEnglish implements SayHello{
            @Override
            public void sayHello() {
                System.out.println("Hello world!");
            }
        }
        SayHelloInEnglish englishObject = new SayHelloInEnglish();
        englishObject.sayHello();   
        // same code using an anonymous class
        SayHello englishAnonymousObject = new SayHello(){
            @Override
            public void sayHello() {
                System.out.println("Hello world!");
            }
        };
        englishAnonymousObject.sayHello(); 
        // use anonymous code for German Language
        SayHello germanAnonymousObject = new SayHello(){
            @Override
            public void sayHello() {
                System.out.println("Hallo Welt!");
            }
        };
        germanAnonymousObject.sayHello(); 
        // say hello in Romanian
        SayHello romanianAnonymousObject = new SayHello(){
            @Override
            public void sayHello() {
                System.out.println("Salut lume!");
            }        
        };
        romanianAnonymousObject.sayHello();   
    }
}

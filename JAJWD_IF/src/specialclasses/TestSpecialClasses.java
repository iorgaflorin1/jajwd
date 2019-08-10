/*
 * Tests al special classes
 */
package specialclasses;

/**
 * Tests of special classes
 * @author gheor
 */
public class TestSpecialClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // used nested classes
        NestedClasses nc = new NestedClasses();
        System.out.println("----------------- Nested classes usage-------------------------");
        nc.printInnerContent();
        NestedClasses.printStaticContent();
        // used local class
        LocalClasses lc = new LocalClasses();
        System.out.println("----------------- Local class usage-------------------------");
        lc.printLocalClassIncluded();
        // use anonymous class and Lambda Expressions
        System.out.println("----------------- Anonymous class and Lambda Expression usage-------------------------");
        AnonymousClass ac = new AnonymousClass();
        ac.sayHelloInManyLanguages();
        // create new concrete shapes that extends an abstract class
        System.out.println("----------------- Abstract class usage-------------------------");
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Line l = new Line();
        r.draw();
        c.draw();
        l.draw();
        // testing final class
        System.out.println("----------------- Final class usage-------------------------");
        String testLicence = "JWEQ";
        CheckLicence cl = new CheckLicence();
        boolean response = cl.validate(testLicence);
        System.out.println("Licence "+testLicence+" is valid: "+ response);
        String testLicenceOne = "K1WE";
        response = cl.validate(testLicenceOne);
        System.out.println("Licence "+testLicenceOne+" is valid: "+ response);
        String testLicenceHacked = "HACKED";
        //HackingCheckLicence clh = new HackingCheckLicence();
        //response = clh.validate(testLicenceHacked);
        //System.out.println("Licence "+testLicenceHacked+" is valid: "+ response);
        // testing generic classes
        System.out.println("----------------- Generic class usage-------------------------");
        Box<Integer> newBox = new Box<Integer>();
        newBox.setContent(123);
        System.out.println("I extracted from Box<Integer> the value: "+newBox.getContent());
        Box<String> newBoxForString = new Box<String>();
        newBoxForString.setContent("cucu baw");
        System.out.println("I extracted from Box<String> the value: "+newBoxForString.getContent());
        /* generics is not working for standard types
        Box<int> newBoxForInt = new Box<int>();
        newBoxForString.setContent("cucu baw");
        System.out.println("I extracted from Box<String> the value: "+newBoxForString.getContent()); */
        Box<Circle> newBoxTwo = new Box<>();
        newBoxTwo.setContent(new Circle());
        System.out.println("I extracted from Box<Circle> the value: "+(Circle)(newBoxTwo.getContent()));
        BoxForNumbers<Integer> bfi = new BoxForNumbers<>();
        bfi.setContent(333);
        System.out.println("I extracted from BoxForNumbers<Integer> the value: "+bfi.getContent());
        //BoxForNumbers<String> bfs = new BoxForNumbers<>(); // cannot create an object with a wrong type!
        //bfi.setContent(333);
        //System.out.println("I extracted from BoxForNumbers<Integer> the value: "+bfi.getContent());
    }
}

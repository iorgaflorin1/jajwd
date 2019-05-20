/*
 * Testing flow control instructions
 */
package javainstructions;

/**
 * Testing flow control instructions
 * @author gheor
 */
public class TestingInstructions {
    // attributes
    private static boolean afaraPloua = false;
    private static boolean afaraNinge = false;
    private static boolean afaraEsteFrumos = false;
    // constants
    private static final String IMI_IAU_UMBRELA = "Imi iau umbrela!";
    private static final String MA_IMBRAC_DE_VARA = "Ma imbrac de vara!";
    private static final String MA_IMBRAC_DE_IARNA = "Ma imbrac de iarna!";
    private static final String INDECIS = "Greu de decis cum sa ma imbrac!";
        
    /**
     * @param args the command line arguments
     * user should launch program like that
     * java TestingInstructions true false false
     */
    public static void main(String[] args) {
        // read values for variables from args
        afaraPloua = new Boolean(args[0]).booleanValue();
        afaraNinge = new Boolean(args[0]).booleanValue();
        afaraEsteFrumos = new Boolean(args[0]).booleanValue();
        // using if-else
        if(afaraPloua){
            System.out.println(IMI_IAU_UMBRELA);
        }
        else{
            if(afaraEsteFrumos){
                System.out.println(MA_IMBRAC_DE_VARA);
            }
            else{
                if(afaraNinge){
                    System.out.println(MA_IMBRAC_DE_IARNA);
                }
                else{
                    System.out.println(INDECIS);
                }
            }
        }
        
    }
}

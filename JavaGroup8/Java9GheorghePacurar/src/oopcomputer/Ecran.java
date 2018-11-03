/*
 * Ecranul calculatorului
 */
package oopcomputer;

/**
 *
 * @author gheor
 */
public class Ecran {

    private String afisaj = "0";
    private Carcasa stapana;
    
    public Ecran(Carcasa nouaStapana) {
        this.stapana = nouaStapana;
    }
    
    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String afisaj) {
        
        switch (afisaj) {
            case "+":
                operatiuneLocala('+');
                break;
            case "-":
                operatiuneLocala('-');
                break;
            case "*":
                operatiuneLocala('*');
                break;    
            case "/":
                operatiuneLocala('/');
                break;    
            case "=":
                break;  
            default:    
                this.afisaj = this.afisaj + afisaj;
                int operandUnu = stapana.getAlu().getOperandUnu();
                int afisajInt = Integer.parseInt(afisaj);
                if(0 == operandUnu || ' ' == stapana.getAlu().getOperator()){
                    stapana.getAlu().setOperandUnu(Integer.parseInt(this.afisaj));
                }
        }
        this.afisaj = afisaj;
    }
    /**
     * Private method for computation
     */
    private void operatiuneLocala(char c){
        stapana.getAlu().setOperandUnu(Integer.getInteger(afisaj));
        stapana.getAlu().setOperator(c);
        afisaj = Character.toString(c);
    }
}

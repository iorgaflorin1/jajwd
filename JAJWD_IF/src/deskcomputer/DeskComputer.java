/*
 * Desk Computer is an assembled device
 */
package deskcomputer;

import static deskcomputer.DeskComputerScreen.DISPLAY_DEFAULT_VALUE;
import java.util.LinkedList;

/**
 * Desk Computer is an assembled device
 * @author gheor
 */
public class DeskComputer {
    // Create the DeskComputerButtons for didgits 0..9
    private LinkedList<DeskComputerButton> keyboard = new LinkedList<>();
    // Create a display for desk computer
    private DeskComputerScreen screen = new DeskComputerScreen();
    // memories for firstOperand, operator and secondOperand as for result
    private DeskComputerALU alu = new DeskComputerALU();
    // gett-ers and sett-ers
        public DeskComputerScreen getScreen() {
        return screen;
    }

    public void setScreen(DeskComputerScreen screen) {
        this.screen = screen;
    }
    // Create constructor that builds the desk calculator
    public DeskComputer(){
        // create and add buttons to calculator
        keyboard.add(0,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_0));
        keyboard.add(1,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_1));
        keyboard.add(2,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_2));
        keyboard.add(3,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_3));
        keyboard.add(4,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_4));
        keyboard.add(5,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_5));
        keyboard.add(6,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_6));
        keyboard.add(7,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_7));
        keyboard.add(8,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_8));
        keyboard.add(9,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_9));
        keyboard.add(10,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_ADD));
        keyboard.add(11,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_SUBSTRACT));
        keyboard.add(12,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_MULTIPLY));
        keyboard.add(13,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_DIVIDE));
        keyboard.add(14,new DeskComputerButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_EQUAL));
    }
    
    /**
     Methods simulates pushing the button with specified markup
     * @param markup is the markup from the button (we see it)     */
    public void pushCalculatorButton(DeskComputerButton.ButtonsMarkups markup){
        // 
        // see what button was pushed
        switch(markup){
            case MARKUP_ON_BUTTON_0:
                    screen.display(markup);
            break;
            case MARKUP_ON_BUTTON_1:
                    screen.display(markup);
            break;
            case MARKUP_ON_BUTTON_2:
                    screen.display(markup);
            break;
            case MARKUP_ON_BUTTON_3:
                    screen.display(markup);
            break;
            case MARKUP_ON_BUTTON_4:
                    screen.display(markup);
            break;
            case MARKUP_ON_BUTTON_5:
                    screen.display(markup);
            break;
            case MARKUP_ON_BUTTON_6:
                    screen.display(markup);
            break;
            case MARKUP_ON_BUTTON_7:
                    screen.display(markup);
            break;
            case MARKUP_ON_BUTTON_8:
                    screen.display(markup);
            break;
            case MARKUP_ON_BUTTON_9:
                    screen.display(markup);
            break;
            case MARKUP_ON_BUTTON_ADD:
                processOperatorOne(markup);
            break;
            case MARKUP_ON_BUTTON_SUBSTRACT:
                processOperatorOne(markup);
            break;
            case MARKUP_ON_BUTTON_MULTIPLY:
                processOperatorOne(markup);
            break;
            case MARKUP_ON_BUTTON_DIVIDE:
                processOperatorOne(markup);
            break;
            case MARKUP_ON_BUTTON_EQUAL:
                    processResult(markup);
                    screen.display(markup);
                    Character op = alu.getOperator();
                    System.out.println(alu.getFirstOperand()+ op.toString() +alu.getSecondOperand()+" = "+alu.getResult());
            break;
            default:
                System.out.println("THIS CANNOT HAPPEN!!!!!");
        }   

    }
    /**
     private method to process case of +,-,*,/
     */
    private void processOperatorOne(DeskComputerButton.ButtonsMarkups markup){
        // save operator one
        char operator = ' ';
        switch(markup){
            case MARKUP_ON_BUTTON_ADD : 
                operator = '+';
                break;
            case MARKUP_ON_BUTTON_SUBSTRACT : 
                operator = '-';
                break;  
            case MARKUP_ON_BUTTON_MULTIPLY : 
                operator = '*';
                break;
            case MARKUP_ON_BUTTON_DIVIDE : 
                operator = '/';
                break;     
        }
        alu.setOperator(operator);
        // take value from display object which is String and convert it in int
        String op1 = screen.getDisplay();
        alu.setFirstOperand(Integer.parseInt(op1));
        // clear the screen
        screen.display(markup);
    }
    /**
     private method to process result
     */
    private void processResult(DeskComputerButton.ButtonsMarkups markup){
        // save operator two
        // take value from display object which is String and convert it in int
        String op2 = screen.getDisplay();
        alu.setSecondOperand(Integer.parseInt(op2));
        // compute result
        switch(alu.getOperator()){
            case '+':
                alu.setResult(alu.getFirstOperand()+alu.getSecondOperand());
                break;
            case '-':
                alu.setResult(alu.getFirstOperand()-alu.getSecondOperand());  
                break;
            case '*':
                alu.setResult(alu.getFirstOperand()*alu.getSecondOperand());
                break;
            case '/':
                alu.setResult(alu.getFirstOperand()/alu.getSecondOperand());
                break;
            default:
                System.out.println("OPERATOR IS WRONG: "+alu.getOperator());
        }
        // clear the screen
        screen.display(markup);
    }
}

/*
 * Testing desk computer
 */
package deskcomputer;

/**
 * Testing desk computer
 * @author gheor
 */
public class TestDeskComputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new DeskComputer
        DeskComputer dc = new DeskComputer();
        // push keys 1,2 and 3 from keyboard
        dc.pushCalculatorButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_1);
        dc.pushCalculatorButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_2);
        dc.pushCalculatorButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_3);
        // push +
        dc.pushCalculatorButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_ADD);
        //push keys 3,2,1
        dc.pushCalculatorButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_3);
        dc.pushCalculatorButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_2);
        dc.pushCalculatorButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_1);
        //push =
        dc.pushCalculatorButton(DeskComputerButton.ButtonsMarkups.MARKUP_ON_BUTTON_EQUAL);
    }
    
}

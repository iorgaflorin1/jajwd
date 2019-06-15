/*
 * Desk Computer Button
 */
package deskcomputer;

/**
 * Desk Computer Button
 * @author gheor
 */
public class DeskComputerButton {
    // constants defining markups on buttons
    public static enum ButtonsMarkups{
    MARKUP_ON_BUTTON_0,
    MARKUP_ON_BUTTON_1,
    MARKUP_ON_BUTTON_2,
    MARKUP_ON_BUTTON_3,
    MARKUP_ON_BUTTON_4,
    MARKUP_ON_BUTTON_5,
    MARKUP_ON_BUTTON_6,
    MARKUP_ON_BUTTON_7,
    MARKUP_ON_BUTTON_8,
    MARKUP_ON_BUTTON_9,
    MARKUP_ON_BUTTON_ADD,
    MARKUP_ON_BUTTON_SUBSTRACT,
    MARKUP_ON_BUTTON_DIVIDE,
    MARKUP_ON_BUTTON_MULTIPLY,
    MARKUP_ON_BUTTON_EQUAL}
    // variable to keep markup on the button
    private ButtonsMarkups markup;
    // constructor for DeskComputerButton with markup mandatory
    public DeskComputerButton(ButtonsMarkups markup){
        this.markup = markup;
    }
    
}

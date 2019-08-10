/*
 * DeskComputerScreen is the screen of desk computer
 */
package deskcomputer;

/**
 * DeskComputerScreen is the screen of desk computer
 * @author gheor
 */
class DeskComputerScreen {
    public static final String DISPLAY_DEFAULT_VALUE = "";
    // create a String variable to keep the image of screen
    private String display =DISPLAY_DEFAULT_VALUE;

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
    
    // methods display information on desk computer screen
    public void display(DeskComputerButton.ButtonsMarkups markup){
        String addToTheRight = DISPLAY_DEFAULT_VALUE;
        switch(markup){
            case MARKUP_ON_BUTTON_0:
                    addToTheRight = "0";
            break;
            case MARKUP_ON_BUTTON_1:
                    addToTheRight = "1";
            break;
            case MARKUP_ON_BUTTON_2:
                    addToTheRight = "2";
            break;
            case MARKUP_ON_BUTTON_3:
                    addToTheRight = "3";
            break;
            case MARKUP_ON_BUTTON_4:
                    addToTheRight = "4";
            break;
            case MARKUP_ON_BUTTON_5:
                    addToTheRight = "5";
            break;
            case MARKUP_ON_BUTTON_6:
                    addToTheRight = "6";
            break;
            case MARKUP_ON_BUTTON_7:
                    addToTheRight = "7";
            break;
            case MARKUP_ON_BUTTON_8:
                    addToTheRight = "8";
            break;
            case MARKUP_ON_BUTTON_9:
                    addToTheRight = "9";
            break;
            case MARKUP_ON_BUTTON_ADD:
                    addToTheRight = DISPLAY_DEFAULT_VALUE;
                    display = DISPLAY_DEFAULT_VALUE;
            break;
            case MARKUP_ON_BUTTON_SUBSTRACT:
                    addToTheRight = DISPLAY_DEFAULT_VALUE;
                    display = DISPLAY_DEFAULT_VALUE;
            break;
            case MARKUP_ON_BUTTON_MULTIPLY:
                    addToTheRight = DISPLAY_DEFAULT_VALUE;
                    display = DISPLAY_DEFAULT_VALUE;
            break;
            case MARKUP_ON_BUTTON_DIVIDE:
                    addToTheRight = DISPLAY_DEFAULT_VALUE;
                    display = DISPLAY_DEFAULT_VALUE;
            break;
            case MARKUP_ON_BUTTON_EQUAL:
                    addToTheRight = DISPLAY_DEFAULT_VALUE;
                    display = DISPLAY_DEFAULT_VALUE;
            break;
            default:
                System.out.println("THIS CANNOT HAPPEN!!!!!");
        }
        display=display.concat(addToTheRight);
        // display in console
        System.out.println(display);
    }
}

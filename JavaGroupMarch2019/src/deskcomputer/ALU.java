/*
 * ALU is processing all desk computer operations
 */
package deskcomputer;

/**
 * ALU is processing all desk computer operations
 * @author gheor
 */
class ALU {
    // Desk Computer parent
    DeskComputer parent;
    // memory for first operand
    private int firstOperand=0;
    // memory for second operand
    private int secondOperand=0;
    // memory for operator
    private DeskComputerButton.ButtonMarkups operator = DeskComputerButton.ButtonMarkups.KEY_0;
    // memory for result
    private int result = 0;
    // ALU constructor
    public ALU(DeskComputer parent){
        this.parent = parent;
    }
    
    
    // method push key
    public void pushKey(DeskComputerButton pushedButton){
        switch(pushedButton.getMarkup()){
            case KEY_0:
                {
                    if (DeskComputerButton.ButtonMarkups.KEY_0 == operator){
                        String temp = String.valueOf(firstOperand);
                        temp=temp.concat("0");
                        parent.getCd().display(temp);
                        firstOperand = Integer.parseInt(temp);
                    }
                    else{
                        String temp = String.valueOf(secondOperand);
                        temp=temp.concat("0");
                        parent.getCd().display(temp);
                        secondOperand = Integer.parseInt(temp);                    
                    }
                }
                break;
            case KEY_1:
                {
                    if (DeskComputerButton.ButtonMarkups.KEY_0 == operator){
                        String temp = String.valueOf(firstOperand);
                        temp=temp.concat("1");
                        parent.getCd().display(temp);
                        firstOperand = Integer.parseInt(temp);
                    }
                    else{
                        String temp = String.valueOf(secondOperand);
                        temp=temp.concat("1");
                        parent.getCd().display(temp);
                        secondOperand = Integer.parseInt(temp);                    
                    }
                }
                break;     
            case KEY_2:
                {
                    if (DeskComputerButton.ButtonMarkups.KEY_0 == operator){
                        String temp = String.valueOf(firstOperand);
                        temp=temp.concat("2");
                        parent.getCd().display(temp);
                        firstOperand = Integer.parseInt(temp);
                    }
                    else{
                        String temp = String.valueOf(secondOperand);
                        temp=temp.concat("2");
                        parent.getCd().display(temp);
                        secondOperand = Integer.parseInt(temp);                    
                    }
                }
                break;    
            case KEY_3:
                {
                    if (DeskComputerButton.ButtonMarkups.KEY_0 == operator){
                        String temp = String.valueOf(firstOperand);
                        temp=temp.concat("3");
                        parent.getCd().display(temp);
                        firstOperand = Integer.parseInt(temp);
                    }
                    else{
                        String temp = String.valueOf(secondOperand);
                        temp=temp.concat("3");
                        parent.getCd().display(temp);
                        secondOperand = Integer.parseInt(temp);                    
                    }
                }
                break;   
            case KEY_4:
                {
                    if (DeskComputerButton.ButtonMarkups.KEY_0 == operator){
                        String temp = String.valueOf(firstOperand);
                        temp=temp.concat("4");
                        parent.getCd().display(temp);
                        firstOperand = Integer.parseInt(temp);
                    }
                    else{
                        String temp = String.valueOf(secondOperand);
                        temp=temp.concat("4");
                        parent.getCd().display(temp);
                        secondOperand = Integer.parseInt(temp);                    
                    }
                }
                break;    
            case KEY_9:
                {
                    if (DeskComputerButton.ButtonMarkups.KEY_0 == operator){
                        String temp = String.valueOf(firstOperand);
                        temp=temp.concat("9");
                        parent.getCd().display(temp);
                        firstOperand = Integer.parseInt(temp);
                    }
                    else{
                        String temp = String.valueOf(secondOperand);
                        temp=temp.concat("9");
                        parent.getCd().display(temp);
                        secondOperand = Integer.parseInt(temp);                    
                    }
                }
                break;    
            case KEY_PLUS:{
                operator = DeskComputerButton.ButtonMarkups.KEY_PLUS;
                parent.getCd().display(String.valueOf(operator));
                }
                break;
            case KEY_EQUAL:{
                switch(operator){
                    case KEY_PLUS: result = firstOperand + secondOperand;
                    break;
                    case KEY_MINUS: result = firstOperand - secondOperand;
                    break;
                    case KEY_MULTIPLY: result = firstOperand *secondOperand;
                    break;
                    case KEY_DIVIDE: result = firstOperand/secondOperand;
                    break;
                }
                parent.getCd().display(String.valueOf(result));
            }
            break;
        }
    }
}

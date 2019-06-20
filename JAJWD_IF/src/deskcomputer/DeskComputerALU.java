/*
 * ALU of desk computer
 */
package deskcomputer;

/**
 * ALU of desk computer
 * @author gheor
 */
class DeskComputerALU {
    private int firstOperand = 0;
    private int secondOperand = 0;
    private char operator = ' ';
    private int result = 0;
    // getters and setters
    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }
    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }    
}

 
package za.ac.tut.question;

 
public class Question {
    private int numOne;
    private int numTwo;
    private char operation;
    
    public Question(){}

    public Question(int numOne, int numTwo, char operation) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.operation = operation;
    }

    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
    
    
}

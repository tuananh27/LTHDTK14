package Buoi5;

public class IntSquare {
    private double squareValue; //implementation

    //in terface
    public double getSquare(int value){
        this.calcuateSquare(value);
        return this.squareValue;
    }
    //Abstraction

    //implementation
    private void calcuateSquare(int value){
        this.squareValue = Math.pow(value , 2);//Math
    }


}

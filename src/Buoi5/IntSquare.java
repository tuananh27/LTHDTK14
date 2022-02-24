package Buoi5;

public class IntSquare {
    private double squareValue; //implementation

    //in terface
    public double getSquareOperator(int value){
        this.squareValue = value * value;//operator X
        return this.squareValue;
    }

    //implementation
    private void calcuateSquare(int value){
        this.squareValue = Math.pow(value , 2);//Math
    }
}

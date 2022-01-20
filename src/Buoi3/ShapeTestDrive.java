package Buoi3;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

       circle.rotate();
       circle.playsound();

       square.rotate();
       square.playsound();

       triangle.rotate();
       triangle.playSound();
    }
}

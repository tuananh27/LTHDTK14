package Test;

public class ShapeTestDrive {
   public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setSoundFile("circle.aif");
    circle.rotate();
    circle.playSound();

    Square square = new Square();
    square.setSoundFile("square.aif");
    square.rotate();
    square.playSound();
    
    Triangle triangle = new Triangle();
    triangle.setSoundFile("triangle.aif");
    triangle.rotate();
    triangle.playSound();

    Amoeba amoeba = new Amoeba();
    amoeba.setxPoint(5);
    amoeba.setyPoint(3);
    amoeba.setSoundFile("amoeba.hif");
    amoeba.rotate();
    amoeba.playSound();

   }

}

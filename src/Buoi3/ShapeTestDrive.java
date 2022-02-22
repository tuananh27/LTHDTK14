package Buoi3;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle("Hinh tron.aif");

        Square square = new Square("Hinh vuong.aif");

        Triangle triangle = new Triangle("Hinh tam giac.aif");

        Amoeba amoeba = new Amoeba("Hinh Amoeba.hif");

        Amoeba amoeba2 = new Amoeba("Hinh Amoeba.hif", 5.9, 11.6);
        
       circle.rotate();

       square.rotate();

       triangle.rotate();

       amoeba.rotate();
       
       amoeba2.rotate();
       

    }
}

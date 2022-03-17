package Buoi9;

public class Circle extends Shape {
    private int radius;
    public Circle(int x, int y, int r) {
        super(x, y);
        radius = r;
    }

    @Override
    public void draw() {
        System.out.println("Draw cricle at "+x+","+y);
    }

    @Override
    public void erase() {
      System.out.println("Erase circle at" +x+","+y);
    }
}

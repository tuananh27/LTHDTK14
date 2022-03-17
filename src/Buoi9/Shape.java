package Buoi9;

abstract public class Shape {
    protected int x, y;

    public Shape(int x, int y) {
        x = x;
        y = y;
    }

    abstract public void draw();

    abstract public void erase();

    public void moveTo(int x, int y){
        erase();
        x = x;
        y = y;
        draw();
    }

}

   


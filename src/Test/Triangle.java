package Test;

public class Triangle extends Shape {
    @Override
    public void rotate(){
        System.out.println("Xoay hình tam giác 360 độ!");
    }

    @Override
    public void playSound(){
        System.out.println("Play sound: " +this.getSoundFile() + " music");
    }   
    
}

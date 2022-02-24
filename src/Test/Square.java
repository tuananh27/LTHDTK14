package Test;

public class Square extends Shape {
    @Override
    public void rotate(){
        System.out.println("Xoay hình vuông 360 độ!");
    }

    @Override
    public void playSound(){
        System.out.println("Play sound: " +this.getSoundFile() + " music");
    }
}

package Buoi3;

public class Circle {
    private String soundFile;

    

    public Circle(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Hinh tron dang xoay 360 do....");
        this.playsound();
    }

    void playsound(){
        System.out.println("Play File " +this.soundFile + "music");
    }
}


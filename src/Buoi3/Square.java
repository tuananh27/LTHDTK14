package Buoi3;

public class Square {
    String soundFile;

    

    public Square(String soundFile) {
        this.soundFile = soundFile;
    }


    void rotate(){
        System.out.println("Hinh vuong dang xoay 360 do....");
        this.playsound();
    }

    

    void playsound(){
        System.out.println("Play File " +this.soundFile + "music");
    }
}

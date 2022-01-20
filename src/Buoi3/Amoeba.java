package Buoi3;

public class Amoeba {
    String soundFile;

    public Amoeba(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Hinh Amoeba dang xoay 360 do...");
        this.playsound();
    }

    void playsound(){
        System.out.println("Play File " +this.soundFile + "music");
    }
    
}

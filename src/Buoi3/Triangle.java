package Buoi3;

public class Triangle {
    private String soundFile;

    public Triangle(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Hinh tam giac dang xoay 360 do ...");
        this.playsound();
    }

    void playsound(){
        System.out.println("Play File " +this.soundFile + "music");
    }

}

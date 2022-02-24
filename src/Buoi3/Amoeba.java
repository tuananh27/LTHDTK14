package Buoi3;

public class Amoeba {
    private String soundFile;
    private double xPoint;
    private double yPoint;

    public Amoeba(String soundFile, double xPoint, double yPoint) {
        this.soundFile = soundFile;
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }
    

    public Amoeba(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Hinh Amoeba dang xoay 360 do tai x: " +xPoint +  "diem y" + yPoint );
        this.playsound();
    }

    void playsound(){
        System.out.println("Play File " +this.soundFile + "music");
    }
    
}

package Test;

public class Amoeba extends Shape {
    private double xPoint, yPoint;
/** 
   * @param xPoint the xPoint to set
   */  
    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

/** 
   * @param yPoint the yPoint to set
   */  
    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    @Override
    void rotate(){
        System.out.println("Rotating 360 ... at xPoint: " +this.xPoint + "at yPoint: " + this.yPoint);
    }

    @Override
    void playSound(){
        System.out.println("Play file sound: " +this.getSoundFile() + " music");
    }
    
}

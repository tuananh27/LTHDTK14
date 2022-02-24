package Test;

public class Shape {
    private String soundFile;

    /** 
     * @param soundFile() the soundFile to set
     */  
      
     public void setSoundFile(String soundFile){
      this.soundFile = soundFile;
     }
     
      public Shape(){}
  
      public Shape(String soundFile) {
          this.soundFile = soundFile;
      }
  
      public String getSoundFile() {
          return soundFile;
      }
  
   /**default */  void rotate(){
          System.out.println("Xoay hình 360 độ!");
      }
  
      void playSound(){
          System.out.println("Play sound: " +this.soundFile + " music");
      }
}

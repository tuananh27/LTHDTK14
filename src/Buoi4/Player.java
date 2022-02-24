package Buoi4;

public class Player {
    //attribute ra state
    private int number = 0;

    //method ra behavior
    public void guess(){
        number = (int) (Math.random() * 10);  //đếm số từ 0 đến 9
        System.out.println("I'm guessing " + number);
    }

    public int getNumber() {
        return number;
    }

    
    
}

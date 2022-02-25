package Buoi6;

public class Dog extends Camine{


    //cài đè
    @Override
    protected void makeNoise() {
        System.out.println("Making gau gau..");
    }

    @Override
    protected void eat() {
        System.out.println("Eating pone ....");
    }
    //Bổ xung thêm
    public void protectHouse(){
        System.out.println("Protecting....");
    }

    public void chaseCat(){
        System.out.println("Chasing cat ...");
    }
    
}

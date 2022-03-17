package Buoi9;

public class Dog extends Feline implements Pet {
    //implementation
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

    @Override
    public void beFriendly() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }
}

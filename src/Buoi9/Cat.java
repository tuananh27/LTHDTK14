package Buoi9;

public class Cat extends Feline implements Pet {
    @Override
    protected void makeNoise() {
        System.out.println("Making meow meow noise..");
    }

    @Override
    protected void eat() {
        System.out.println("Eating fish...");
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

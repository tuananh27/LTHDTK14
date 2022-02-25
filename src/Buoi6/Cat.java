package Buoi6;



public class Cat extends Feline {
    @Override
    protected void makeNoise() {
        System.out.println("Making meow meow noise..");
    }

    @Override
    protected void eat() {
        System.out.println("Eating fish...");
    }

    
}

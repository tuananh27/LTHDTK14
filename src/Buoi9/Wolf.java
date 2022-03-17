package Buoi9;

public class Wolf extends Canine {
    @Override
    protected void makeNoise() {
        System.out.println("Making Wolf noise..");
    }

    @Override
    protected void eat() {
        System.out.println("Eating cadver.. ");
    }
    
}

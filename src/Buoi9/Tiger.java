package Buoi9;

public class Tiger extends Feline {
    @Override
    protected void makeNoise() {
        System.out.println("Making Tiger noise..");
    }

    @Override
    protected void eat() {
        System.out.println("Eating beef...");
    }
}

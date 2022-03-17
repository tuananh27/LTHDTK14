package Buoi9;


public class Lion extends Feline {
    @Override
    protected void makeNoise() {
        System.out.println("Making Lion noise ");
    }

    @Override
    protected void eat() {
        System.out.println("Eating meat...");
    }
}

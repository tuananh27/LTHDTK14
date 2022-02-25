package Buoi6;

public class Lion extends Feline {
    //state
    
    //method
    @Override
    protected void makeNoise() {
        System.out.println("Making Lion noise ");
    }

    @Override
    protected void eat() {
        System.out.println("Eating meat...");
    }
}

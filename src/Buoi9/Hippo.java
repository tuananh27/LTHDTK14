package Buoi9;

public class Hippo extends Animal{
    @Override
    protected void makeNoise() {
       System.out.println("Making Hippo noise");
    }

    @Override
    protected void eat() {
        System.out.println("eating vegetal....");
    }
    
}

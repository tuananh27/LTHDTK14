package Buoi9;

public abstract class Animal {

    //attribute - state
    private String picture;
    private String food;
    private int hunger;
    private String name;


    //method -behavior
    protected abstract void makeNoise(); //hop dong

    protected void sleep(){
        System.out.println("sleeping...");
    }

    protected abstract void eat();
    
    protected void roam(){
        System.out.println("Roam......");
    }

    
}

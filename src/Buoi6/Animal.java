package Buoi6;

public class Animal {
    //attribute - state
    private String picture;
    private String food;
    private int hunger;


    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    //method -behavior

    protected void makeNoise(){
        System.out.println("making noise .....");
    }
    protected void sleep(){
        System.out.println("sleeping...");
    }
    protected void eat(){
        System.out.println("Eating...");
    }
    protected void roam(){
        System.out.println("Roam......");
    }



}

package Test;

public class Dog {
    int size;
    String breed;
    String name;

    public Dog(){}

    public Dog(int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    public void show(){
        System.out.println("size: " +size);
        System.out.println("breed: " +breed);
        System.out.println("name: " +name);
    }

    void bark(){
        if(size > 14)
        System.out.println("gau gau!!");
        else
        System.out.println("ang ang!!!");
    }

    void setBigger(){
        size += 5;
    }

    void run(){
        System.out.println("chay....");
        this.bark();
    }
   
}

package Buoi6;

public class FilineTestDrive {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.makeNoise();
        lion.eat();
        lion.sleep();
        lion.roam();

        Tiger tiger = new Tiger();
        tiger.makeNoise();
        tiger.eat();
        tiger.sleep();
        tiger.roam();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.eat();
        cat.sleep();
        cat.roam();
    }
}

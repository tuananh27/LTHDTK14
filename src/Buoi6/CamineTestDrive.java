package Buoi6;

public class CamineTestDrive {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.makeNoise();
        wolf.eat();
        wolf.sleep();
        wolf.roam();

        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();
        dog.sleep();
        dog.roam();
    }
}

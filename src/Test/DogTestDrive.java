package Test;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog(18, "Gau A", "Nimo");
        dog.show();
        dog.bark();
        dog.setBigger();
        dog.run();
    }
}

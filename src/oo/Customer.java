package oo;

import java.util.Scanner;

public class Customer {
    String name;
    String address;
    Scanner scanner = new Scanner(System.in);

    void ThontinKH(){
        System.out.println("Thong tin khach hang: ");
        name = scanner.nextLine();
        System.out.println("Dia chi: ");
        address = scanner.nextLine();

    }

    void inthongtin(){
        System.out.println("Ten Khach Hang: " +name);
        System.out.println("Dia chi: " +address);
    }

}

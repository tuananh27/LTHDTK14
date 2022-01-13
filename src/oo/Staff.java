package oo;

import java.util.Scanner;

public class Staff {
    int cong;
    int Luong = 10000;
    double tienluong;
    String name;
    Scanner scanner = new Scanner(System.in);

    void tinh(){
        System.out.println("Tong ngay di lam");
        cong = scanner.nextInt();
        tienluong = cong*Luong;
    }

    void nhap(){
        System.out.println("Ten nhan vien: ");
        name = scanner.nextLine();
    }

    void in(){
        System.out.println("Ten nv: " +name);
        System.out.println("Luong :" +tienluong);
    }
}

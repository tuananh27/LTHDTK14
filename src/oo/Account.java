package oo;

import java.util.Scanner;

public class Account {
    int account_number = 12345;
    int account_banlance = 0;

    String staName;
    double salary;

    String cusName;
    String address;

    Scanner input = new Scanner(System.in);

    void withdraw() {
        System.out.print("Nhap vao so tien can rut ");
        int withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount;// thao tac len data
        // account_banlance = account_banlance - withdrawAmount;
    }
    void depoist() {
        // gui tien: deposit
        System.out.print("Nhap vao so tien gui ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_banlance += depositAmount;// thao tac len data
    }
    void show() {
        System.out.println("thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_banlance);
    }

    void staName(){
        staName = "Nguyen Van A";
    }

    void cusName(){
        cusName = "Nguyen Van B";
    }

    void salary(){
        salary = 20000;
    }

    void address(){
        address = "185/Ham Tu";
    }
    void showw(){
        System.out.println("Ten nhan vien: " +staName);
        System.out.println("Lương nhan vien: " +salary);
        System.out.println("Ten khach hang: " +cusName);
        System.out.println("Dia chi khach hang: " +address);
    }
}

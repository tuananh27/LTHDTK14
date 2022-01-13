package structured;


import java.util.Scanner;

public class BankStructured {
    static int account_number = 55425252;
    static int account_banlance = 0;
    static Scanner input; 
    public static void main(String[] args) {
        input = new Scanner(System.in);
        show();
        deposit();
        withdraw();
    }
    static void deposit(){
        System.out.print("Nhap so tien can gui ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
    }
    
    static void withdraw(){
        System.out.print("Nhap so tien can rut ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();  
    }
    
    static void show(){
        System.out.println("Thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_banlance);
    }
}

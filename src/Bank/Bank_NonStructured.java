package Bank;

import java.util.Scanner;

public class Bank_NonStructured {
    public static void main(String[] args) {
        //data
        //khai báo hai biến

        int account_number = 123457;
        int account_banlance = 0;

        // hành động thao tác lên data
        Scanner input; 
        input = new Scanner(System.in);

        //gửi tiền: deposit
        System.out.print("Nhap so tien can gui ");
        int  depositAmount = 0;
        depositAmount = input.nextInt();
        account_banlance += depositAmount;// thao tác lên data
        //account_banlance = account_banlance + depositAmount

        //hiện : show
        System.out.println("Thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_banlance);

        //rút tiền: withdraw
        System.out.print("Nhap so tien can rut ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount; //thao tác lên data
        // account_banlance = account_banlance - withdrawAmount

        // hiện:show
        System.out.println("Thong tin tai khoan");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_banlance);





    }
    
}

package SInhvienGDU;

import java.util.Scanner;

public class Sinhvien {
    String hoten;
    String gioitinh;
    float tuoi;
    String khoa;
    double diemTB;
    Scanner scanner = new Scanner(System.in);

    void nhap(){
        System.out.println("Ho Ten Sinh Vien");
        hoten = scanner.nextLine();
        System.out.println("Giới tính");
        gioitinh = scanner.nextLine();
        System.out.println("Tuoi");
        tuoi = scanner.nextFloat();
        System.out.println("Khoa");
        khoa = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Diem Trung Binh");
        diemTB = scanner.nextFloat();
    }
    
    void in(){
        System.out.println("Ten sinh vien: " +hoten);
        System.out.println("Gioi tinh: " +gioitinh);
        System.out.println("Tuoi: " +tuoi);
        System.out.println("Khoa dang hoc: " +khoa);
        System.out.println("Diem Trung Binh: " +diemTB);
    }
    
}

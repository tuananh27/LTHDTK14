package Buoi6;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sinhVien = new SinhVien(2004110029, "Tuan Anh", 7,8);
        SinhVien sinhVien2 = new SinhVien(2004110022, "Nguyen Van A" ,9,5);
        SinhVien sinhVien3 = new SinhVien();
        
        System.out.println("Nhap MSSV: ");
        int mssv = sc.nextInt();
        sinhVien3.setMssv(mssv);

        System.out.println("Nhap Ho va Ten: ");
        String hoTen = sc.nextLine();
        sinhVien3.setHoTen(hoTen);
        sc.nextLine();

        System.out.println("Nhap diem LT: ");
        float diemLT = sc.nextFloat();
        sinhVien3.setDiemLT(diemLT);

        System.out.println("Nhap diem TH: ");
        float diemTH =sc.nextFloat();
        sinhVien3.setDiemTH(diemTH);

        System.out.println(sinhVien.toString());
        System.out.println(sinhVien2.toString());
        System.out.println(sinhVien3.toString());
        


        
    }
}

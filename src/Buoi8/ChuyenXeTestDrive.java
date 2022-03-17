package Buoi8;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXeTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <ChuyenXeNgoaiThanh> ngoaiThanh = new ArrayList<>();
        ArrayList <ChuyenXeNoiThanh> noiThanh = new ArrayList<>();
        double doanhThuNgoaiThanh = 0;
        double doanhThuNoiThanh = 0;
        int soTuyenNgT, soTuyenNT;
        

        System.out.println("Nhap so xe ngoai thanh:");
        soTuyenNgT = sc.nextInt();
        for(int i = 0; i < soTuyenNgT; i++){
            System.out.println("Chuyen Xe Thu: " +(i+1));
            ChuyenXeNgoaiThanh chuyenxeNGT = new ChuyenXeNgoaiThanh();
            chuyenxeNGT.nhapXeNgoaiThanh();
            doanhThuNgoaiThanh += chuyenxeNGT.getDoanhThu();
            ngoaiThanh.add(chuyenxeNGT);
            System.out.println(chuyenxeNGT.toString());
        }

        System.out.println("Nhap so xe noi thanh: ");
        soTuyenNT = sc.nextInt();
        for (int i = 0; i < soTuyenNT; i++) {
            System.out.println("Chuyen Xe Thu: " +(i+1));
            ChuyenXeNoiThanh chuyenXeNT = new ChuyenXeNoiThanh();
            chuyenXeNT.nhapXeNoiThanh();
            doanhThuNoiThanh += chuyenXeNT.getDoanhThu();
            noiThanh.add(chuyenXeNT);
            System.out.println(chuyenXeNT.toString());
        }

        
        System.out.println();
        System.out.println("Tong Doanh Thu Tung Loai Xe: ");
        System.out.println("Doanh thu chuyen xe ngoai thanh: " +doanhThuNgoaiThanh);
        System.out.println("Doanh thu chuyen xe noi thanh: " +doanhThuNoiThanh);
    }
}

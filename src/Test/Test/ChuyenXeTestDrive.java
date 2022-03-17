package Test.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXeTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double doanhThuNoiThanh = 0, doanhthuNgoaiThanh = 0;
        int soXeNgT, soXeNT;
        ArrayList <ChuyenXeNgoaiThanh> chuyenXeNgT = new ArrayList<>();
        ArrayList<ChuyenXeNoiThanh> chuyenXeNT = new ArrayList<ChuyenXeNoiThanh>();

        System.out.println("Nhap So xe Ngoai Thanh: ");
        soXeNgT = sc.nextInt();
        System.out.println("Nhap So Xe Noi Thanh: ");
        soXeNT = sc.nextInt();

        System.out.println("Thong Tin Xe Noi Thanh");
        for(int i = 0; i < soXeNT; i++){
            System.out.println("Nhap So Xe Noi Thanh: " +(i+1));
            ChuyenXeNoiThanh chuyenxeNT = new ChuyenXeNoiThanh();
            chuyenxeNT.nhapXeNoiThanh();
            doanhThuNoiThanh += chuyenxeNT.getDoanhThu();
            chuyenXeNT.add(chuyenxeNT);
            System.out.println(chuyenxeNT.toString());
        }

        System.out.println("Thong Tin Xe Ngoai Thanh");
        for(int i = 0; i < soXeNgT; i++){
            System.out.println("Nhap So Xe Ngoai Thanh: " +(i+1));
            ChuyenXeNgoaiThanh chuyenxeNgT = new ChuyenXeNgoaiThanh();
            chuyenxeNgT.nhapXeNgoaiThanh();
            doanhthuNgoaiThanh += chuyenxeNgT.getDoanhThu();
            chuyenXeNgT.add(chuyenxeNgT);
            System.out.println(chuyenxeNgT.toString());
        }

        System.out.println("Tong Doanh Thu");
        System.out.println("Doanh Thu Xe Noi Thanh: " +doanhThuNoiThanh);
        System.out.println("Doanh Thu Xe Ngoai Thanh: " +doanhthuNgoaiThanh);


    }
}

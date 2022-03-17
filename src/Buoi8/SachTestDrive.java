package Buoi8;

import java.util.ArrayList;
import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SachGiaoKhoa> sachGiaoKhoa = new ArrayList<>();
        ArrayList<SachThamKhao> sachThamKhao = new ArrayList<>();
        double tongTienSachGiaoKhoa = 0, tongTienSachThamKhao = 0, tongDonGiaSachThamKhao = 0, trungBinhCongDonGia = 0;

        System.out.print("Nhap so sach giao khoa: ");
        int sGK = sc.nextInt();
        for(int i = 0; i < sGK; i++){
            System.out.println("Sach thu: "+(i+1));
            SachGiaoKhoa sgk = new SachGiaoKhoa();
            sgk.nhapLoaiSach();
            sachGiaoKhoa.add(sgk);
            tongTienSachGiaoKhoa += sachGiaoKhoa.get(i).getThanhTien();
            System.out.println(sgk.toString());
        }

        System.out.print("Nhap so sach tham khao: ");
        int stk = sc.nextInt();
        for(int i =0; i < stk; i++){
            System.out.println("Sach thu"+(i+1));
            SachThamKhao stK = new SachThamKhao();
            stK.nhapLoaiSach();
            sachThamKhao.add(stK);
            tongTienSachThamKhao += sachThamKhao.get(i).getThanhTien(); 
            tongDonGiaSachThamKhao += sachThamKhao.get(i).getDonGia();
            System.out.println(stK.toString());
        }

        trungBinhCongDonGia = tongDonGiaSachThamKhao/stk;
        System.out.println("Trung binh cong don gia sach tham khao: " +trungBinhCongDonGia);

        System.out.println("Tong tien sach giao khoa: " +tongTienSachGiaoKhoa);
        System.out.println("Tong tien sach tham khao: " +tongTienSachThamKhao);

    }
}

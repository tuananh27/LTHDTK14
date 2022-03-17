package Buoi8;

import java.util.Scanner;

public class SachGiaoKhoa extends LoaiSach {
    private String tinhTrang;
    private double thanhTien;
    Scanner sc = new Scanner(System.in);

    public String getTinhTrang() {
        return tinhTrang;
    }
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public double getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public SachGiaoKhoa(){}

    public SachGiaoKhoa(String tinhTrang, double thanhTien) {
        super.nhapLoaiSach();
        this.tinhTrang = tinhTrang;
        this.thanhTien = thanhTien;
    }

    public void tinhTrangSach(){
        super.nhapLoaiSach();
        System.out.println("Tinh Trang Cua Sach (cu/moi): ");
        tinhTrang = sc.nextLine();
        if(tinhTrang.equals("Cu")){
            thanhTien = getSoLuong() * getDonGia() * 0.5;
        }else if(tinhTrang.equals("Moi")){
            thanhTien = getSoLuong() * getDonGia();
        }
    }

    @Override
    public String toString() {
        return "SachGiaoKhoa [thanhTien=" + thanhTien + ", tinhTrang=" + tinhTrang  + " " + super.toString();
    }
   

    


   
   

    

    
    
}

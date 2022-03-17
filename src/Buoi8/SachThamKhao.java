package Buoi8;

import java.util.Scanner;

public class SachThamKhao extends LoaiSach {
    private double  thue;
    private double thanhTien;
    Scanner sc = new Scanner(System.in);
    public double getThue() {
        return thue;
    }
    public void setThue(double thue) {
        this.thue = thue;
    }
    public double getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

   public void nhapSach(){
       super.nhapLoaiSach();
        System.out.print("Nhập thuế: ");
        thue = sc.nextDouble();
   }
@Override
public String toString() {
    return "SachThamKhao [thanhTien=" + thanhTien + ", thue=" + thue + "]" + " " + super.toString() ;
}

   
   

    
   

    

    
}


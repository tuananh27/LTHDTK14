package Buoi8;

import java.util.Scanner;

public class ChuyenXe {
    private String hoTen;
    private int maSoChuyen, soXe;
    
    private double doanhThu;
    Scanner sc = new Scanner(System.in);

    public ChuyenXe(){}

    

    public ChuyenXe(String hoTen, int maSoChuyen, int soXe, double doanhThu) {
        this.hoTen = hoTen;
        this.maSoChuyen = maSoChuyen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }



    public int getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void nhapChuyenXe(){
        System.out.println("Ho Ten Tai Xe: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap Ma Chuyen Xe: ");
        maSoChuyen = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap So Xe: ");
        soXe = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap Doanh Thu: ");
        doanhThu =sc.nextDouble();
    }



    @Override
    public String toString() {
        return "ChuyenXe [doanhThu=" + doanhThu + ", hoTen=" + hoTen + ", maSoChuyen=" + maSoChuyen + ", soXe=" + soXe
                + "]";
    }

    

    

    
}

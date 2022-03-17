package Test.Test;

import java.util.Scanner;

public class ChuyenXe {
    private String hoTen, maSoChuyen;
    private int soXe;
    private double doanhThu;
    Scanner sc = new Scanner(System.in);

    public ChuyenXe(){}

    public ChuyenXe(String hoTen, String maSoChuyen, int soXe, double doanhThu) {
        this.hoTen = hoTen;
        this.maSoChuyen = maSoChuyen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void nhapChuyenXe(){
        System.out.println("Nhap Ho Ten Tai Xe: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap Ma So Chuyen Xe: ");
        maSoChuyen = sc.nextLine();
        System.out.println("Nhap So Xe: ");
        soXe = sc.nextInt();
        System.out.println("Nhap Doanh Thu:");
        doanhThu = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "ChuyenXe [doanhThu=" + doanhThu + ", hoTen=" + hoTen + ", maSoChuyen=" + maSoChuyen + ", soXe=" + soXe
                + "]";
    }

}

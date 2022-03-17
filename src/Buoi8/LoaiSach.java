package Buoi8;

import java.util.Scanner;

public class LoaiSach {
    private int maSach;
    private double donGia;
    private int soLuong;
    private String nhaXB;
    Scanner sc = new Scanner(System.in);

    public int getMaSach() {
        return maSach;
    }
    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String getNhaXB() {
        return nhaXB;
    }
    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public LoaiSach(){}

    public LoaiSach(int maSach, double donGia, int soLuong, String nhaXB) {
        this.maSach = maSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXB = nhaXB;
    }

    public void nhapLoaiSach(){
        System.out.println("Nhap Ma Sach: ");
        maSach = sc.nextInt();
        System.out.println("Nhap Don Gia: ");
        donGia = sc.nextDouble();
        System.out.println("Nhap So Luong: ");
        soLuong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nha Xuat Ban: ");
        nhaXB = sc.nextLine();
    }

    @Override
    public String toString() {
        return "LoaiSach [donGia=" + donGia + ", maSach=" + maSach + ", nhaXB=" + nhaXB + ", soLuong=" + soLuong + "]";
    }

    

    

    
}

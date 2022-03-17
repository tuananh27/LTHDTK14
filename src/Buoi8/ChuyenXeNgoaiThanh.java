package Buoi8;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private double soNgayDi;
    Scanner sc = new Scanner(System.in);

    public ChuyenXeNgoaiThanh(){}

    public ChuyenXeNgoaiThanh(String noiDen, double soNgayDi, Scanner sc) {
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
        this.sc = sc;
    }
    public String getNoiDen() {
        return noiDen;
    }
    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    public double getSoNgayDi() {
        return soNgayDi;
    }
    public void setSoNgayDi(double soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    public void nhapXeNgoaiThanh(){
        super.nhapChuyenXe();
        sc.nextLine();
        System.out.println("Noi den: ");
        noiDen = sc.nextLine();
        System.out.println("So ngay di: ");
        soNgayDi = sc.nextDouble();
        
    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh [noiDen=" + noiDen + ", soNgayDi=" + soNgayDi + "]" + " " + super.toString() +"]";
    }

   

    

    
}

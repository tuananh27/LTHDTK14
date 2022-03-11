package Buoi8;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKM;
    Scanner sc = new Scanner(System.in);
    
   
    public ChuyenXeNoiThanh() {
        
    }
    
    public ChuyenXeNoiThanh(int soTuyen, double soKM) {
        super();
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    public int getSoTuyen() {
        return soTuyen;
    }
    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }
    public double getSoKM() {
        return soKM;
    }
    public void setSoKM(double soKM) {
        this.soKM = soKM;
    }

    public void nhapXeNoiThanh(){
        super.nhapChuyenXe(); //goi ham nhap thong tin cua lop congtydulich
        System.out.println("So tuyen xe: ");
        soTuyen = sc.nextInt();
        System.out.println("So KM");
        soKM = sc.nextDouble();  
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh [soKM=" + soKM + ", soTuyen=" + soTuyen + "]" + " " + super.toString();
    }

    

    
    
    

    



}

package Test.Test;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen, soKM;
    Scanner sc = new Scanner(System.in);

    public ChuyenXeNoiThanh(){}

    public ChuyenXeNoiThanh(int soTuyen, int soKM) {
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }

    public void nhapXeNoiThanh(){
        super.nhapChuyenXe();
        System.out.println("So Tuyen: ");
        soTuyen = sc.nextInt();
        System.out.println("So Km Di Duoc: ");
        soKM = sc.nextInt();
        
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh [soKM=" + soKM + ", soTuyen=" + soTuyen + "]" + " " + super.toString();
    }

    

    
    
}

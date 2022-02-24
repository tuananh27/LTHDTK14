package Buoi6;

public class SinhVien {
    private int mssv;
    private String hoTen;
    private float diemLT, diemTH;

    public SinhVien(){}

    public SinhVien(int mssv, String hoTen, float diemLT, float diemTH) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMssv() {
        return mssv;
    }
    public void setMssv(int mssv) {
        this.mssv = mssv;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public float getDiemLT() {
        return diemLT;
    }
    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }
    public float getDiemTH() {
        return diemTH;
    }
    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float diemTrungBinh(){
        return (this.diemLT + this.diemTH) / 2;
    }

    public String toString(){
        String string ="Ma so sinh vien: " +this.mssv + " Ho ten: " +this.hoTen + " Diem LT: " +this.diemLT +" Diem TH: " +this.diemTH + " Diem TB: " +this.diemTrungBinh();

        return string;
    }

    
}

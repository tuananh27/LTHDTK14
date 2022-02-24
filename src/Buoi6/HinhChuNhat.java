package Buoi6;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;


    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public double tinhDienTich(){
        return this.chieuDai * this.chieuRong;
    }
    public double tinhChuVi(){
        return (this.chieuDai + this.chieuRong) * 2;
    }
    public String toString(){
        String string = "Chieu dai: " + this.chieuDai + " chieu rong: "  + this.chieuRong;
        string += " Chu vi: " + this.tinhChuVi() + " dien tich: " + this.tinhDienTich();
        return string;
    }


}

package Buoi8;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngayHetHan;
    private Date ngaySX;


   public void setNgaySX(Date ngaySX) {
       if(ngaySX != null){

       }
       this.ngaySX = ngaySX;
   }

    public void setNgayHetHan(Date ngayHetHan) {
        if(ngayHetHan != null ){
            if(ngayHetHan.after(this.ngaySX)){
                this.ngayHetHan = ngayHetHan;
            }else{
                System.out.println("Ngay het han phai sau ngay san xuat");
                this.ngayHetHan = new Date();//ngay hien tai
            }
        }else{
            System.out.println("Ngay het han khong duoc de rong");
            this.ngayHetHan = new Date();//ngay hien tai
            
        } 
    }
    

   public void setDonGia(double donGia) {
    if(donGia > 0){
        this.donGia = donGia;
    }else{
        System.out.println("DOn gia >0 ");
    }
       
   }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if(tenHang != null ){
            this.tenHang = tenHang;
        }else{
            System.out.println("Ten hang khong de rong");
            this.tenHang = "XXXXXXX";
        }
    }

    private void setMaHang(String maHang) {
        if(maHang != null){
            this.maHang = maHang;
        }else{ 
            System.out.println("Ma hang khong duoc rong");
            this.maHang = "Default";
        }
    }

    public String getMaHang(){
        return maHang;
    }

   

    //public HangThucPham(){}

    @Override
    public String toString() {

        //dd/MM/yyyy : 10/03/2022

        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");

        Locale localeVn = new Locale("vi", "VN");
        NumberFormat tienVietNam = NumberFormat.getCurrencyInstance(localeVn);


        return "HangThucPham [donGia=" + tienVietNam.format(donGia) + ", maHang=" + maHang + ", ngayHetHan=" + ngayVietNam.format(ngayHetHan) + ", ngaySX="
                + ngayVietNam.format(ngaySX) + ", tenHang=" + tenHang + "]";
    }

    public HangThucPham(String maHang){
        this.setMaHang(maHang);
    }

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngayHetHan, Date ngaySX) {
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgaySX(ngaySX);
        this.setNgayHetHan(ngayHetHan);    
    }
    public boolean kiemTraHSD(){
        boolean isHetHan = false; //con han

        if(this.ngayHetHan.before(new Date())){
            isHetHan = true;
        }

        return isHetHan;
    }




    
    
    

    
}

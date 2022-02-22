package lap4;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private Double donGia;
    private Double giamGia;
    Scanner a = new Scanner(System.in);

    public String getTenSanPham(){
        return tenSP;
    }
    public void setTenSanPham(String tenSP){
        this.tenSP = tenSP;
    }
    public double getDonGia(){
        return donGia;
    }
    public void setDonGia(double donGia){
        this.donGia = donGia;
    } 
    public double getGiamGia(){
        return giamGia;
    }
    public void setgiamGia(double giamGia){
        this.giamGia = giamGia; 
    }
    public SanPham(){

    }
    public SanPham(String tenSP, double donGia, double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPham(String tenSP, double donGia){
        this(tenSP, donGia, 0);
    }

    private Double getThueNhapKhau(){
        return 0.1*donGia;
    }

    void nhap(){
        System.out.print("Nhap ten san pham: ");
        tenSP = a.nextLine();
        System.out.print("Nhap gia san pham: ");
        donGia = a.nextDouble();
        a.nextLine();
        giamGia = 0.2*donGia;
        System.out.println("Giam gia: " +giamGia);
        
    }

    public void xuat(){
        System.out.println("Ten san pham: " +tenSP);
        System.out.println("Gia: " +donGia);
        System.out.println("Giam gia: " +giamGia);
        System.out.println("Thue nhap khau: " +getThueNhapKhau());
     }
   
    
    
}

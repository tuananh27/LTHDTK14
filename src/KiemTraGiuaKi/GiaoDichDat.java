package KiemTraGiuaKi;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    private int chon;

    public GiaoDichDat(){}

    public GiaoDichDat(String loaiDat){
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    public void nhapGiaoDD(){
        super.nhap();
        System.out.print("Nhap loai dat (A/B/C): ");
        loaiDat = sc.nextLine();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "GiaoDichDat [chon=" + chon + ", loaiDat=" + loaiDat + "]";
    }

    
    
    
}

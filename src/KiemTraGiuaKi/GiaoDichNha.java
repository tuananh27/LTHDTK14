package KiemTraGiuaKi;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha, diaChi;
    private int luaChon;

    public GiaoDichNha(){}

    public GiaoDichNha(String loaiNha,String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getLuaChon() {
        return luaChon;
    }

    public void setLuaChon(int luaChon) {
        this.luaChon = luaChon;
    }

    public void nhapGiaoDN(){
        super.nhap();
        System.out.print("Nhap Dia Chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap Loai Nha (0: cao cap, 1: thuong): ");
        luaChon = sc.nextInt();
        switch (luaChon) {
            case 0:
                loaiNha = "cao cap";
                break;
            case 1: 
                loaiNha = "thuong";
                break;
            default:
                System.out.println("Chon khong dung vui long chon lai.");
                break;
        }
    }

    @Override
    public String toString() {
        return "GiaoDichNha [diaChi=" + diaChi + ", loaiNha=" + loaiNha + "]";
    }

  

   

    
}

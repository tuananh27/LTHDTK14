package Test.Test;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDi;

    public ChuyenXeNgoaiThanh(){}

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDi) {
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    public void nhapXeNgoaiThanh(){
        super.nhapChuyenXe();
        System.out.println("Nhap Noi Den: ");
        noiDen = sc.nextLine();
        System.out.println("Nhap So Ngay Di: ");
        soNgayDi = sc.nextInt();
    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh [noiDen=" + noiDen + ", soNgayDi=" + soNgayDi + "]" + " " + super.toString();
    }
    
}

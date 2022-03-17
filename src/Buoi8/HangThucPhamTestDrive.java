package Buoi8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPhamTestDrive {
    public static void main(String[] args) throws ParseException {
       // HangThucPham htp = new HangThucPham();
        //System.out.println(htp);
        //khong chinh sua 
        // co quyen truy cap
        //System.out.println(htp);
        //System.out.println("MH" +htp.getMaHang());

        //HangThucPham htp2 = new HangThucPham(null);
        //System.out.println(htp2);

        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySX = "01/03/2022";
        String ngayHetHan = "08/03/2022";

        HangThucPham htp3 = new HangThucPham("TP04", "Mi hao hao", 3500, ngayVietNam.parse(ngayHetHan), ngayVietNam.parse(ngaySX));
        System.out.println(htp3);

        if(htp3.kiemTraHSD()){
            System.out.println("Het han roi dung an");
        }else{
            System.out.println("Con han su dung an di");
        }



    }
    
}

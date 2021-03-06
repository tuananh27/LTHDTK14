package Buoi10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Buoi8.HangThucPham;
// cách tạo lưu file
public class WritingObject {
    public static void main(String[] args) throws IOException {
        //Bước 1
        FileOutputStream outFile = new FileOutputStream("data.dat");

        //Bước 2
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);

        //Hàng Thực Phẩm
        HangThucPham htp = new HangThucPham("HTP01", "Mi Hao Hao", 3_500, new Date(), new Date());

        HangThucPham htp2 = new HangThucPham("HTP02", "Mi Gau Do", 4_000, new Date(), new Date());

        //code với abstract
        List<HangThucPham> list = new ArrayList<>();
        list.add(htp);
        list.add(htp2);

        //Bước 3
        objOut.writeObject(list);
        objOut.writeObject(htp);
        objOut.writeObject(htp2);

        System.out.println(htp);

        //Bước 4

        objOut.close();



    }
}

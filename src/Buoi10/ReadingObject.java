package Buoi10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import Buoi8.HangThucPham;

//cách đọc file đã lưu
public class ReadingObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Bước 1
        FileInputStream inFile = new FileInputStream("data.dat");
        
        //Bước 2
        ObjectInputStream objIn = new ObjectInputStream(inFile);

        //Bước 3 reading object stream
        HangThucPham htp = (HangThucPham)objIn.readObject();
        HangThucPham htp2 = (HangThucPham)objIn.readObject();
    
        List<HangThucPham> list = (List) objIn.readObject();

        for (HangThucPham hangThucPham : list) {
           if(hangThucPham.getTenHang().trim().equalsIgnoreCase("Mi Gau Do"))
                System.out.println(hangThucPham);
        }

        System.out.println(htp);
        System.out.println(htp2);

        objIn.close();

    }
}

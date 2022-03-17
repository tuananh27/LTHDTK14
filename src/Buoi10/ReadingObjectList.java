package Buoi10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import Buoi8.HangThucPham;

public class ReadingObjectList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Bước 1
        FileInputStream inFile = new FileInputStream("data.dat");
        
        //Bước 2
        ObjectInputStream objIn = new ObjectInputStream(inFile);

        //Bước 3 reading object stream
        
        List<HangThucPham> list = (List) objIn.readObject();

        for (HangThucPham hangThucPham : list) {
           if(hangThucPham.getTenHang().trim().equalsIgnoreCase("Mi Gau Do"))
                System.out.println(hangThucPham);
        }
        
        objIn.close();

    }
}

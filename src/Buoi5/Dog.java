package Buoi5;

public class Dog {
    //attribute -data - field
    private int size; //implementation
    /**default - mặc định*/String name;
    /**default*/String breed;

    //method
    //interfaces
    public void setSize(int size){
        //viết code ràng buộc cho size không âm
        if(size > 0){
        this.size = size;
        }else{
            System.out.println("Size khong hop le!!!");
        }

    }

    //interfaces
    public int getSize(){
        return this.size;
    }



}

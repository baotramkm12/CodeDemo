package main;

import inheritance.Shape;

public class TransmittingValueToTheMethod {
    public static void main(String[] args) {

        //demo override
        String format = "Color value after change: %d \n";

        int color = 25;
        //Kieu du lieu nguyen thuy
        //Kieu du lieu khong the thay doi sau khi khoi tao
        //Ham thuc thi ket thuc, su thay doi se khong anh xa vao bien
        changeValueColor(color);
        System.out.printf(format,color);//25

        //Truyen theo tham chieu, nhung thay se dien ra lien tuc
        //ham thuc thi ket thuc, ket qua se anh xa vao doi so duoc
        //truyen vao
        Shape shape = new Shape();
        changeValueColor(shape);
        System.out.printf(format,shape.getColor());//35
    }


    public static void changeValueColor(int color){
        color = 16;
    }

    public static void changeValueColor(Shape shape){
        shape.setColor(35);
    }
}

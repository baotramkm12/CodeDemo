package main;

import inheritance.Circle;
import inheritance.Shape;
import inheritance.Triangle;

public class DemoInheritance {
    public static void main(String[] args) {
        //Upcasting : Khai bao mot bien co kieu la class cha tro den doi tuong cua class con
        Shape circle = new Circle();
        //Downcasting : Khai bao mot bien co kieu la class con tro den doi tuong class cha
//        Circle circle1 = circle; // khai bao nhu nay la se bi loi
        Circle circle1 = (Circle) circle; // ep kieu tuong minh co the chap nhap
//        Circle circle2 = (Triangle) circle; // nhung doan code nay se quang loi, do circle khong phai la mot doi tuong cua Triangle
        draw(circle);
    }

    public static void draw(Shape shape){
        // instanceof la toan tu dung de kiem tra kieu du lieu cua doi tuong
        // giup viec ep kieu tro nen an toan hon
        if (shape instanceof Triangle){
            Triangle triangle = (Triangle) shape;
            triangle.drawTriangle();
        }
    }
}

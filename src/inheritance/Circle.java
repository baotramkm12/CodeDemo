package inheritance;

public class Circle extends Shape {
    protected int color = 20;

    //bien final instance thi khong the thay doi gia tri sau khi gan,
    //no chi duoc gan gia tri tai thoi diem khai bao, hoac ben trong ham tao
    protected final int radius;
    protected final String name = "Circle";

    //khai bao hang so
    //ten hang so phai viet hoa vd: PHONE_NUMBER
    public static final float PI = 3.14f;

    public Circle(int radius, int color){
        this.radius = radius;
        this.color = color;
    }
    public Circle(){
        radius = 0;
    }

    public Circle(int radius){
        //khi goi tuong minh den ham tao cua class cha
        //thi super phai la loi goi dau tien
        super(30);
        this.radius = radius;
        System.out.println("Day la ham tao cua circle");
    }


    @Override
    public void printColorValue() {
        // co muon su dung lai dinh nghia printColorValue cua Shape(cha cua Circle)
        System.out.println("Day la phuong thuc in mau cua circle");
        super.printColorValue();
        final int maxColor = 15;

    }

    //Nap chong (overriding)
    //Ban co the dinh nghia nhieu phuong thu co cung ten
    //nhung phai khac danh sach tham so truyen vao,
    //hoac kieu tham so truyen vao phai khac nhau

    public void draw(){

    }

    public void draw(int color){

    }

    public void draw(float color){

    }

    public void draw(int radius, int color){

    }

}

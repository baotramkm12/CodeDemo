package inheritance;

public class Shape {
    int color;
    public Shape(){
        System.out.println("Day la ham tao cua shape");
    }

    public Shape(int color){
        System.out.println("Day la ham tao co tham so");
        this.color = color;
    }

    //cac phuong thuc khai bao la final se khong the ghi de
    protected final int calculateArea(){
        return 1;
    }

    public void printColorValue(){
        System.out.printf("Color value: %d", color);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}

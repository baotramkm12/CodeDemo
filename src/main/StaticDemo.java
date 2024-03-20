package main;

import staticdemo.Classroom;

import static staticdemo.Classroom.INDEX_CLASS;

public class StaticDemo {
    public static void main(String[] args) {
        //truy xuat den bien static cua Classroom thong qua ten class
        System.out.printf("Ten lop hoc la: %s\n", Classroom.collegeName);

        //truy xuat den bien static cua Classroom thong qua import static
        System.out.printf("Thu tu cua lop hoc la: %s\n", INDEX_CLASS);

        //moi doi tuong classroom duoc tao ra deu co bien numerOfError, className cua rieng no
        //luu tru tung gia tri cu the
        Classroom classroom1 = new Classroom("JV231130");
        Classroom classroom2 = new Classroom("JV240330");
        String mistakeFormat = "So lan pham loi cua lop %s la: %d\n";
        System.out.printf(mistakeFormat, classroom1.getClassName(), classroom1.makeMistake());
        System.out.printf(mistakeFormat, classroom1.getClassName(), classroom1.makeMistake());
        System.out.printf(mistakeFormat, classroom1.getClassName(), classroom1.makeMistake());
        System.out.printf(mistakeFormat, classroom2.getClassName(), classroom2.makeMistake());

        //Bien static chi co mot ban sao duy nhat trong bo nho,
        //moi loi goi, deu anh xa su thay doi len bien do
        Classroom.addStudent(); //numberOfStudent = 1
        Classroom.addStudent(); //numberOfStudent = 2
        Classroom.addStudent(); //numberOfStudent = 3
        System.out.printf("So luong hoc sinh cua lop la %d\n", Classroom.getNumberOfStudent());


        //Cach khoi tao mot doi tuong tu static inner class
        //ParentClassContainIt.InnerClass variableName = new ParentClassContainIt.InnerClass(danh_sach_doi_so_can_truyen_vao_neu_co);
        Classroom.Subject subject = new Classroom.Subject();

        //Cach khoi tao mot doi tuong tu inner class
        //Dau tien phai khoi tao doi duong cua class chua no
        //ContainerClass containerVariableName = new ContainerClass(danh_sach_doi_so_can_truyen_vao_neu_co);
        //khai bao inner class : ContainerClass.InnerClass =  containerVariableName.new InnerClass(danh_sach_doi_so_can_truyen_vao_neu_co);
        Classroom classroom = new Classroom();
        Classroom.Tool tool = classroom.new Tool();



    }

}

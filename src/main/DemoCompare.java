package main;

import student.Student;
import student.StudentHasComp;

import java.util.Arrays;
import java.util.Comparator;

public class DemoCompare {

    public static void main(String[] args) {
        byte length = 11;
        Student[] students = new Student[length];
        students[0] = new Student("Nguyen Van A", 8.5f);
        students[1] = new Student("Nguyen Van b", 1.7f);
        students[2] = new Student("Nguyen Van c", 10f);
        students[3] = new Student("Nguyen Van d", 3.8f);
        students[4] = new Student("Nguyen Van A", 6.9f);
        students[5] = new Student("Nguyen Van g", 4.7f);
        students[6] = new Student("Nguyen Van f", 9.5f);
        students[7] = new Student("Nguyen Van h", 6.6f);
        students[8] = new Student("Nguyen Van h", 10.1f);
        students[9] = new Student("Nguyen Van h", 10.2f);
        students[10] = new Student("Nguyen Van h", 10.3f);

        //ap dung giai thuat de sap xep

        Student temp;
        boolean isSwaped;
        for (int i = 0; i < length ; i++){
            isSwaped = false;
            for (int j = 0; j < length -1; j++){
                if(students[j].getMark() > students[j + 1].getMark()){
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    isSwaped = true;
                }
            }
            if(!isSwaped){
                System.out.printf("Vong lap ngat tai vi tri thu %d\n", i);
                break;
            }
        }
        System.out.println(Arrays.toString(students));

        //su dung Comparator interface de ho tro so sanh cac doi tuong khong
        //trien khai interface Comparable

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                float mark1 = o1.getMark();
                float mark2 = o2.getMark();
                if( mark1 == mark2){
                    return 0;
                }else if(mark1 < mark2){
                    return -1;
                }
                return 1;
            }
        });
    }
}

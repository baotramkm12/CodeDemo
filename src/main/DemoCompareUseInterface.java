package main;

import student.Student;
import student.StudentHasComp;

import java.util.Arrays;
import java.util.Comparator;

public class DemoCompareUseInterface {

    public static void main(String[] args) {
        byte length = 11;
        StudentHasComp[] students = new StudentHasComp[length];
        students[0] = new StudentHasComp("Nguyen Van A", 8.5f);
        students[1] = new StudentHasComp("Nguyen Van b", 1.7f);
        students[2] = new StudentHasComp("Nguyen Van c", 10f);
        students[3] = new StudentHasComp("Nguyen Van d", 3.8f);
        students[4] = new StudentHasComp("Nguyen Van A", 6.9f);
        students[5] = new StudentHasComp("Nguyen Van g", 4.7f);
        students[6] = new StudentHasComp("Nguyen Van f", 9.5f);
        students[7] = new StudentHasComp("Nguyen Van h", 6.6f);
        students[8] = new StudentHasComp("Nguyen Van h", 10.1f);
        students[9] = new StudentHasComp("Nguyen Van h", 10.2f);
        students[10] = new StudentHasComp("Nguyen Van h", 10.3f);

        //sort tren cac doi tuong trien khai interface Comparable
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}

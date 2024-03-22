package student;

import human.h_interface.ISing;
import human.h_interface.ISinger;

public class Student implements ISing, ISinger {
    private String name;
    private float mark;

    public Student(){}

    public Student(String name, float mark) {
        this.name = name;
        this.mark = mark;
    }

    public float getMark() {
        return mark;
    }

    @Override
    public void sing() {

    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Mark : %f\n", name, mark);
    }
}

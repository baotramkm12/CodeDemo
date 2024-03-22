package student;

public class StudentHasComp implements Comparable{
    private String name;
    private float mark;

    public StudentHasComp(){}

    public StudentHasComp(String name, float mark) {
        this.name = name;
        this.mark = mark;
    }

    public float getMark() {
        return mark;
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

    @Override
    public int compareTo(Object objectSt) {
        if(!(objectSt instanceof StudentHasComp)){
            return -1;
        }
        float marKNeedCompare = ((StudentHasComp) objectSt).getMark();
//        if(marKNeedCompare == mark){
//            return 0;
//        }else if(mark < marKNeedCompare){
//            return -1;
//        }
//        return 1;
        return mark > marKNeedCompare ? -1 : (mark == marKNeedCompare ? 0 : 1);
    }
}

package human.h_interface;

public interface ISing {

    int score = 0;
    void sing(); // public abstract void sing()

    //khai bao phuong thuc
    //access_modifier return_type methodName(list_param)

    interface ISubSing{

    }

    default void makeUp(){
        System.out.println("Trang diem mat");
    }

    static int getScore(){
        return score;
    }

    private static String getNameSong(){
        return "Hihi";
    }

    private float getAvgScore(){
        return score;
    }



    //tu java 8 co the dinh nghia phuong thuc co than ham, va phuong thuc static ben trong interface

    // tu Java 9 tro di thi co the co phuong thuc private


}

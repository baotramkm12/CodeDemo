package staticdemo;

public class Classroom {

    //bien static la cac bien thuoc quan ly cua lop
    //chi cap phat bo nho mot lan duy nhat, khi
    //lop duoc tai vao bo nho, duoc khai bao voi tu
    //khoa static
    private int numerOfError = 0;

    private static int numberOfStudent;


    public String className;
    // khai bao hang so
    // access_modifier static final dataType variableName = value;
    public static final int INDEX_CLASS = 1;
    public static String collegeName = "Rikkei";

    //khoi code binh thuong se duoc copy vao ben trong
    //ham tao, sau loi goi super (super duoc goi mac dinh,
    // no la dong lenh dau tien trong ham tao), moi lan
    //co lenh khoi tao doi tuong
    {
        System.out.println("Toi la khoi code binh thuong");
        System.out.println("Hihi toi se khoi tao gia tri cho mang student");
    }


    //thu tu xuat hien ben trong ham tao, chinh la thu tu
    // ban khai bao no
    //
    {
        System.out.println("Toi la khoi code thu hai");
    }

    //Khoi static chi chay mot lan duy nhat, tai thoi diem
    //lop duoc tai vao ben trong bo nho, de thuc thi
    static {
        System.out.println("----------------Day la bat dau cua khoi static-----------------------");
        System.out.println("Toi la khoi code static");
        System.out.println("----------------Day la ket thuc cua khoi static-----------------------");
    }

    public Classroom(){
        System.out.println(LINE_START);
        System.out.println("Toi la ben trong ham tao");
        System.out.println(LINE_END);
    }
    private static final String LINE_START = "--------------bat dau ham tao, toi chay sau loi goi super ngam dinh----------------";
    private static final String LINE_END = "--------------ket thuc ham tao----------------";

    public Classroom(String className){
        System.out.println(LINE_START);
        this.className = className;
        System.out.println(LINE_END);
    }

    public int makeMistake(){
        return ++numerOfError;
    }

    public String getClassName() {
        return className;
    }

    public void printClassName(){
        System.out.println(String.format("Ten lop la %s", className));
    }

    public static void addStudent(){
        //toan tu ++ hoac --
        //dat truoc ten bien : tang(++) hoac giam(--) gia tri cho bien roi moi thuc thi cong viec kha
        //dat sau ten bien: thuc thi cong viec truoc roi moi tang(++) hoac giam(--) gia tri cho bien
        ++numberOfStudent;
    }

    public static int getNumberOfStudent() {
        return numberOfStudent;
    }

    public class Tool{
        private int numberOfTable;

        public int getNumberOfTable() {
            return numberOfTable;
        }

        public void setNumberOfTable(int numberOfTable) {
            this.numberOfTable = numberOfTable;
        }
    }

    public static class Subject{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

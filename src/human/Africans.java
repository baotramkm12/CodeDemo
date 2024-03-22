package human;

public class Africans extends Person{

    public Africans(){}
    public Africans(String name, short age, String address) {
        super(name, age, address);
    }

    @Override
    public String speak() {
        return "Toi noi tieng chau phi";
    }

    @Override
    public String eat(String foodName) {
        return null;
    }
}

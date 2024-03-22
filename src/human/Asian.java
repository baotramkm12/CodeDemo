package human;

public class Asian extends Person{

    public Asian(){}

    public Asian(String name, short age, String address) {
        super(name, age, address);
    }

    @Override
    public String speak() {
        return "Toi noi Chau A";
    }

    @Override
    public String eat(String foodName) {
        return null;
    }
}

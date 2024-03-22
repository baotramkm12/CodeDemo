package human;

import human.h_interface.ISing;

public class European extends Person implements ISing {

    public European(){}

    public European(String name, short age, String address) {
        super(name, age, address);
    }

    @Override
    public String speak() {
        return "Toi noi tieng chau Au";
    }

    @Override
    public String eat(String foodName) {
        return null;
    }

    @Override
    public void sing() {

    }
}

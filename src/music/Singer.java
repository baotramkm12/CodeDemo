package music;

import human.h_interface.ISing;

public class Singer implements ISing.ISubSing {

    private String id;
    private String name;

    public Singer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getNameSinger(){
        return "Hihi";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}

package music;

import java.io.Serializable;

public class Song implements Serializable {

    private Singer singer;

    public Singer getSinger() {
        return singer;
    }

    public String getNameSinger(){
        return "Hihi";
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public void  printInfo(){
        System.out.printf("Name singer : %s\n", getSinger().getName());
    }

}

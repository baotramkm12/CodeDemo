package main;

import human.Africans;
import human.Asian;
import human.European;
import human.Person;
import human.h_interface.ISing;
import music.Singer;
import music.Song;

public class Main {
    public static void main(String[] args) {
        Person asian = new Asian(); // no tao ra 1 doi tuong luu tru tai 1 vi tri bo nho gia su la 0xff
        Asian asian1 = new Asian();

//        Geometric square = new Geometric();
        Person person; // person = null
        person = new Africans(); // person luu tru vi tri bo nho cua Africans vua tao
        person = asian; // person va asian cung tro toi 1 vi tri bo nho la 0xff
        ISing singer = new European();

        Song song = new Song();
        song.setSinger(new Singer("S001", "Nguyen Van A"));
        song.printInfo();

    }
}

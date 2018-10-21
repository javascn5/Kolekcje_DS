package com.sda.kolekcje;
// listy sa generyczne, moga byc dowolnego typu

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> meskieStringi = new ArrayList<>();
        meskieStringi.add("Wiesław");
        meskieStringi.add("Szczepan");
        meskieStringi.add("Zenon");
        meskieStringi.add("Mścibór");
        System.out.println("Rozmiar: " + meskieStringi.size() /* XDDD */);
        System.out.println(meskieStringi);
        for (String s : meskieStringi
        ) {
            System.out.println("Imię: " + s);
        }
        meskieStringi.add("Waldeczek");
        meskieStringi.add("Eugeniusz");
        meskieStringi.add("Ignacy");
        meskieStringi.remove("Wiesław");
        meskieStringi.remove(0);
        System.out.println(meskieStringi);
        String imie = meskieStringi.get(2);
        System.out.println("Element o indeksie 2: " + imie);
        meskieStringi.clear();
        System.out.println(meskieStringi);
        try {
            imie = meskieStringi.get(23);
            System.out.println("Element o indeksie 23: " + imie);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Zbyt duzy indeks panie Łoś");
//            e.printStackTrace();
        }
        User pan1 = new User("Zenon", "Swietlik", 107);
        User pan2 = new User("Zenonik", "Swietliczek", 17);
        User pan3 = new User("Zenonek", "Swietlikowski", 7);
        List<User> zenony = new ArrayList<>();
        zenony.add(pan1);
        zenony.add(pan2);
        zenony.add(pan3);
        for (User user : zenony) {
            System.out.printf("Ime: %s Nazwisko: %s Wiek: %d\n", user.getName(),user.getLastname(),user.getAge());
        }
    }
}

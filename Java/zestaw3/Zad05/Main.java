package Zad05;

import Zad04.Pracownik;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Pracownik[] pracownicy = GenerateEmployees(100);

        for (Pracownik p : pracownicy)
            System.out.println(p.toString());

    }

    //


    public static Pracownik[] GenerateEmployees(int size) {
        Pracownik[] array = new Pracownik[size];

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = new Pracownik();
            array[i].setImie(Name.getRandomName());
            array[i].setNazwisko(GenerateLastName());
            array[i].setStanowisko(Position.getRandomPosition());
            array[i].setStazPracy(rand.nextInt(26));
        }

        return array;
    }

    private static String GenerateLastName() {
        String lastName = "";
        Random rand = new Random();
        int length = rand.nextInt(13) + 3;

        for (int i = 0; i < length; i++)
            lastName += (char) (97 + rand.nextInt(26));

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        return lastName;
    }

    private enum Name {
        Jan,
        Katarzyna,
        Agata,
        Andrzej;

        public static String getRandomName() {
            Random rand = new Random();
            return values()[rand.nextInt(values().length)].name();
        }
    }

    private enum Position {
        MlodszySpecjalista ("mlodszy specjalista"),
        StarszySpecjalista ("staryszy specjalista"),
        Ksiegowy ("Ksiegowy"),
        Menager ("Menager"),
        Kierownnik ("Kierownik");

        private String position;
        private Position(String position) {
            this.position = position;
        }

        public static String getRandomPosition() {
            Random rand = new Random();
            return values()[rand.nextInt(values().length)].position;
        }
    }

}

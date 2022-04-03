package Zad04;

public class Main {

    public static void main(String[] args) {
        Pracownik p = new Pracownik();
        System.out.println(p.getStazPracy());
        p.ZwiekszStaz();
        System.out.println(p.getStazPracy());

        System.out.println(p.getPensja());
        p.ZwiekszPensja(.5);
        System.out.println(p.getPensja());
    }

}

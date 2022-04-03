package Zad03;

import Zad02.Lancuch;

public class Main {

    public static void main(String[] args) {
        ExtendedLancuch extendedLancuch = new ExtendedLancuch("a");
        Lancuch lancuch = new Lancuch("g");
        extendedLancuch.Merge(lancuch);
        System.out.println(extendedLancuch.getLancuch());
    }

}

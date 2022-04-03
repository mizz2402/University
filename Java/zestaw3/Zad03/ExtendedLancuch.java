package Zad03;

import Zad02.Lancuch;

public class ExtendedLancuch extends Lancuch {

    public ExtendedLancuch(String lancuch) {
        super(lancuch);
    }

    public void Merge (Lancuch lancuch) {
        String newString = "";
        if (this.getLancuch().length() == lancuch.getLancuch().length())
            for (int i = 0; i < this.getLancuch().length(); i++) {
                newString += this.getLancuch().charAt(i);
                newString += lancuch.getLancuch().charAt(i);
            }
        setLancuch(newString);
    }

}

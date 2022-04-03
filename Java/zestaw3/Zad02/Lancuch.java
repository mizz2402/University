package Zad02;

public class Lancuch {

    private final static  int minLength = 5;
    private String lancuch, koncowka;
    private char pierwszaLitera;

    // constructors
    public Lancuch() {
        lancuch = "abcdefghij";
        setKoncowka();
        pierwszaLitera = lancuch.charAt(0);
    }

    public Lancuch(String lancuch) {
        this.lancuch = lancuch;
        ExtendLancuch();
        setKoncowka();
        pierwszaLitera = lancuch.charAt(0);
    }

    // getters
    public String getLancuch() {
        return lancuch;
    }

    public String getKoncowka() {
        return koncowka;
    }

    public char getPierwszaLitera() {
        return pierwszaLitera;
    }

    private void setKoncowka() {
        koncowka = "";
        for (int i = 3; i > 0; i--)
            koncowka += lancuch.charAt(lancuch.length() - i);
    }

    public void setLancuch(String lancuch) {
        this.lancuch = lancuch;
        setKoncowka();
    }

    private void ExtendLancuch() {
        while (lancuch.length() < minLength) {
            int c = lancuch.charAt(lancuch.length() - 1) + 1;
            if (c > 122)
                c -= 26;
            this.lancuch += (char) c;
        }
    }
}

package Zad04;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private String stanowisko;
    private int stazPracy;
    private double pensja;

    public Pracownik() {
        this.imie = "Jan";
        this.nazwisko = "Kowalski";
        this.stanowisko = "kierownik";
        this.stazPracy = 10;
        setPensja();
    }

    public Pracownik(String imie, String nazwisko, String stanowisko, int stazPracy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.stazPracy = stazPracy;
        setPensja();
    }

    public Pracownik(Pracownik pracownik) {
        this.imie = pracownik.getImie();
        this.nazwisko = pracownik.getNazwisko();
        this.stanowisko = pracownik.getStanowisko();
        this.stazPracy = pracownik.getStazPracy();
        this.pensja = pracownik.getPensja();
    }

    @Override
    public String toString() {
        return String.format("%1$-15s | %2$-15s | %3$-20s | %4$2d | %5$.2f", imie, nazwisko, stanowisko, stazPracy, pensja);
    }

    public boolean ZwiekszPensja(double wzrost) {
        boolean output = false;

        if (pensja * (1.0 + wzrost) >= 10000) {
            pensja *= (1.0 + wzrost);
            output = true;
        }

        return output;
    }

    public void ZwiekszStaz() {
        stazPracy++;
        setPensja();
    }

    // getters

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public int getStazPracy() {
        return stazPracy;
    }

    public double getPensja() {
        return pensja;
    }

    // setters

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public void setStazPracy(int stazPracy) {
        this.stazPracy = stazPracy;
        setPensja();
    }

    private void setPensja() {
        this.pensja = 4500 + (150 * stazPracy);
        switch (stanowisko) {
            case "manager":
                pensja += 500;
            case "kierownik":
                pensja += 1000;
        }
    }
}

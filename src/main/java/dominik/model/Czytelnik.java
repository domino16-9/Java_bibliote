package dominik.model;

public class Czytelnik {
    private String imie;
    private String nazwisko;
    private String numerID;

    public Czytelnik(String imie, String nazwisko, String numerID) {
        setImie(imie);
        setNazwisko(nazwisko);
        this.numerID = numerID;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNumerID() {
        return numerID;
    }

    public void setNumerID(String numerID) {
        this.numerID = numerID;
    }

    @Override
    public String toString() {
        return "czytelnik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numerID='" + numerID + '\'' +
                '}';
    }
}



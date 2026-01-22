package tyden04;

public class Vrchol {
    private String nazev;

    public Vrchol(String nazev) {
        this.nazev = nazev;
    }

    public String getNazev() {
        return nazev;
    }

    @Override
    public String toString() {
        return nazev;
    }
}

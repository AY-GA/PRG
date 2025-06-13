package lekce_12;

public class Kocka extends Zvire {
    private int pocetZivotu;

    public Kocka(String jmeno) {
        super(jmeno);
        this.pocetZivotu = 9;
    }

    public int getPocetZivotu() {
        return pocetZivotu;
    }

    public void setPocetZivotu(int pocetZivotu) {
        if (pocetZivotu == 0) isAlive = false;
        else if (pocetZivotu > 0) isAlive = true;

        this.pocetZivotu = pocetZivotu;
    }
}

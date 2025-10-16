package lekce_25;

public class ObousmernaPolozka {
    public String hodnota;
    public ObousmernaPolozka dalsi;
    public ObousmernaPolozka predchozi;

    public ObousmernaPolozka(String hodnota, ObousmernaPolozka dalsi, ObousmernaPolozka predchozi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
        this.predchozi = predchozi;
    }
}
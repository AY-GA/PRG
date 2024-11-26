package lekce_07_test;

public class Duchodce extends Clovek {
    String name;

    public Duchodce(String name) {
        this.name = name;
    }

    public int vyskaPlatu(Boolean pracuje) {
        return 10_000;
    }

    public int vyseDavky(Integer letDuchodu) {
        return 1_000 + letDuchodu;
    }
}

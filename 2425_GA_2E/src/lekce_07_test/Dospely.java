package lekce_07_test;

public class Dospely extends Clovek {
    String name;
    Boolean pracuje;
    public Dospely(String name, Boolean pracuje){
        this.name = name;
        this.pracuje = pracuje;
    }

    public int vyseDavky(Integer input) {
        return 0;
    }
    public int vyskaPlatu(Boolean pracuje) {
        if (pracuje) return 45_854;
        else return 0;
    }
}

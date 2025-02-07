package lekce_07_test;

public class Dite extends Clovek {
    String name;
    Boolean skola;
    Integer rok;
    public Dite(String name,Boolean skola, Integer rok){
        this.name = name;
        this.skola = skola;
        this.rok = rok;
    }
    public int vyseDavky(Integer skolniRok) {
        return skolniRok * 100;
    }
    public int vyskaPlatu(Boolean pracuje) {
        return 0;
    }
}

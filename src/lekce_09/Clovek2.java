package lekce_09;

import java.util.Arrays;

public class Clovek2 implements Comparable {
    String krestni;
    String prijmeni;

    public Clovek2(String krestni, String prijmeni) {
        this.krestni = krestni;
        this.prijmeni = prijmeni;
    }

    @Override
    public String toString() {
        return "Clovek2{" +
                "krestni='" + krestni + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Clovek2[] arr = {
                new Clovek2("a", "A"),
                new Clovek2("c", "C"),
                new Clovek2("b", "B"),
                new Clovek2("f", "F"),
                new Clovek2("d", "D"),
                new Clovek2("x", "X"),
        };

        Arrays.sort(arr);

        vypis(arr);
    }

    private static void vypis(Clovek2[] arr) {
        for (Clovek2 c : arr) System.out.println(c);
    }

    @Override
    public int compareTo(Object o) {
        Clovek2 x = (Clovek2) o;

        return prijmeni.compareTo(x.prijmeni);
    }
}

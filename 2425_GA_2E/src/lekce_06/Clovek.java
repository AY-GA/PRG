package lekce_06;

import java.util.Scanner;

public class Clovek {
    protected String jmeno;
    protected String prijmeni;

    public Clovek(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public void showInfo(Clovek osoba) {
        System.out.println("Jméno: " + jmeno + ", Příjmení: " + prijmeni);
    }

    public int compareTo(Clovek c) {
        int comparePrijmeni = prijmeni.compareTo(c.prijmeni);
        if (comparePrijmeni == 0) return jmeno.compareTo(c.jmeno);
        else return comparePrijmeni;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clovek[] arr = new Clovek[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Zadejte jméno osoby " + (i + 1) + ": ");
            String jmeno = scanner.nextLine();
            System.out.print("Zadejte příjmení osoby " + (i + 1) + ": ");
            String prijmeni = scanner.nextLine();
            arr[i] = new Clovek(jmeno, prijmeni);
        }
        for (Clovek osoba : arr) osoba.showInfo(osoba);
        System.out.println("------");

        int iterace = 1;
        while (iterace > 0) {
            iterace = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    Clovek temp = arr[0];
                    arr[0] = arr[1];
                    arr[1] = temp;
                    iterace++;
                }
            }
        }
        System.out.println("\nSeznam osob:\n");
        for (Clovek osoba : arr) osoba.showInfo(osoba);
    }
}
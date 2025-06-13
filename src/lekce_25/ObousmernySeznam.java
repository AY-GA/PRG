package lekce_25;

import java.util.Scanner;

public class ObousmernySeznam {
    ObousmernaPolozka prvniPolozka = null;
    ObousmernaPolozka posledniPolozka = null;

    public void pridejPolozku(String x) {
        ObousmernaPolozka nova = new ObousmernaPolozka(x, null, null);

        if (prvniPolozka == null) {
            prvniPolozka = nova;
        } else {
            posledniPolozka.dalsi = nova;
            nova.predchozi = posledniPolozka;
        }
        posledniPolozka = nova;
    }

    public void vypis() {
        for (ObousmernaPolozka o = prvniPolozka; o != null; o = o.dalsi)
            System.out.print(o.hodnota + " ");
        System.out.println();
    }

    public void bubbleSort() {
        if (prvniPolozka == null) return;
        boolean prohozeno = false;

        ObousmernaPolozka aktualni = prvniPolozka;
        while (!prohozeno && aktualni.dalsi != null) {
            if (aktualni.hodnota.compareTo(aktualni.dalsi.hodnota) > 0) {
                String temp = aktualni.hodnota;
                aktualni.hodnota = aktualni.dalsi.hodnota;
                aktualni.dalsi.hodnota = temp;
                prohozeno = true;
            }
            aktualni = aktualni.dalsi;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObousmernySeznam seznam = new ObousmernySeznam();

        String vstup;
        while (!(vstup = sc.next()).equals("END"))
            seznam.pridejPolozku(vstup);

        seznam.bubbleSort();
        seznam.vypis();
    }
}

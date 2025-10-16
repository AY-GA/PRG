package lekce_28;

import lekce_22.PolozkaSeznamu;

public class SpojovySeznam {
    PolozkaSeznamu prvniPolozka = null;
    PolozkaSeznamu posledniPolozka = null;

    public void addPolozka(int x) {
        var nova = new PolozkaSeznamu(x, null);
        if (prvniPolozka == null) {
            prvniPolozka = nova;
            posledniPolozka = prvniPolozka;
        } else {
//            PolozkaSeznamu posledni = findPosledni();
            posledniPolozka.dalsi = nova;
            posledniPolozka = nova;
        }
    }

    public PolozkaSeznamu findPosledni() {
        PolozkaSeznamu posledni = prvniPolozka;

        while (posledni.dalsi != null) {
            posledni = posledni.dalsi;
        }
        return posledni;
    }

    public void remove(PolozkaSeznamu target) {
        if (posledniPolozka == null || target == null) return;

        var p = posledniPolozka;
        while (p.dalsi != target && p.dalsi != posledniPolozka) {
            p = p.dalsi;
        }

        if (p.dalsi == target) {
            if (p.dalsi == p) { // poslední prvek
                posledniPolozka = null;
            } else {
                if (target == posledniPolozka) posledniPolozka = p;
                p.dalsi = target.dalsi;
            }
        }
    }

    public int size() {
        if (prvniPolozka == null) return 0;
        int count = 1;
        var p = prvniPolozka;
        while (p.dalsi != prvniPolozka) {
            count++;
            p = p.dalsi;
        }
        return count;
    }

    public void vypis() {
        if (prvniPolozka == null) return;
        var polozka = prvniPolozka;

        while (polozka.dalsi != null) {
            System.out.print(polozka.hodnota + " ");
            polozka = polozka.dalsi;
        }
        System.out.print(polozka.hodnota + " ");
    }

    void removeSudy() {
        while (prvniPolozka != null && prvniPolozka.hodnota % 2 == 0) {
            prvniPolozka = prvniPolozka.dalsi;
        }

        if (prvniPolozka == null) {
            posledniPolozka = null;
            return;
        }

        var aktualni = prvniPolozka;
        while (aktualni.dalsi != null) {
            if (aktualni.dalsi.hodnota % 2 == 0) aktualni.dalsi = aktualni.dalsi.dalsi;
            else aktualni = aktualni.dalsi;
        }
    }

    public static void main(String[] args) {
        var s = new SpojovySeznam();
        var start = System.currentTimeMillis();
        for (int i = 0; i < 20; i += 2)
            s.addPolozka(i);

        s.vypis();
        System.out.println();
        s.removeSudy();
        s.vypis();
        System.out.println("\n" + (System.currentTimeMillis() - start) + " ms");
    }
}

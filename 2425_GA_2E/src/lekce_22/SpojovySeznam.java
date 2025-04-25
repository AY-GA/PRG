package lekce_22;

import java.time.LocalTime;

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

    public void vypis() {
        var polozka = prvniPolozka;

        while (polozka.dalsi != null) {
            System.out.println(polozka.hodnota);
            polozka = polozka.dalsi;
        }
    }

    public static void main(String[] args) {
        var s = new SpojovySeznam();
        var start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            s.addPolozka(i);
        }
//        s.vypis();
        System.out.println(System.currentTimeMillis() - start + " ms");
    }
}

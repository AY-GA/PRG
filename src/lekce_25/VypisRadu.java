package lekce_25;

import lekce_22.PolozkaSeznamu;

import java.util.Scanner;

public class VypisRadu {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        PolozkaSeznamu zacatek = null;

        while (true) {
            int hodnota = sc.nextInt();
//            PolozkaSeznamu nova = new PolozkaSeznamu(hodnota,zacatek);
            zacatek = new PolozkaSeznamu(hodnota, zacatek);
            for (var x = zacatek; x != null; x = x.dalsi)
                System.out.println(x.hodnota);
        }

    }
}

package lekce_28;

import lekce_22.PolozkaSeznamu;
import lekce_22.SpojovySeznam;

import java.util.Scanner;

public class CyklenySeznam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpojovySeznam ss = new SpojovySeznam();

        for (int i = 1; i <= 5; i++) ss.addPolozka(sc.nextInt());

        int krok = 10;
        for (int i = 0; i < 5; i++) {
//            ss.addPolozka();
        }
    }
}


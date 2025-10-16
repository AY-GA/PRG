/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce9;

import java.util.Random;

/**
 *
 * @author ali.yunussov.s
 */
public class Balicek {
    public static void main(String[] args) {
        Balicek b = new Balicek();
        b.zamichat();
        for(Karta k : b.balicek) {
            System.out.println(k);
        }
    }
    
    private final Karta[] balicek
            = new Karta[Barva.values().length * Hodnota.values().length];

    public Balicek() {
        int i = 0;
        for(Barva barva : Barva.values()) {
            for(Hodnota hodnota : Hodnota.values()) {
                balicek[i] = new Karta (barva, hodnota);
                i++;
            }
        }
    }
    
    public void zamichat() {
        Random r = new Random();
        for(int i = 0; i < balicek.length; i++) {
            int j = r.nextInt(balicek.length);
            // prohodit balicek[i] <-> balicek[j]
            Karta k = balicek[i];
            balicek[i] = balicek[j];
            balicek[j] = k;
        }        
    }
}

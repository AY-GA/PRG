/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce9;

/**
 *
 * @author ali.yunussov.s
 */
public class Karta {
    private final Barva barva;
    private final Hodnota hodnota;

    public Karta(Barva barva, Hodnota hodnota) {
        this.barva = barva;
        this.hodnota = hodnota;
    }

    public Barva getBarva() {
        return barva;
    }

    public Hodnota getHodnota() {
        return hodnota;
    }

    @Override
    public String toString() {
        return barva.toString() + hodnota.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

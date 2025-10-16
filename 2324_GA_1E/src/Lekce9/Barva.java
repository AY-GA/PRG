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
public enum Barva {
    SRDCE("\u2665"), KARA("\u2666"), PIKY("\u2660"), KRIZE("\u2663");
    private final String barva;

    private Barva(String barva) {
        this.barva = barva;
    }

    @Override
    public String toString() {
        return barva;
    }
}

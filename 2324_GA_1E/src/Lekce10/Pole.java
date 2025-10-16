/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce10;

import java.util.Arrays;

/**
 *
 * @author ali.yunussov.s
 */
public class Pole {
    
    public static void main(String[] args) {
        int[] pole = {1,2,3};
        System.out.println(Arrays.toString(pole));
        pole = pridej(4,pole);
        System.out.println(Arrays.toString(pole));
    }
    public static int[] pridej(int p, int[] pole) {
        int[] vysledek = new int[pole.length + 1];
        for (int i = 0; i < pole.length; i++) {
            vysledek[i] = pole[i];
        }
        vysledek[vysledek.length - 1] = p;
        return vysledek;
    }
}
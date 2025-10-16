/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce6;

import java.util.Arrays;
/**
 *
 * @author ali.yunussov.s
 */
public class Fibonacci {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(vytvor(10)));
    }
    
    public static long[] vytvor(int pocet) {
        long[] rada = new long[pocet];
        rada[0] = 0;
        rada[1] = 1;
        for (int i = 2; i < rada.length; i++) {
            rada[i] = rada[i-2] + rada[i-1];
        }
        return rada;
    }
}

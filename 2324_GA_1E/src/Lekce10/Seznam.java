/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ali.yunussov.s
 */
public class Seznam {
    private static final boolean SPOJOVY_SEZNAM = true;
    public static List inicializuj() {
        if (SPOJOVY_SEZNAM) return new LinkedList();
        else return new ArrayList();
    }
    public static void main(String[] args) {
        List<Object> seznam = new ArrayList();
        for(int i = 1; i < 10; i++) {
            seznam.add(i);
        }
        System.out.println(seznam);
        seznam = inicializuj();
        
        ArrayList jinySeznam = new ArrayList();
//        jinySeznam = inicializuj();
    }
    public static List pridej(int p, List seznam) {
        seznam.add(p);
        return seznam;
    }
    
}

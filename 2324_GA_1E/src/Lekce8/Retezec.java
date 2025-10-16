/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce8;

import java.util.Arrays;

/**
 *
 * @author ali.yunussov.s
 */
public class Retezec {
    public static void main(String[] args) {
        System.out.println("Registracni znacka \u00AE");
        String text = "Tvoje jmeno \n je\"Josef\".";
        String soubor = "Cesta k souboru je Z:\\JavaApplication1\\src\\lekce8";
        
        String s = new String("Hello");
        System.out.println(s);
        if(s == "Hello") {
            System.out.println("Je to pozdrav z konstruktoru");
        }
        if(s.equals("Hello")) {
            System.out.println("Je to pozdrav z konstruktoru equals");
        }
        // 01234
        s = "Hello";
        if(s == "Hello") {
            System.out.println("Je to pozdrav");
        }
        if(s.equals("Hello")) {
            System.out.println("Je to pozdrav equals");
        }
        
        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        
        System.out.println(s.substring(1, 4));
        System.out.println(s.indexOf("io"));
        System.out.println(s.endsWith("io"));
        System.out.println("".isEmpty());
        
        s = "Nejlepsi jazyk je Java. Java je super.";
        String[] p = s.split(" ");
        System.out.println(Arrays.toString(p));
        System.out.println(s.replace("Java", "Python"));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce8;

/**
 *
 * @author ali.yunussov.s
 */
public class Palindrom {
    public static void main(String[] args) {
        Palindrom p = new Palindrom();
        System.out.println(p.jePalindrom("ABBA"));
        System.out.println(p.jePalindrom("kajak"));
        p.setIgnorujVelka(true);
        System.out.println(p.jePalindrom("Kajak"));
        p.setIgnorujMezery(true);
        System.out.println(p.jePalindrom("jelenovi pivo nelej"));
    }
    private boolean ignorujVelka = false;
    private boolean ignorujMezery = false;

    public boolean isIgnorujVelka() {
        return ignorujVelka;
    }

    public void setIgnorujVelka(boolean ignorujVelka) {
        this.ignorujVelka = ignorujVelka;
    }

    public boolean isIgnorujMezery() {
        return ignorujMezery;
    }

    public void setIgnorujMezery(boolean ignorujMezery) {
        this.ignorujMezery = ignorujMezery;
    }
    
    public boolean jePalindrom(String s) {
        int zleva = 0;
        int zprava = s.length() - 1;
        while(zleva < zprava) {
            char levy = s.charAt(zleva);
            char pravy = s.charAt(zprava);
            if(ignorujVelka) {
                levy = Character.toLowerCase(levy);
                pravy = Character.toLowerCase(pravy);
            }
            if(ignorujMezery) {
                if(Character.isWhitespace(levy)) {
                    zleva++;
                    continue;
                }
                if(Character.isWhitespace(pravy)) {
                    zprava--;
                    continue;
                }
            }
            if(levy != pravy) {
                return false;
            }
            zleva++;
            zprava--;
        }
        return true;
    }
}

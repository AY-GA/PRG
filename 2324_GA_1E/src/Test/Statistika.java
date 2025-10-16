/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author ali.yunussov.s
 */
public class Statistika {
    int charcount;
    
    int digits;
    int letters;
    int uppercase;
    int lowercase;
    int whitespace;
    int control;
    int rowcount;
    double avglength;
    char modalletter;
    char modalsymbol;
    String longrow;
    
    public void resetvalues() {
        digits = 0;
        letters = 0;
        uppercase = 0;
        lowercase = 0;
        control = 0;
        rowcount = 0;
        avglength = 0;
        longrow = "";
    }
    public void pridej(String text) {
        String alltext = "";
        for(char character : text.toCharArray()) {
            charcount++;
            alltext += character;
            if(Character.isWhitespace(character)) {
                whitespace++;
            }
            if(Character.isDigit(character) == true) {
                digits++;
            }
            if(Character.isLetter(character)) {
                letters++;
                if(Character.isLowerCase(character)) {
                    lowercase++;
                }
                if(Character.isUpperCase(character)) {
                    uppercase++;
                }
            }
            if(Character.isISOControl(character)) {
                control++;
            }
        }
        if(alltext.length() > longrow.length()) {
            longrow = alltext;
        }
        rowcount++;
        avglength = 1.0 * charcount / rowcount;
        System.out.println("–" + alltext);
    }
    private void showstats() {
        System.out.println();
        System.out.println("Spaces: " + whitespace);
        System.out.println("Digits: " + digits);
        System.out.println("Letters: " + letters);
        System.out.println("    Uppercase: " + uppercase);
        System.out.println("    Lowercase: " + lowercase);
        System.out.println();
        System.out.println("ISO charcters: " + control);
        System.out.println("Row count: " + rowcount);
        System.out.println("Avg row length: " + avglength);
        System.out.println();
        System.out.println("Longest row: \n" + longrow);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Statistika s = new Statistika();
        s.resetvalues();
        s.pridej("Hello");
        s.pridej("World");
        s.pridej("Arabska 14");
        s.pridej("Borislavka \n 1");
        s.showstats();
//        Character.getType();
    }
    public static boolean contains (char[] kupka, char[] jehla) {
        for(int i = 0; i < kupka.length; i++) {
            boolean notfound = false;
            if(kupka[i] == jehla[0]) {
                for(int j = 0; j < jehla.length; j++) {
                    if(kupka[i+j] != jehla[j]) {
                        notfound = true;
                        break;
                    }
                    if(!notfound) return true;
                }
            }
        }
        return false;
    }
}

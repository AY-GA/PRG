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
public class Palindrome {
    public static void main(String[] args) {
        String a = "Kobyla ma maly bok";
        String trim = a.replaceAll("\\s", "").toLowerCase();
        System.out.println(trim);
        PalindromeCheck(trim);
    }
    public static void PalindromeCheck(String trimtext) {
        boolean isPalindrome = true;
        int length = trimtext.length();
        for(int i = 0; i < length / 2; i++) {
            if(trimtext.charAt(i) != trimtext.charAt(length - i - 1)) {
                isPalindrome = false; break;
            }
        }
        if(isPalindrome) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}

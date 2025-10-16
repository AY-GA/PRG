/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 *
 * @author ali.yunussov.s
 */
public class Znak {
    public static char nejvyssi(String s) {
        // -------------- zde odstrihnout --------------------------------------
        // sem vlozte kod, po vyzkouseni ho zkopirujte do editacniho pole otazky
//        byte[] bytes = Str
//        String decoded = new String(s.getBytes(), "UTF-16")
        if(s.isEmpty()) return 0x0000;
        else {
            char result = s.charAt(0);
            for(int i = 1; i < s.length(); i++) {
                result = result > s.charAt(i) ? result : s.charAt(i);
            }
            return result;
        }
        // -------------- zde odstrihnout --------------------------------------
    }
    public static void main(String[] args) {
        System.out.println(nejvyssi("ABC")); // C
        System.out.println(nejvyssi("0123456789")); // 9
        System.out.println(nejvyssi("ZYX")); // Z
        System.out.println(nejvyssi("")); //
    }

    private static char getBytes(Charset UTF_16) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}

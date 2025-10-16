/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce10;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ali.yunussov.s
 */
public class Mapa {
    public static void main(String[] args) {
        Map<String, String> slovnik = new HashMap<>();
        slovnik.put("ahoj", "hi");
        slovnik.put("pes", "dog");
        System.out.println(slovnik.get("ahoj"));
        slovnik.put("ahoj", "hello");
        slovnik.put("ahoj" ,null);
        System.out.println(slovnik.get("ahoj"));
        System.out.println(slovnik.get("pes"));
        System.out.println(slovnik.get("nevedeme"));
    }
    
}

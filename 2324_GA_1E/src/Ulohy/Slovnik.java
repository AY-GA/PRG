/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulohy;

/**
 *
 * @author ali.yunussov.s
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;
public class Slovnik {
    public void nahraj(BufferedReader ctenar) throws IOException {
        s.add(ctenar);
        // sem vlozte kod
    }
    public String najdi(String slovo) {
        if (s.contains(slovo)) return slovo;
        else return null;
        // sem vlozte kod
    }
    public static void main(String[] args) throws IOException {
        String data = "java Java\npas Pascal\nbas Basic\ncpp C++\n";
        System.out.println(data);
        Slovnik s = new Slovnik();
        BufferedReader br = new BufferedReader(new StringReader(data));
        s.nahraj(br);
        System.out.println(s.najdi("java"));
    }
}

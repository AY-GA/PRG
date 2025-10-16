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
public class Get {
    public static void main(String[] args) {
        Obor trida = Obor.Pr;
        
        System.out.println("Trida & Obor: ");

        for(Tridy i : Tridy.values()) {
            System.out.println(i.name() + " & " + i.getObor(i));
        }
    }
}

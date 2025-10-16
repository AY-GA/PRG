/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce9;

/**
 *
 * @author ali.yunussov.s
 */
public class Mesice {
    public static void main(String[] args) {
        Mesic1 mesic = Mesic1.DUBEN;
        System.out.println(mesic);
        if(mesic == Mesic1.BREZEN) {
            // ...
        }
        
//        for(Mesic1 m : Mesic1.values()) {
//            System.out.println("Mesic na pozici " + m.ordinal()
//                    + ": " + m.name());
//        }        
        
        for(Mesic2 m : Mesic2.values()) {
            System.out.println("Poradi mesice v roce " + m.name()
                    + ": " + m.poradi());
        }
        
        for(Mesic3 m : Mesic3.values()) {
            System.out.println("Pocet dnu v mesici " + m.name()
                    + ": " + m.pocetDnu());
        }
        
        System.out.println(Mesic6.UNOR.pocetDnu(1900));
    }
}

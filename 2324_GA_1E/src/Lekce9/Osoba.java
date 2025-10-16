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
public class Osoba {


      //moznost pomoci pravatni static metody
//    private static final Osoba IRON_MAN = vyrobIronMana();
//    private static Osoba vyrobIronMana() {
//        Osoba im = new Osoba();
//        im.setJmeno("Tony Stark");
//        im.setPrezdivka("Iron Man");
//        return im;
//    }
    
    //moznost pomoci static konstruktoru
//    private static final Osoba IRON_MAN = new Osoba();
//
//    static {
//        IRON_MAN.setJmeno("Tony Stark");
//        IRON_MAN.setPrezdivka("Iron Man");
//    }
    
    //moznost pomoci konstruktoru
    private static final Osoba IRON_MAN = new Osoba("Tony Stark", "Iron Man");
    
    public Osoba(String jmeno, String prezdivka) {
        this.jmeno = jmeno;
        this.prezdivka = prezdivka;
    }
    
    private String jmeno;
    private String prezdivka;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrezdivka() {
        return prezdivka;
    }

    public void setPrezdivka(String prezdivka) {
        this.prezdivka = prezdivka;
    }
}

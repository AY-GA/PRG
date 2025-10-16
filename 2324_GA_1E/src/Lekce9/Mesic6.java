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
public enum Mesic6 {
    LEDEN(31), UNOR(28) {
        @Override
        public int pocetDnu(boolean prestupny) {
            return prestupny ? 29 : 28;
        }
    }, BREZEN(31), DUBEN(30), KVETEN(31), CERVEN(30),
    CERVENEC(31), SRPEN(31), ZARI(30), RIJEN(31), LISTOPAD(30), PROSINEC(31);
//    private static final int [] pocet = {31, 28, 31, 30 ...}
    
    private final int pocet;
    
    private Mesic6(int pocet) {
        this.pocet = pocet;
    }
    
    public int poradi() {
        return ordinal() + 1;
    }
    
    public int pocetDnu(int rok) {
        boolean prestupny = (rok % 4 == 0) && 
                ((rok % 100 != 0) || (rok % 400 == 0));
        return pocetDnu(prestupny);
    }
    public int pocetDnu(boolean prestupny) {
        return pocet;
    }
}

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
public enum Mesic7 {
    LEDEN, UNOR(28) {
        @Override
        public int pocetDnu(boolean prestupny) {
            return prestupny ? 29 : 28;
        }
    }, BREZEN, DUBEN(30), KVETEN, CERVEN(30),
    CERVENEC, SRPEN, ZARI(30), RIJEN, LISTOPAD(30), PROSINEC;
    
    private final int pocet;
    
    private Mesic7() {
        this.pocet = 31;
    }
    
    private Mesic7(int pocet) {
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

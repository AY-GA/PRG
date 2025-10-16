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
public enum Mesic5 {
    LEDEN, UNOR, BREZEN, DUBEN, KVETEN, CERVEN,
    CERVENEC, SRPEN, ZARI, RIJEN, LISTOPAD, PROSINEC;
//    private static final int [] pocet = {31, 28, 31, 30 ...}
    
    public int poradi() {
        return ordinal() + 1;
    }
    
    public int pocetDnu(int rok) {
        boolean prestupny = (rok % 4 == 0) && 
                ((rok % 100 != 0) || (rok % 400 == 0));
        return pocetDnu(prestupny);
    }
    public int pocetDnu(boolean prestupny) {
        switch(this) {
            case UNOR: return prestupny ? 29 : 28;
            case DUBEN:
            case CERVEN:
            case ZARI:
            case LISTOPAD: return 30;
            default: return 31;
        }
    }
}

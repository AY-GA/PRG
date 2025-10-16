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
public enum Mesic4 {
    LEDEN, UNOR, BREZEN, DUBEN, KVETEN, CERVEN,
    CERVENEC, SRPEN, ZARI, RIJEN, LISTOPAD, PROSINEC;
//    private static final int [] pocet = {31, 28, 31, 30 ...}
    
    public int poradi() {
        return ordinal() + 1;
    }
    
    public int pocetDnu(boolean prestupny) {
        switch(poradi()) {
            case 2: return 28;
            case 4:
            case 6:
            case 9:
            case 11: return 30;
            default: return 31;
        }
    }
}

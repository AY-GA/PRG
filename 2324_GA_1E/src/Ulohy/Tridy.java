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
public enum Tridy {
    A(Obor.Hu), B(Obor.Hu), C(Obor.Pr), D(Obor.Pr), E(Obor.Pg);
    
    private final String pocet;

    @Override
    public String toString() {
        return pocet;
    }
    
    private Tridy(Obor obor) {
        this.pocet = obor.toString();
    }
    
    public Obor getObor(Tridy i) {
        switch(this) {
            case A: return Obor.Hu;
            case B: return Obor.Hu;
            case C: return Obor.Pr;
            case D: return Obor.Pr;
            case E: return Obor.Pg;
            default: return null;
        }
    }
}
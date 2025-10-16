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
public class DenVTydnu {
    public static final int PO = 1;
    public static final int UT = 2;
    public static final int ST = 3;
    public static final int CT = 4;
    public static final int PA = 5;
    public static final int SO = 6;
    public static final int NE = 7;
    public static final int[] TYDEN = {PO, UT, ST};
    
    public static void main(String[] args) {
        String dnes = ""; //...
        if(dnes.equals("streda")) {
            //...
        }
        int den = DenVTydnu.PO;
        if(den == UT) {
            //...
        }
        for(int d : TYDEN)
        switch(den) {
            case PO:
                System.out.println("Pondeli");
                break;
            case UT:
                System.out.println("Utery");
                break;
            default:
                System.out.println("Nejaky den");
        }
    }
}

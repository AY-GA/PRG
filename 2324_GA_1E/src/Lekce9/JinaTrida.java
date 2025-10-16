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
public class JinaTrida {
    
    public static void main(String[] args) {
        int den = DenVTydnu.PO;
        if(den == DenVTydnu.UT) {
            
        }
        for(int denvt : DenVTydnu.TYDEN) {
            switch(denvt) {
                case DenVTydnu.UT:
                    //...
            }
        }
        
        Den d = Den.PO;
        if(d== Den.UT) {
            
        }
        for (Den denum : Den.values()) {
            System.out.println(denum);
            switch(denum) {
                case SO:
                case NE:
                    System.out.println("vikend");
                    break;
            }
        }
    }
}

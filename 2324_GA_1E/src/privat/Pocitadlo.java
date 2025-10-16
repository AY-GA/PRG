/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privat;

/**
 *
 * @author ali.yunussov.s
 */
public class Pocitadlo {
    public static void main(String[] args){
        Pocitadlo p1 = new Pocitadlo();
        Pocitadlo p2 = new Pocitadlo();
        Pocitadlo p3 = new Pocitadlo();
        System.out.println(Pocitadlo.pocet());
    }
    private static int pocitadlo = 0;
    public static int pocet(){
        return pocitadlo;
    }
    
    public Pocitadlo(){
        pocitadlo++;
    }
    
      
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce8;

/**
 *
 * @author ali.yunussov.s
 */
public class Nemenna {
    public static void main(String[] args) {
        Nemenna n1 = new Nemenna(1);
        Nemenna n2 = new Nemenna(2);
    }
    private final int a;
    private static final int KONSTANTA = 5;    
    public Nemenna (int a) {
        this.a = a;
    }
    
    public int getA() {
        return a;
    }

}

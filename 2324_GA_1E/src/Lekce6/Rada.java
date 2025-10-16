/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce6;

/**
 *
 * @author ali.yunussov.s
 */
public class Rada {
    public static void main(String[] args) {
        Rada rada = new Rada(10);
//        rada.nastav(0, 1253.5);
//        rada.nastav(1, -555.555);
//        rada.nastav(2, 999);
        rada.zobraz();
        rada.soucet();
        System.out.println("Sum: " + rada.soucet());
        System.out.println("Product: " + rada.soucin());
        
    }
    private double[] rada;
    
    public Rada(int velikost) {
        rada = new double[velikost];
        for(int prvek = 0; prvek < rada.length; prvek++) {
            rada[prvek] = Math.random();
        }
    }
    
    public void nastav(int prvek, double hodnota) {
        rada[prvek] = hodnota;
    }
    
    public double hodnota(int prvek) {
        return rada[prvek];
    }
    
    public void zobraz() {
        for(int prvek = 0; prvek < rada.length; prvek++) {
            System.out.println(rada[prvek]);
        }
    }
    
    public double soucet() {
        double sum = 0;
        for(int prvek = 0; prvek < rada.length; prvek++) { 
            sum += rada[prvek];
        }
        return sum;
    }
    
    public double soucin() {
        double product = 1;
        for(int prvek = 0; prvek < rada.length; prvek++) { 
            product *= rada[prvek];
        }
        return product;
    }
}

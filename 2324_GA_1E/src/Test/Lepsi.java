package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ali.yunussov.s
 */
public class Lepsi {

    double a;
    double b;
    double c;

    public Lepsi(double a, double b) {
        this.a = a;
        this.b = a;
        this.c = Math.sqrt(a * b + b * b);
    }

    double obvod() {
        return a + b + c;
    }

    public static void main(String[] args) {
        Lepsi lptl = new Lepsi(3, 4);
        System.out.println(lptl.c);
        System.out.println(lptl.obvod());
        Lepsi lpt2 = new Lepsi(30, 40);
        System.out.println(lpt2.c);

    }
}
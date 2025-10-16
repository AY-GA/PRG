/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privat;

import ctverec.Tvar;

/**
 *
 * @author ali.yunussov.s
 */
public class Trojuhelnik extends Tvar {

    private double a, b, c;

    public Trojuhelnik(double a, double b, double x, double y) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a * a + b * b);
    }

    @Override
    public double obsah() {
        return a * b / 2;
    }

    @Override
    public double obvod() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}

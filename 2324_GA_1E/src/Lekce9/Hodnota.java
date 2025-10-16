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
public enum Hodnota {
    _2, _3, _4, _5, _6, _7, _8, _9, _J, _Q, _K, _A;

    @Override
    public String toString() {
        return name().substring(1);
    }
}

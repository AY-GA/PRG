/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce4;

import cz.gyarab.util.Utils;
import cz.gyarab.util.light.Matrix;

/**
 *
 * @author ali.yunussov.s
 */
public class Pole {
    private Matrix pole = Matrix.createHorizontal(15);
    
    public Pole(){
        pole.showWindow();
    }
    public void rozsvitProstredni(){
        pole.setOn(2);
    }
    public void rozsvitVsechna(){
        for(int i=0; i<pole.getSize(); i++){
            pole.setOn(i);
        }
    }    
    public void zhasniLicha(){
        for(int i=1; i<pole.getSize(); i++){
            if(i%2==1){
                pole.setOff(i);
            }
        }
    }    
    public void zhasniVseKromeKrajnich(){
        for(int i=1; i<pole.getSize(); i++){
            if(i>0&&i<pole.getSize()-1){
                pole.setOff(i);
            }
        }
    }
    public static void main(String[] args){
        Pole pole = new Pole();
        pole.rozsvitVsechna();
        Utils.sleep(2000);
        pole.zhasniLicha();
        Utils.sleep(2000);
        pole.zhasniVseKromeKrajnich();
    }
}

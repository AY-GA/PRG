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
public class Panel {
    
    public static void main(String[] args){
        Matrix panel = Matrix.createMatrix(5, 5);
        panel.showWindow();
//        panel.setOn(panel.getWidth()-1, panel.getHeight()-1);
        for(int sloupec=0; sloupec < panel.getWidth(); sloupec++){
            for(int radek=0; radek < panel.getHeight(); radek++){
                if((sloupec+radek)%2==0){
                    panel.setOn(sloupec,radek);
                    Utils.sleep(100);
                }
            }            
        }
//        panel.setOn(panel.getWidth());
//        panel.setOn(0,0);
//        panel.setOn(1,0);
//        panel.setOn(2,0);
//        panel.setOn(3,0);
//        panel.setOn(4,0);
    }
}

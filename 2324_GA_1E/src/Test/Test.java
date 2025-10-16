package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cz.gyarab.util.*;
import cz.gyarab.util.light.*;
/**
 *
 * @author ali.yunussov.s
 */
public class Test {
    public static void main(String[] args) {
        Matrix panel = Matrix.createMatrix(50,30);
        panel.showWindow();
        
        for(int sloupec=0; sloupec < panel.getWidth(); sloupec++){
            for(int radek=0; radek < panel.getHeight(); radek++){
                if(sloupec==radek){
                    panel.setOn(sloupec,radek);
                    Utils.sleep(100);
                }
                if(sloupec+radek==(panel.getHeight()+panel.getWidth())/2){
                    panel.setOn(sloupec,radek);
                    Utils.sleep(100);
                }
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce2;

import cz.gyarab.util.Utils;
import cz.gyarab.util.light.Semaphore;

/**
 *
 * @author ali.yunussov.s
 */
public class semafor {
    public static void main(String[] args){
        Semaphore sem = Semaphore.createSemaphore();
        Semaphore sem2 = Semaphore.createSemaphoreUpsideRight();
                
        int i;
        
        for(i=1;i<100;i++){
        sem.showWindow();
        sem2.showWindow();
        
        sem.setRedOn();
        Utils.sleep(100);
        sem.setYellowOn();
        Utils.sleep(100);
        sem.setGreenOn();
        sem.setRedOff();
        sem.setYellowOff();
        Utils.sleep(400);
        sem.setYellowOn();
        Utils.sleep(100);
        sem.setYellowOn();
        sem.setGreenOff();
        sem.setYellowOff();
        
        sem2.setRedOn();
        Utils.sleep(100);
        sem2.setYellowOn();
        Utils.sleep(100);
        sem2.setGreenOn();
        sem2.setRedOff();
        sem2.setYellowOff();
        Utils.sleep(400);
        sem2.setYellowOn();
        Utils.sleep(100);
        sem2.setYellowOn();
        sem2.setGreenOff();
        sem2.setYellowOff();
        
    }
    }
}

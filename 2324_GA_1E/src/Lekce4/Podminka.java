/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce4;

/**
 *
 * @author ali.yunussov.s
 */
public class Podminka {
    public void pozorNaBooleanPromennou(){
        boolean b = true;
        if(b){
            System.out.println("plati");
        }
        if(!b){
            System.out.println("neplati");
        }
        if(true==b){
            System.out.println("take plati");
        }
    } 

    public static void main(String[] args){
        int i = 10;
        if(i==10){
            System.out.println("i=10");
        }
        int j = 20;
        if(j>10){
            System.out.println(">10");
            if(j>20){
                System.out.println("j>20");
            }
        } else{
            System.out.println("<=10");
        }
    }
}

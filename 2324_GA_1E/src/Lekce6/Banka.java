/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce6;

import java.util.Scanner;

/**
 *
 * @author ali.yunussov.s
 */
public class Banka {
    public static double prtotal;
    public static double uspory(double vklad, double sazba) {        
        prtotal += prtotal * sazba / 100;
        return prtotal;
    }
    
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter money to deposit: \n");
//        
//        double vklad = scanner.nextInt();
//        System.out.println("Depositing: " + vklad);
//        
//        System.out.print("Enter how many years to accrue sazba: \n");     
//        int doba = scanner.nextInt();
//           
//        scanner.close();
        int doba = 5;
        double vklad = 100;
        prtotal = vklad;
        for (int i = 1; i < doba+1; i++) {
            System.out.println("After " + i + " years: " + uspory(vklad, 2));
        }
    }
}

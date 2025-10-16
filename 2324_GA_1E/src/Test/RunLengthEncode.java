/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;

/**
 *
 * @author ali.yunussov.s
 */
public class RunLengthEncode {
    
public static void main(String[] args) {
    
    // TODO Auto-generated method stub
    System.out.println("Enter line to encode:");
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    
            int len = input.length();
            int i = 0;
            int CopiesOfEachChar = 0;
            char storeChar = input.charAt(0);

            String outputString = "";
            for(;i<len;i++) {
                if(i+1<len) {
                    if(input.charAt(i) == input.charAt(i+1)) {
                        CopiesOfEachChar++;
                    }
                    else {
                        outputString = outputString + 
   Integer.toHexString(CopiesOfEachChar+1) + storeChar + "";
                        CopiesOfEachChar = 0;
                        storeChar = input.charAt(i+1);
                    }
                }
                else {
                    outputString = outputString + 
 Integer.toHexString(CopiesOfEachChar+1) + storeChar;
                }
            }

            System.out.println("Encoded line is: " + outputString);   

        }

}
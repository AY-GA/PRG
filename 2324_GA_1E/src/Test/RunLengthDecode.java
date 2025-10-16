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
public class RunLengthDecode {
    public static void main(String[] args) {
        System.out.println("Enter line to decode:");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        
        String resultString = "";
        

        for (int i = 0; i < input.length(); i+=2) {
            int count=Character.getNumericValue(input.charAt(i));
            
            for(int j=0;j<count;j++) {
            resultString+=input.charAt(i+1);
            }
        }
        System.out.println(resultString);
        
    }
}

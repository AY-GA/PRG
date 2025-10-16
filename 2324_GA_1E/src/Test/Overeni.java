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
public class Overeni {
    
    public static void main(String[] args) {
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter length of 3 sides of a triangle:");
        System.out.println();
        
         // Read the entered integer
        double s1 = scanner.nextDouble();
        double s2 = scanner.nextDouble();
        double s3 = scanner.nextDouble();
        
        
        // Close the scanner to avoid resource leaks
        scanner.close();
             
    
        if(s1<s2+s3 & s2<s1+s3 & s3<s2+s1 & s1>0 & s2>0 & s3>0){
            System.out.println("A triangle with the sides entered can be made");            
        }
        
        else{
            System.out.println("A traingle like that doesn't exist");
        }
                
    }
}

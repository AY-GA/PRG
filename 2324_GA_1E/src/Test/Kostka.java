package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import cz.gyarab.util.Utils;
import cz.gyarab.util.light.Matrix;
/**
 *
 * @author ali.yunussov.s
 */
class Kostka { 
    public static void main(String[] args) {
            
        Matrix panel = Matrix.createMatrix(5,5);
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter a number between 1 & 10: ");
        System.out.println();

        // Read the entered integer
        int userInput = scanner.nextInt();

        // Display the entered integer
        //System.out.println("You entered: " + userInput);

        // Close the scanner to avoid resource leaks
        scanner.close();
        
        panel.showWindow();
    
        System.out.println("Generating dice face based on input...");
            
        for(int col=0; col < panel.getWidth(); col++){
            for(int row=0; row < panel.getHeight(); row++){
                panel.setOff(col,row);
                Utils.sleep(10);
            }            
        }
                        
        switch(userInput){
        case 1:
            panel.setOn(2,2);
            System.out.println("Done!");
            break;
        case 2:
            panel.setOn(1,1);
            Utils.sleep(100);
            panel.setOn(3,3);
            System.out.println("Done!");
            break;
        case 3:
            panel.setOn(1,1);
            Utils.sleep(100);
            panel.setOn(2,2);
            Utils.sleep(100);
            panel.setOn(3,3);
            System.out.println("Done!");
            break;
        case 4:
            panel.setOn(1,1);
            Utils.sleep(100);
            panel.setOn(3,3);
            Utils.sleep(100);
            panel.setOn(1,3);
            Utils.sleep(100);
            panel.setOn(3,1);
            System.out.println("Done!");
            break;
        case 5:
            panel.setOn(1,1);
            Utils.sleep(100);
            panel.setOn(3,3);
            Utils.sleep(100);
            panel.setOn(1,3);
            Utils.sleep(100);
            panel.setOn(3,1);
            Utils.sleep(100);
            panel.setOn(2,2);
            System.out.println("Done!");
            break;
        case 6:
            panel.setOn(1,1);
            Utils.sleep(100);
            panel.setOn(3,3);
            Utils.sleep(100);
            panel.setOn(1,3);
            Utils.sleep(100);
            panel.setOn(3,1);
            Utils.sleep(100);
            panel.setOn(1,2);
            Utils.sleep(100);
            panel.setOn(3,2);
            System.out.println("Done!");
            break;
        case 7:
            panel.setOn(1,1);
            Utils.sleep(100);
            panel.setOn(3,3);
            Utils.sleep(100);
            panel.setOn(1,3);
            Utils.sleep(100);
            panel.setOn(3,1);
            Utils.sleep(100);
            panel.setOn(1,2);
            Utils.sleep(100);
            panel.setOn(3,2);
            Utils.sleep(100);
            panel.setOn(2,2);
            System.out.println("Done!");
            break;
        case 8:
            panel.setOn(1,1);
            Utils.sleep(100);
            panel.setOn(3,3);
            Utils.sleep(100);
            panel.setOn(1,3);
            Utils.sleep(100);
            panel.setOn(3,1);
            Utils.sleep(100);
            panel.setOn(1,2);
            Utils.sleep(100);
            panel.setOn(3,2);
            Utils.sleep(100);
            panel.setOn(2,3);
            Utils.sleep(100);
            panel.setOn(2,1);
            System.out.println("Done!");
            break;
        case 9:
            panel.setOn(1,1);
            Utils.sleep(100);
            panel.setOn(3,3);
            Utils.sleep(100);
            panel.setOn(1,3);
            Utils.sleep(100);
            panel.setOn(3,1);
            Utils.sleep(100);
            panel.setOn(1,2);
            Utils.sleep(100);
            panel.setOn(3,2);
            Utils.sleep(100);
            panel.setOn(2,1);
            Utils.sleep(100);
            panel.setOn(2,3);
            Utils.sleep(100);
            panel.setOn(2,2);
            System.out.println("Done!");
            break;
        case 10:
            panel.setOn(0,0);
            Utils.sleep(100);
            panel.setOn(1,1);
            Utils.sleep(100);
            panel.setOn(1,2);
            Utils.sleep(100);
            panel.setOn(3,3);
            Utils.sleep(100);
            panel.setOn(4,4);
            Utils.sleep(100);
            panel.setOn(3,2);
            Utils.sleep(100);
            panel.setOn(4,0);
            Utils.sleep(100);
            panel.setOn(3,1);
            Utils.sleep(100);
            panel.setOn(1,3);
            Utils.sleep(100);
            panel.setOn(0,4);
            System.out.println("Done!");
            break;
        case 12:
            panel.setOn(0,0);
            Utils.sleep(100);
            panel.setOn(1,1);
            Utils.sleep(100);
            panel.setOn(1,2);
            Utils.sleep(100);
            panel.setOn(1,3);
            Utils.sleep(100);
            panel.setOn(0,4);
            Utils.sleep(100);
            
            panel.setOn(4,4);
            Utils.sleep(100);
            panel.setOn(3,3);
            Utils.sleep(100);
            panel.setOn(3,2);
            Utils.sleep(100);
            panel.setOn(3,1);
            Utils.sleep(100);
            panel.setOn(4,0);
            
            Utils.sleep(100);
            panel.setOn(2,3);
            Utils.sleep(100);
            panel.setOn(2,1);
            System.out.println("Done!");
            break;
        default:
            System.out.println("Error!");
            break;
        }
    }
}
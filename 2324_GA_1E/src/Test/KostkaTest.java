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
public class KostkaTest {
    
    
    static void one(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
        panel.setOn(2,2);
    }
    static void two(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
        panel.setOn(1,1);
        Utils.sleep(100);
        panel.setOn(3,3);
    }
    static void three(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
        panel.setOn(1,1);
        Utils.sleep(100);
        panel.setOn(2,2);
        Utils.sleep(100);
        panel.setOn(3,3);
    }
    static void four(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
        panel.setOn(1,1);
        Utils.sleep(100);
        panel.setOn(3,3);
        Utils.sleep(100);
        panel.setOn(1,3);
        Utils.sleep(100);
        panel.setOn(3,1);
    }
    static void five(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
        panel.setOn(1,1);
        Utils.sleep(100);
        panel.setOn(3,3);
        Utils.sleep(100);
        panel.setOn(1,3);
        Utils.sleep(100);
        panel.setOn(3,1);
        Utils.sleep(100);
        panel.setOn(2,2);
    }
    static void six(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
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
    }
    static void seven(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
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
    }
    /*static void eight(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
        for(int col=0; col < panel.getWidth(); col++){
            for(int row=0; row < panel.getHeight(); row++){
                if(Input<panel.getWidth()){
                    panel.setOn(col,0);
                }
                else if(Input<2*panel.getWidth()){
                    panel.setOn(col,0);
                    panel.setOn(col,1);
                }
                else{
                    System.out.println("ErrorRRRRr");
                }
            }            
        }
    }*/
    static void eight(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
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
    }
    static void nine(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
        
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
    }
    static void ten(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
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
    }
    static void twelve(){
        Matrix panel = Matrix.createMatrix(5,5);
        panel.showWindow();
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
    }
    
    public static void main(String[] args) {
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter a number between 1 & 10: ");
        System.out.println();

        // Read the entered integer
        int Input = scanner.nextInt();

        // Display the entered integer
        //System.out.println("You entered: " + userInput);

        // Close the scanner to avoid resource leaks
        scanner.close();
        
        System.out.println("Generating dice face based on input...");
            
        /*for(int col=0; col < panel.getWidth(); col++){
            for(int row=0; row < panel.getHeight(); row++){
                panel.setOff(col,row);
                Utils.sleep(10);
            }            
        }*/
        
        if(Input>=0){
            System.out.println("Good");
        }
        
        switch(Input){
        case 1:
            one();
            break;
        case 2:
            two();
            break;
        case 3:
            three();
            break;
        case 4:
            four();
            break;
        case 5:
            five();
            break;
        case 6:
            six();
            break;
        case 7:
            seven();
            break;
        case 8:
            eight();
            break;
        case 9:
            nine();
            break;
        case 10:
            ten();
            break;
        case 12:
            twelve();
            break;
        default:
            System.out.println("Error!");
            break;
        }
    }
}
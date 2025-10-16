/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce6;

/**
 *
 * @author ali.yunussov.s
 */
public class ManipulacePole {
	public static int arraylength = 5; // Array length of each array
    public ManipulacePole(int velikost) {
        double[] aval = new double[velikost];
        
        int roundto = 3; //How many decimal places to round to
        double roundNo = Math.pow(10, roundto); // Used for rounding
        
        int max = 10; // Highest number in array
        for (int prvek = 0; prvek < aval.length; prvek++) {
            aval[prvek] = Math.round(Math.random() *max);
        }
        double[] wval = new double[arraylength];
        // Weight values are below; Feel free to adjust them!
        wval[0] = 1;
        wval[1] = 2;
        wval[2] = 5;
        wval[3] = 4;
        wval[4] = 3;
        
        double[] cval = new double[arraylength];
        System.out.println("Cloned array values:");
        for (int prvek = 0; prvek < cval.length; prvek++) {
            cval[prvek] = aval[prvek];
            System.out.println(cval[prvek]);
        }
        
        boolean[] bval = new boolean[arraylength];
        // Boolean1 values are below; Feel free to adjust them!
        bval[0] = true;
        bval[1] = false;
        bval[2] = false;
        bval[3] = true;
        bval[4] = true;
        
        boolean[] bval2 = new boolean[arraylength];
        // Boolean2 values are below; Feel free to adjust them!
        bval2[0] = true;
        bval2[1] = false;
        bval2[2] = true;
        bval2[3] = false;
        bval2[4] = true;
		
        // aval is "Array values"
        // bval is "Boolean values"
        // bval2 is "Boolean values" (2nd column) 
        // cval is "Cloned array values" 
        // wval is "Weight values"
        
        System.out.println("\n(Array values are randomized between 0 & " + max + ")");
        zobraz(aval, wval, bval, bval2);
        
        System.out.println("Calculations\n————————————");
        System.out.println("Sum: " + soucet(aval));
        System.out.println("Product: " + soucin(aval));
        System.out.println("Arithmetic mean: " + Math.round(soucet(aval)/aval.length *roundNo)/roundNo);
        System.out.println("Weighted mean: " + Math.round(wprumer(aval, wval) *roundNo)/roundNo);
        System.out.println("Geometric mean: " + Math.round(Math.pow(soucin(aval), 1.0/aval.length) *roundNo)/roundNo);
        System.out.println("Quadratic mean: " + Math.round(kvprumer(aval) *roundNo)/roundNo);
        and(bval, bval2); or(bval, bval2); concatenate(bval, bval2);
    }

    public void nastav(double[] array, int prvek, double hodnota) {
        array[prvek] = hodnota;
    }

    public double hodnota(double[] array, int prvek) {
        return array[prvek];
    }

    private static void zobraz(double[] array, double[] array2, boolean[] boolarray, boolean[] boolarray2) {
        
        System.out.println("Array values:");
        for (int prvek = 0; prvek < array.length; prvek++) {
            System.out.println(array[prvek]);
        }
        
        System.out.println("\nWeight values:");
        for (int prvek = 0; prvek < array2.length; prvek++) {
            System.out.println(array2[prvek]);
        }
        
        System.out.println("\nBoolean values:");
        for (int prvek = 0; prvek < boolarray.length; prvek++) {
            System.out.println(boolarray[prvek] + " , " + boolarray2[prvek]);
        }
        
        System.out.println();
    }

    private static double soucet(double[] array) {
        double sum = 0;
        for (int prvek = 0; prvek < array.length; prvek++) {
            sum += array[prvek];
        }
        return sum;
    }

    private static double soucin(double[] array) {
        double product = 1;
        for (int prvek = 0; prvek < array.length; prvek++) {
            product *= array[prvek];
        }
        return product;
    }
    
    private static double kvprumer(double[] array) {
        double kvsum = 0;
        for (int prvek = 0; prvek < array.length; prvek++) {
            kvsum += Math.pow(array[prvek], 2);
        }
        return Math.sqrt((kvsum)/array.length);
    }
    
     private static double wprumer(double[] array, double[] array2) {
        double wavg = 0;
        int wtotal = 0;
        for (int prvek = 0; prvek < array.length; prvek++) {
            wavg += array[prvek]*array2[prvek];
            wtotal += array2[prvek];
        }
        return wavg/wtotal;
    }
    
    private static void and(boolean[] array, boolean[] array2) {
        System.out.println("\nBoolean AND:");
        for (int prvek = 0; prvek < array.length; prvek++) {
            if (array[prvek] && array2[prvek]) {System.out.println(true);}
            else {System.out.println(false);}
        }
    }
    
    private static void or(boolean[] array, boolean[] array2) {
        System.out.println("\nBoolean OR:");
        for (int prvek = 0; prvek < array.length; prvek++) {
            if (array[prvek] || array2[prvek]) {System.out.println(true);}
            else {System.out.println(false);}
        }
    }
    
    private static void concatenate(boolean[] array, boolean[] array2) {
        System.out.println("\nBoolean CLONE:");
        for (int prvek = 0; prvek < array.length; prvek++) {
            System.out.println("(bool1) " + array[prvek]);
        }
        for (int prvek = 0; prvek < array2.length; prvek++) {
            System.out.println("(bool2) " + array2[prvek]);
        }
    }

    public static void main(String[] args) {
        new ManipulacePole(arraylength);
    }
}

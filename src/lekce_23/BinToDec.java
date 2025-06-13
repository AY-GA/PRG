package lekce_23;

import java.util.Scanner;

public class BinToDec {

    public static int horner(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = result * 2 + a[i];
        }
        return result;
    }

    private static int[] charToIntArray(char[] num) {
        int[] array = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            array[i] = num[i] - '0';
            if (array[i] != 0 && array[i] != 1) {
//                System.out.println("Error: Only 0 and 1 allowed.");
                return null;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter binary number: ");
        char[] num = sc.next().toCharArray();

        int[] array = charToIntArray(num);
        if (array == null) return;

        System.out.println(horner(array));
    }
}

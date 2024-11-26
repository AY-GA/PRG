package lekce_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Recaman {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(Arrays.toString(recaman(n)));
    }

    public static int[] recaman(int n) {
        int[] sequence = new int[n];
        sequence[0] = 0;

        for (int i = 1; i < n; i++) {
            int curr = sequence[i - 1] - i;
            for (int j = 0; j < i; j++) {
                if ((sequence[j] == curr) || curr < 0) {
                    curr = sequence[i - 1] + i;
                    break;
                }
            }
            sequence[i] = curr;
        }
        return sequence;
    }
}

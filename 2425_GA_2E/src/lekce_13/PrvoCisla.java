package lekce_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.Scanner;

public class PrvoCisla {
    public static void main(String[] args) {

        soucetCifer();
    }

    private static void soucetCifer() {
        int count = 0;
        long time = System.currentTimeMillis();

        for (int i = 2; i < 1_000_000_000; i++) {
            if (isPrime2(i))
                count++;
        }
        System.out.println("\nPocet: " + count);
        System.out.println("ms: " + (System.currentTimeMillis() - time));
    }

    private static boolean isPrime(int i) {
        if (i <= 1) return false;
        if (i % 2 == 0) return false;

        int sq = (int) Math.sqrt(i);
        for (int j = 3; j <= sq; j += 2)
            if (i % j == 0) return false;

        return true;
    }

    private static boolean isPrime2(int i) {
        if (i <= 1) return false;
        if (i == 2 || i == 3) return true;
        if (i % 2 == 0 || i % 3 == 0) return false;

        int sq = (int) Math.sqrt(i);
        for (int j = 5; j <= sq; j += 6)
            if (i % j == 0 || i % (j + 2) == 0) return false;

        return true;
    }

}

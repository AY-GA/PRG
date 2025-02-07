package lekce_14;

import java.math.BigInteger;
import java.util.Scanner;

public class GCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger cislo1 = sc.nextBigInteger();
        BigInteger cislo2 = sc.nextBigInteger();

        BigInteger x = cislo1;
        BigInteger y = cislo2;

        while (!cislo1.equals(cislo2)) {
            BigInteger rozdil;
            if (cislo1.compareTo(cislo2) > 0)
                cislo1 = cislo1.subtract(cislo2);
            else
                cislo2 = cislo2.subtract(cislo1);
        }
        System.out.println("gcd(" + x + ", " + y + ") = " + cislo1);
        System.out.println("zlomek: " + x.divide(cislo1) + " / " + y.divide(cislo2));
//        System.out.println(cislo1.gcd(cislo2));
    }
}

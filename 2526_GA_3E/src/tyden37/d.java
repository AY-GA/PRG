package tyden37;

import java.util.Scanner;

public class d {
    static void main() {
        var sc = new Scanner(System.in);
        int cislo = sc.nextInt();
        if (cislo < 0) throw new IllegalArgumentException("Cislo nesmi byt zaporne");
        sumFomString(cislo);
        sumFromInt(cislo);
    }

    private static void sumFromInt(int cislo) {
        int sum = 0;
        while (cislo > 0) {
            sum += cislo % 10;
            cislo /= 10;
        }
        System.out.println(sum);
    }

    private static void sumFomString(int num) {
        String strCislo = Integer.toString(num);
        String[] arr = strCislo.split("");

        char[] arr2 = strCislo.toCharArray();
        int sum2 = 0;
        for (char i : arr2)
            sum2 += Integer.parseInt(String.valueOf(i));
        System.out.println(sum2);

        int sum = 0;
        for (String i : arr)
            sum += Integer.parseInt(i);
        System.out.println(sum);
    }
}

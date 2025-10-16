package lekce_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("vstup.txt"));
        Scanner sc = new Scanner(System.in);

        int i;
        i = sc.nextInt();

        int total = 0;

        while ((i = sc.nextInt()) > 0) total += i;
    }
}

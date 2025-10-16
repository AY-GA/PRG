package lekce_11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class CteckaSouboru {
    public static void main(String[] args) throws IOException {
        File file = new File("cisla.txt");
        FileWriter out = new FileWriter(file);

        Integer randomNum = ThreadLocalRandom.current().nextInt();
        String cislo = randomNum.toString();
        out.write(cislo);
        out.close();

//        readFile();
    }

    private static void writeFile() throws IOException {
        File file = new File(".gitignore");
        FileReader reader = new FileReader(file);

        int x;
        int size = 0;
        while ((x = reader.read()) != -1) {
            char ch = (char) x;
            System.out.print(ch);
            size++;
        }
        System.out.println("\nZnaky: " + size);
        reader.close();
    }
    private static void readFile() throws IOException {
        File file = new File(".gitignore");
        FileReader reader = new FileReader(file);

        int x;
        int size = 0;
        while ((x = reader.read()) != -1) {
            char ch = (char) x; // Convert the int to a char
            size++;
            System.out.print(ch);
        }
        System.out.println("\nZnaky: " + size);
        reader.close();
    }
}

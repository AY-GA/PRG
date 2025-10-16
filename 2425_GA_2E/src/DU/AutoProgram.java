package DU;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutoProgram {
    private static final String FILE_NAME = "data.dat";

    public static void main(String[] args) {
        List<Auto> seznamAut = readSeznamAut();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadejte SPZ: ");
        String spz = scanner.next();
        System.out.print("Zadejte najete kilometry: ");
        int kilometry = scanner.nextInt();

        seznamAut.add(new Auto(spz, kilometry));

        System.out.println("\nSeznam aut:");
        int celkemKilometry = 0;
        for (Auto auto : seznamAut) {
            System.out.println(auto);
            celkemKilometry += auto.getKilometry();
        }

        System.out.println("\nCelkem najeté kilometry: " + celkemKilometry);
        saveSeznamAut(seznamAut);
    }

    private static List<Auto> readSeznamAut() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            return (List<Auto>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private static void saveSeznamAut(List<Auto> seznamAut) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(seznamAut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
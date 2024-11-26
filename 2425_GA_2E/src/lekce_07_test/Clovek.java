package lekce_07_test;

import java.util.Scanner;

public abstract class Clovek {
    public abstract int vyskaPlatu(Boolean pracuje);

    public abstract int vyseDavky(Integer integer);

    public static void main(String[] args) {
        final int pocetOsob = 5;
        Scanner sc = new Scanner(System.in);
//        ArrayList<Clovek> people = new ArrayList<>(pocetOsob);
        Clovek[] people = new Clovek[5];
        Integer[] listPlat = new Integer[pocetOsob];
        Integer[] listDavky = new Integer[pocetOsob];

        for (int i = 0; i < pocetOsob; i++) {
            String type = sc.next().toLowerCase();
            String name = sc.next();
            String parameter = sc.next();

            switch (type) {
                case "dite" -> {
                    Boolean skola = parameter.equals("ano");
                    Integer rok;
                    if (skola) rok = sc.nextInt();
                    else rok = 0;
                    Clovek c = new Dite(name, skola, rok);
                    people[i] = c;
                    listPlat[i] = 0;
                    listDavky[i] = c.vyseDavky(rok);
                }
                case "dospely" -> {
                    Boolean pracuje = parameter.equals("ano");
                    Clovek c = new Dospely(name, pracuje);
                    people[i] = c;
                    listPlat[i] = c.vyskaPlatu(pracuje);
                    listDavky[i] = 0;
                }
                case "duchodce" -> {
                    Integer rok = Integer.parseInt(parameter);
                    Clovek c = new Duchodce(name);
                    people[i] = c;
                    listPlat[i] = c.vyskaPlatu(null);
                    listDavky[i] = c.vyseDavky(rok);
                }
                default -> {
                    System.out.println("Error!");
                    return;
                }
            }
        }
        Integer totalPlat = 0;
        Integer totalDavky = 0;
        for (Integer integer : listPlat) totalPlat += integer;
        for (Integer i : listDavky) totalDavky += i;
        System.out.println(totalPlat + " " + totalDavky);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) return false;
        try {
            Integer i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}

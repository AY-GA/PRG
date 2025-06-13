package lekce_03;

public class Zverinec {
    public static void main(String[] args) {
        Zvire[] z = new Zvire[3];
        z[0] = new Zvire();
        z[1] = new Pes();
        z[2] = new Klokan();

        for (int i = 0; i < z.length; i++) z[i].vypisSe();
    }
}

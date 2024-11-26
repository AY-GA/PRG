package lekce_04;

public class Tvar {
    public void vypisSe() {
        System.out.println(" " + kdoJsem() + ":");
        System.out.println("obvod: " + calcObvod());
        System.out.println("plocha: " + calcPlocha());
    }

    Double calcPlocha() {
        return null;
    }

    Double calcObvod() {
        return null;
    }

    String kdoJsem() {
        return null;
    }

    public static void main(String[] args) {
        new Ctverec(10.0);
        new Kruh(1.0);
        new Obdelnik(2.0, 3.0);
    }
}

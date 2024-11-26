package lekce_04;

public class Kruh extends Tvar {
    private double prumer;

    Kruh(Double v) {
        if (null == v) return;
        prumer = v;
        vypisSe();
    }

    String kdoJsem() {
        return "Kruh";
    }

    Double calcObvod() {
        return 2 * Math.PI * prumer;
    }

    Double calcPlocha() {
        return Math.PI * Math.pow(prumer, 2);
    }
}

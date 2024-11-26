package lekce_04;

public class Ctverec extends Tvar {
    private double strana;

    Ctverec(Double v) {
        if (null == v) return;
        strana = v;
        vypisSe();
    }

    String kdoJsem() {
        return "Ctverec";
    }

    Double calcObvod() {
        return strana * 4;
    }

    Double calcPlocha() {
        return Math.pow(strana, 2);
    }
}

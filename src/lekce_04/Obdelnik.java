package lekce_04;

public class Obdelnik extends Tvar {
    private double strana1;
    private double strana2;

    Obdelnik(Double s1, Double s2) {
        if (null == s1 || null == s2) return;
        strana1 = s1;
        strana2 = s2;
        vypisSe();
    }

    String kdoJsem() {
        return "Obdelnik";
    }

    Double calcObvod() {
        return 2 * (strana1 + strana2);
    }

    Double calcPlocha() {
        return strana1 * strana2;
    }
}

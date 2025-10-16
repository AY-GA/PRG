package ctverec;

import java.util.Scanner;

/**
 *
 * @author ali.yunussov.s
 */
public class Ctverec extends Tvar {

    private double a;

    public Ctverec(double a, double x, double y) {
        super(x, y);
        this.a = a;
    }

    @Override
    public double obvod() {
        return 4 * a;
    }

    @Override
    public double obsah() {
        return a * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte velikost ctverce:");
        Ctverec ctverec = new Ctverec(sc.nextDouble(), 0, 0);
        System.out.println(ctverec.obvod());
        System.out.println(ctverec.obsah());
        
        System.out.println("Zadejte strany obdelniku:");
        Obdelnik obdelnik = new Obdelnik(sc.nextDouble(), sc.nextDouble(), 0, 0);
        System.out.println(obdelnik.obvod());
        System.out.println(obdelnik.obsah());
        Tvar tvar = new Ctverec(20, 0, 0);
        Tvar tvar2 = new Obdelnik(99, 88, 0, 0);
    }
}

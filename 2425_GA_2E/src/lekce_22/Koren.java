package lekce_22;

public class Koren {

    public static double horner(double[] a, double x) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * Math.pow(x, i);
        }
        return result;
    }

//    public static void main(String[] args) {
////        var scan = new Scanner(System.in);
////        var x = scan.nextDouble();
//        double temp = Double.NaN;
//        double[] a = {0, 2.0, 2.0, -3.0, -2.0, 0.25}; // Koeficienty
//        for (int i = -10; i < 10; i++) {
//            temp = getYofPolynom(a, Double.parseDouble(String.valueOf(i)));
//            System.out.println(temp);
//            if (temp == 0.0) break;
//        }
//        System.out.println("Hodnota f(x) = " + getYofPolynom(a, temp));
//    }

    // Bisection method – hledání kořene v intervalu [a, b]
    public static Double najdiKoren(double[] koef, double a, double b, double epsilon) {
        double fa = horner(koef, a);
        double fb = horner(koef, b);

        if (fa * fb > 0) {
            return null; // funkce nemění znaménko → kořen pravděpodobně není v intervalu
        }

        while ((b - a) >= epsilon) {
            double stred = (a + b) / 2;
            double fmid = horner(koef, stred);

            if (Math.abs(fmid) < epsilon) {
                return stred;
            }

            if (fa * fmid < 0) {
                b = stred;
                fb = fmid;
            } else {
                a = stred;
                fa = fmid;
            }
        }
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        // Koeficienty polynomu: 0.25x^5 - 2x^4 - 3x^3 + 2x^2 + 2x
        double[] a = {0.0, 2.0, 2.0, -3.0, -2.0, 0.25};

        double epsilon = 0.00001;  // přesnost
        System.out.println("Hledám přibližné kořeny v intervalu [-10, 10]:");

        for (double x = -10; x < 10; x += 0.5) {
            Double koren = najdiKoren(a, x, x + 0.5, epsilon);
            if (koren != null) {
                // Zaokrouhlení na 5 desetinných míst pro přehlednost
                System.out.printf("Přibližný kořen: x = %.5f%n", koren);
            }
        }
    }
}

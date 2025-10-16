package tyden40;

import java.math.BigInteger;
import java.text.DecimalFormat;

public class Factorial {
    static DecimalFormat df = new DecimalFormat("######,".repeat(9) + "######.#");

    static void main() {
        System.out.println(df.format(factorial(200)));
    }

    static BigInteger factorial(int in) {
        BigInteger out = BigInteger.valueOf(in);
        for (int i = in; i > 2; i--) {
            System.out.println(df.format(out));
            out = out.multiply(BigInteger.valueOf(i - 1));
        }
        return out;
    }
}

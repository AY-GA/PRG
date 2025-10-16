package tyden38;

import java.time.LocalTime;
import java.util.Scanner;

public class CaesarSifra {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        int key = sc.nextInt();
        String input = sc.next();

        for (int key = 0; key <= 26; key++) {
            System.out.print("\nOffset " + key + "\t");
            for (char c : input.toCharArray()) {
                c = (char) (c + key);

                if (c < 'a')
                    c += 26;
                else if (c > 'z')
                    c -= 26;

                System.out.print(c);
            }
        }
    }
}

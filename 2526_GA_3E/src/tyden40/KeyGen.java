package tyden40;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class KeyGen {
    static void main() {
        System.out.println("AES or DES?");
        var sc = new Scanner(System.in);
        var in = sc.next();
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance(in);
            keyGen.init(128);
            SecretKey secretKey = keyGen.generateKey();
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("keyfile.key"))) {
                oos.writeObject(secretKey);
            }
            System.out.println("Klíč úspěšně vygenerován a uložen jako 'keyfile.key'.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package tyden40;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.crypto.KeyGenerator;

public class Sifruj {
    public static void main() throws IOException {
        Path filename = Paths.get("klic.dat");
        byte [] keyBytes = Files.readAllBytes(filename);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter message to encrypt:");
        String msg = sc.nextLine();

        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("DES");
            SecretKey key = keyGen.generateKey();

            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] msgBytes = msg.getBytes();
            byte[] encryptedMsg = cipher.doFinal(msgBytes);

            System.out.println("Encrypted Message (in Hex): ");
            for (byte b : encryptedMsg)
                System.out.format("%02x", b);
            System.out.println();
        } catch (Exception e) {
            System.err.println("Error during encryption: " + e.getMessage());
        }
    }
}

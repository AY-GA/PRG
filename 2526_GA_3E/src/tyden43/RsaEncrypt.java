package tyden43;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class RsaEncrypt {
    static void main() throws Exception {
        String pem = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJ0aq4p+aR2+t/RLy1ZoE/pPswffo2JsbvtDFhE5RnH/TJXCZgSHMxhB39bIMOn2ElXeEHPcyV9m4LR/Mu35+8MCAwEAAQ==";
        byte[] keyBytes = Base64.getDecoder().decode(pem);

        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(keySpec);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter message to encrypt:");
        String message = sc.nextLine();
        sc.close();

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] encryptedBytes = cipher.doFinal(message.getBytes(StandardCharsets.UTF_8));
        String encryptedBase64 = Base64.getEncoder().encodeToString(encryptedBytes);

        System.out.println("Encrypted msg (Base64):");
        System.out.println(encryptedBase64);
    }
}

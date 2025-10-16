package tyden41;

import java.security.*;
import java.util.Base64;

public class GeneratorKey {
    static void main() throws NoSuchAlgorithmException {
        try {
            var keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(512);

//            Key key = keyGen.generateKey();
            KeyPair keyPair = keyGen.generateKeyPair();

            PublicKey publicKey = keyPair.getPublic();
            PrivateKey privateKey = keyPair.getPrivate();

            String str = Base64.getEncoder().encodeToString(publicKey.getEncoded());
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

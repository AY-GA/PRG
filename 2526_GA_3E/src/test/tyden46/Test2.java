package test.tyden46;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

public class Test2 {
    static String in = """
MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBANb+17cpj3P2d2hFoS1H/w/TMB5Xny1V
VFgsx0+K3WnsG1FDPOhON0Q3VhUMZXX8a3Q/P0UuDgI5Jvv3WJnY8GWjnEoBiLyV7kfNcL0yiQKGfLeS
9iXTE9XxRgcmtGeIol7LYs3t7lC7Kt7omBnOFDoUer+eIGvyDor4Q9TDhgzrAgMBAAECgYAGFsDgh5nd
r/fDVwYQxJfeUacRJhDZFXldQskcRc8JXCTWM2ldQXywNdOQggrebzSblLdDp2F4VDh4NjZ5PYjXpQbV
HoK6ksUqOF40ZGHShKdsJnWGVA3XLLkEwKKEo7KN+aE+o2Yngh5QM4BOIVHq30ZO9rD48blC/hyaXjuJ
5QJBAP2Bjd5D13n9wD+V7aksIaC4NJwSzlBGHknL/nQt8Lz7tuKsBKls8JekzLDAy7bWAISjphRLdPbA
WasFrcbwWuUCQQDZHE0KX/JFdjXeNPLc9ymEyNL6SFKsNQ+pa5/IoABn4l0guxWCxyOrg3cyDBpFxs3O
N4Qxxm8vumyyOwq5hruPAkEApaUs1SoRN0Ymg6Xs+Fi81G7o+X6UTwGyMthXuQR3xJTZiL2MAkUL5Jqr
oWco9ZxaFFF2aNZxY/aF4OlCBrbxPQJAfcRTLItgALT1h38MoMvclTrwXGPA4FjsdawOp11oXsVWRTua
vmM1WomRZsB0B6+eULMANQVKK0/G34gsMkTGKQJBAMiuR9GlKb1jh81BPgLHlFjUnMPeIwxoH5roQVKU
KnjSvdCsnR5HB820VCAlc3tUym3lfAat/kjwXIkAZZQaYB8=

UCoy6erta1nlUQmH3ic/z4xuf1a2xxD2ISrvT23ni0WWVAEv5n1T38QyGy6ByD0N58V7NujyKSIDZHFy
3TCzQeGJjh6JKJAx3w5We3cobJB1ulZNW/WUO3a7hH3yRhXYjHzF/MM7wuHvMd7vAIga1XkSR9Q+MMRP
UFz9DL8LN1c=""";
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        String x = sc.next();
        sc.close();
        in = in.replaceAll("(?<!=)\n","");
        String[] items = in.split("=\n");

        System.out.println(Arrays.toString(items));
        System.out.println(items.length);

        String pem = items[0];
        byte[] keyBytes = Base64.getDecoder().decode(pem);

        var keySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        var pkey = keyFactory.generatePrivate(keySpec);

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, pkey);

        byte[] encryptBytes = Base64.getDecoder().decode(items[1]);
        byte[] decryptBytes = cipher.doFinal(encryptBytes);

//        System.out.println("Decrypted msg (Base64):");
        String plaintext = new String(decryptBytes, StandardCharsets.UTF_8);
        System.out.println(plaintext);
    }
}

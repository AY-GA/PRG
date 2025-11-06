package tyden42;

import java.util.Random;
import java.util.Scanner;

public class HashFunkce {
    static String abc = "AÁBCČDĎEÉĚFGHChIÍJKLMNŇOÓPQRŘSŠTŤUÚŮVWXYÝZŽ";
    static void main() {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        scanner.close();
        while (true) {
            String input = makeWord();
            long hash = getHash(input);
            if (hash == 221) System.out.println(input);
//            System.out.println("Hash: " + hash);
        }
    }

    private static String makeWord() {
        int wordSize = 3;
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < wordSize; i++) {
            int index = random.nextInt(abc.length());
            str.append(abc.charAt(index));
        }
        return str.toString();
    }

    private static long getHash(String msg) {
        long sum = 0;
        for (char c: msg.toCharArray())
            sum += c;
        return (sum * sum + 3) % 1013;
    }
}

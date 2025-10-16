package tyden42;

import java.util.Scanner;

public class HashFunkce {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        long hash = getHash(input);
        System.out.println("Hash: " + hash);
    }

    private static long getHash(String msg) {
        long sum = 0;
        for (char c: msg.toCharArray())
            sum += c;
        return (sum * sum + 3) % 1013;
    }
}

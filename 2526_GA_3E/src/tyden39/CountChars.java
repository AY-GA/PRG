package tyden39;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountChars {
    static int uniqueChars = 0;
    static long totalChars = 0;
    static void main() {
        File file = new File("Ekumenkautf8.txt");
        Map<Character, Integer> charMap1 = new TreeMap<>();

        try (FileReader fr = new FileReader(file)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                char c = (char) ch;
                // Optional: Skip newline/carriage return if you want
                // if (character == '\n' || character == '\r') continue;
                charMap1.put(c, charMap1.getOrDefault(c, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<Integer, List<String>> charMap2 = new TreeMap<>();
        System.out.println();

        for (Map.Entry<Character, Integer> entry : charMap1.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            uniqueChars++;
            totalChars += count;
            String display = switch (ch) {
                case ' ' -> "[space]";
                case '\n' -> "[newline]";
                case '\r' -> "[return]";
                case '\t' -> "[tab]";
                default -> "" + ch;
            };
            charMap2.computeIfAbsent(count, k -> new ArrayList<>()).add(display);
            System.out.println(display + " \t" + count);
        }
        System.out.println("Unique chars: " + uniqueChars);
        System.out.println("Total chars: " + totalChars);
        System.out.println("________________");
        uniqueChars = (int) (totalChars = 0);
        for (Map.Entry<Integer, List<String>> entry : charMap2.entrySet()) {
            int count = entry.getKey();
            for (String chStr : entry.getValue()) {
                System.out.println(chStr + " \t" + count);
                uniqueChars++;
                totalChars += count;
            }
        }
        System.out.println("Unique chars: " + uniqueChars);
        System.out.println("Total chars: " + totalChars);
        System.out.println("________________");
    }
}

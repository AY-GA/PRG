package lekce_14;

public class Sito {
    public static void main(String[] args) {
        boolean[] arr = new boolean[Integer.MAX_VALUE - 10];

        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                System.out.println(i);
                for (int j = i; j < arr.length; j += i)
                    arr[j] = true;
            }
        }
    }
}

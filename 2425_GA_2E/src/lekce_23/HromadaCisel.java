package lekce_23;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HromadaCisel {
    public static void main(String[] args) {
        int[] arr = new int[10];
        var ar2 = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt();
            ar2.add(i, arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(ar2);

        arr = Arrays.stream(arr).filter(x -> x % 2 != 0).toArray();
        ar2 = ar2.stream().filter(x -> x % 2 != 0).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(Arrays.toString(arr));
        System.out.println(ar2);
    }
}

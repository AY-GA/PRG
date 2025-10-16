package tyden37;

import java.util.List;

public class SelectSort {
    public static void sort(List<Integer> array) {
        int size = array.size();

        for (int i = 0; i < size - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < size; j++)
                if (array.get(j) < array.get(idxMin))
                    idxMin = j;

            int temp = array.get(idxMin);
            array.set(idxMin, array.get(i));
            array.set(i, temp);
        }
    }

    public static void print(int[] array) {
        for (int num : array)
            System.out.println(num + "");
    }
}

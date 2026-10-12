package j26_42;

import java.util.ArrayList;

public class Main {
    static void main() {
        var arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        var iterator = new MyIterator(arr);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

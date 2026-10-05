package j26_41;

import java.util.ArrayList;

public class Main {
    static void main() {
        var arr = new ArrayList<String>();
        arr.add("John");
        arr.add("danovy poplatnik");

        var ja = new MyUser(1,"jan",arr);
        System.out.println(ja);

        arr.add("reditel main");
        System.out.println(ja);
    }
}

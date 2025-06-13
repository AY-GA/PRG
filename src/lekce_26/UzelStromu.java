package lekce_26;

import java.util.ArrayList;

public class UzelStromu {
    Integer value;
    UzelStromu left;
    UzelStromu right;

    public UzelStromu(Integer value) {
        this.value = value;
    }

    public static void main(String[] args) {
        UzelStromu uzel5a = new UzelStromu(5);
        UzelStromu uzel11 = new UzelStromu(11);

        UzelStromu uzel6 = new UzelStromu(6);
        uzel6.left = uzel5a;
        uzel6.right = uzel11;

        UzelStromu uzel2a = new UzelStromu(2);
        UzelStromu uzel7 = new UzelStromu(7);
        uzel7.left = uzel2a;
        uzel7.right = uzel6;

        UzelStromu uzel4 = new UzelStromu(4);
        UzelStromu uzel9 = new UzelStromu(9);
        uzel9.right = uzel4;

        UzelStromu uzel5b = new UzelStromu(5);
        uzel5b.right = uzel9;

        UzelStromu koren = new UzelStromu(2);
        koren.left = uzel7;
        koren.right = uzel5b;

        // Optional: print the tree in pre-order
//        System.out.println("Pre-order traversal:");
//        System.out.println(koren);
        koren.vypis();
    }

    public void vypis() {
        System.out.println(value);
        var list = new ArrayList<UzelStromu>();
        list.add(left);
        list.add(right);
        while (true) {
            for (var i : list) {
                System.out.println(i.value);
                var temp = new ArrayList<UzelStromu>();
                if (i.left != null) temp.add(i.left);
                if (i.right != null) temp.add(i.right);
                list = temp;
            }
            if (list.isEmpty()) break;
        }
    }

    @Override
    public String toString() {
        return ("Uzel(V=" + value + ", L=" + left + ", R=" + right + ")");
    }
}

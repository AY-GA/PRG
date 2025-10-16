package lekce_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hadanka {
    public static void main(String[] args) {
        String equation = "send+more=money";
        List<Character> listOfLetters = new ArrayList<>();
        for (int i = 0; i < equation.length(); i++) {
            char ch = equation.charAt(i);
            if (Character.isLetter(ch) && !listOfLetters.contains(ch)) listOfLetters.add(ch);
        }
        System.out.println(listOfLetters);

        for (int s = 0; s < 10; s++) {
            for (int e = 0; e < 10; e++) {
                for (int n = 0; n < 10; n++) {
                    for (int d = 0; d < 10; d++) {
                        for (int m = 1; m < 10; m++) {
                            for (int o = 0; o < 10; o++) {
                                for (int r = 0; r < 10; r++) {
                                    for (int y = 0; y < 10; y++) {
                                        Set<Integer> set = new HashSet<>();
                                        set.add(s);
                                        set.add(e);
                                        set.add(n);
                                        set.add(d);
                                        set.add(m);
                                        set.add(o);
                                        set.add(r);
                                        set.add(y);
                                        if (set.size() == 8) {
                                            int send = addExpanded(s, e, n, d);
                                            int more = addExpanded(m, o, r, e);
                                            int money = addExpanded(m, o, n, e, y);

                                            if (send + more == money)
                                                System.out.println(send + " + " + more + " = " + money);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static int addExpanded(int... values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) result += (int) (values[i] * Math.pow(10, values.length - 1 - i));
        return result;
    }
}

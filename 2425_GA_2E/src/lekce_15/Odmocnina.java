package lekce_15;

public class Odmocnina {
    public static void main(String[] args) throws InterruptedException {
        Long _1 = 9223_372_036_854_775_807L;

        long time = System.currentTimeMillis();
        System.out.println(root2(_1));
        System.out.println("ms: " + (System.currentTimeMillis() - time));

        long time2 = System.currentTimeMillis();
        System.out.println(root2(_1));
        System.out.println("ms: " + (System.currentTimeMillis() - time2));
    }

    private static Long odmocnina(Long i, Long startAt) {
        Long root = startAt;
        while (root * root < i) root++;
        return root;
    }

    private static Long odmocnina(Long i) {
        return odmocnina(i, 0L);
    }

    private static long root2(Long i) {
        Long numOfDigits = (long) i.toString().length();
        Long root = numOfDigits * numOfDigits;
        while (root * root < i) root += numOfDigits;
        while (root * root >= i) root--;
        return ++root;
//        return (long) Math.sqrt(Double.parseDouble(i.toString()));
    }
}

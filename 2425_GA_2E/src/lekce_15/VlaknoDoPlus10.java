package lekce_15;

public class VlaknoDoPlus10 extends Thread {
    String vstup;

    public void run() {
        for (int i = 0; i < vstup.length(); i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(vstup.charAt(i) + " ");
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}

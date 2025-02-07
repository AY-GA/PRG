package lekce_15;

public class Vlakna {
    public void vypisDo10() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }

    public void vypisDo_10() {
        for (int i = -1; i > -10; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Vlakna v = new Vlakna();
        VlaknoDoPlus10 vp10 = new VlaknoDoPlus10();
        vp10.vstup = "Testing..World";
        vp10.start();
        Thread.sleep(10);
        v.vypisDo_10();
    }
}

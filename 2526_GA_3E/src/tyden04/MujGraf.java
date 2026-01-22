package tyden04;

import java.util.ArrayList;

public class MujGraf {
    ArrayList<Vrchol> vrcholy = new ArrayList<Vrchol>();
    ArrayList<Hrana> hrany = new ArrayList<Hrana>();

    public MujGraf() {
    }

    public void vyrobDom() {
        Vrchol vrcholA = new Vrchol("A");
        Vrchol vrcholB = new Vrchol("B");
        vrcholy.add(vrcholA);
        vrcholy.add(vrcholB);
        vrcholy.add(new Vrchol("C"));
        vrcholy.add(new Vrchol("D"));
        vrcholy.add(new Vrchol("E"));

        hrany.add(new Hrana(vrcholA, vrcholB));
        hrany.add(new Hrana(vrcholB, vrcholy.get(2)));
        hrany.add(new Hrana(vrcholy.get(2),vrcholy.get(4)));
        hrany.add(new Hrana(vrcholy.get(4),vrcholy.get(3)));
        hrany.add(new Hrana(vrcholy.get(3),vrcholy.get(1)));
        hrany.add(new Hrana(vrcholy.get(1),vrcholy.get(2)));
        hrany.add(new Hrana(vrcholy.get(2),vrcholy.get(0)));
    }

    public static void main(String[] args) {
        MujGraf g = new MujGraf();
        g.vyrobDom();

        System.out.println("Hrany grafu:");
        for (Hrana h : g.hrany) {
            System.out.println(h);
        }
    }
}

package tyden04;

public class Hrana {
    private Vrchol from;
    private Vrchol to;

    public Hrana(Vrchol od, Vrchol kam) {
        this.from = od;
        this.to = kam;
    }

    public Vrchol getFrom() {
        return from;
    }

    public Vrchol getTo() {
        return to;
    }

    @Override
    public String toString() {
        return from + " -> " + to;
    }
}

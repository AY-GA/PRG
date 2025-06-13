package DU;

import java.io.Serializable;

public class Auto implements Serializable {
    private String spz;
    private int najetoKm;

    public Auto(String spz, int najetoKm) {
        this.spz = spz;
        this.najetoKm = najetoKm;
    }

    public String toString() {
        return spz + ":" + najetoKm;
    }

    public int getKilometry() {
        return najetoKm;
    }
}
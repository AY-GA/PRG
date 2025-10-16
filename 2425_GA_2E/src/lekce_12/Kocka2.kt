package lekce_12

class Kocka2(jmeno: String?) : Zvire(jmeno) {
    private var pocetZivotu = 9

    fun getPocetZivotu(): Int = pocetZivotu

    fun setPocetZivotu(pocetZivotu: Int) {
        if (pocetZivotu == 0) isAlive = false
        else if (pocetZivotu > 0) isAlive = true

        this.pocetZivotu = pocetZivotu
    }
}

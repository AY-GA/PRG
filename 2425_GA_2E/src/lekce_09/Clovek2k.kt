package lekce_09

import java.util.*

class Clovek2k(
    private var krestni: String, private var prijmeni: String
) : Comparable<Any?> {
    override fun toString(): String {
        return "Clovek2{" +
                "krestni='" + krestni + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                '}'
    }

    override fun compareTo(o: Any?): Int {
        val x = o as Clovek2k

        return prijmeni.compareTo(x.prijmeni)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val arr = arrayOf(
                Clovek2k("a", "A"),
                Clovek2k("c", "C"),
                Clovek2k("b", "B"),
                Clovek2k("f", "F"),
                Clovek2k("d", "D"),
                Clovek2k("x", "X"),
            )

            Arrays.sort(arr)

            vypis(arr)
        }

        private fun vypis(arr: Array<Clovek2k>) {
            for (c in arr) println(c)
        }
    }
}
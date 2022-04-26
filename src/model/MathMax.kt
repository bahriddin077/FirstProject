package model

class MathMax {

    fun max(a: Double, b: Double): Double {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun max(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }
}
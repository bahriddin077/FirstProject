package EnamAbsitracInterface

fun main() {

    println(Level.LOW)
    println(Level.MEDIUM)
    println(Level.HIGH)

    var level = Level.values()

    for (element in level) {
        println(element)
    }
}
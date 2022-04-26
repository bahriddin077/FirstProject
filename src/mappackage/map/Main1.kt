package mappackage.map

fun main() {

    var map = HashMap<Int, String>()

    map.put(0, "Toshkent")
    map.put(1, "Moscow")
    map.put(2, "Berlin")
    map.put(3, "Ottava")


    println(map.get(0))

    val set: MutableSet<Int> = map.keys
    for (s in set) {
        println("$s -> " + map.get(s))
    }
    println(map.containsKey(0))
    println(map.containsValue("Ottava"))
    println(map.remove(0))
    println(map)
}
package mappackage.map

fun main() {

    var map = HashMap<Int,String>()
    map.put(0,"Toshkent")
    map.put(1,"Moscow")
    map.put(2,"Andijon")
    map.put(3,"Fargona")

    println(map)

    println(map.get(1))

    val set: MutableSet<Int> = map.keys

    for (s in set) {
        println(s)
    }
    println("=========")

    val values: Collection<String> = map.values
    for (value in values){
        println(value)
    }

}
package mappackage.map

fun main() {
    val map: MutableMap<String, String> = HashMap()
    val map1: MutableMap<String, String> = HashMap()

    map["Uzbekistan"] = "Tashkent"
    map["France"] = "Paris"
    map["England"] = "London"
    map["Italy"] = "Rome"

    map1["Germany"] = "Berlin"
    map1["Spain"] = "Madrid"

    map.putAll(map1)
    map.replace("Germany","Dortmund")
    println(map)
    println(map1)
}
package mappackage.map

fun main() {
    val map: MutableMap<String, String?> = HashMap()

    map["Uzbekistan"] = "Tashkent"
    map["France"] = "Paris"
    map["England"] = "London"
    map["Italy"] = "Rome"

    val a = map["Italy"]
    map.remove("Italy")
    map["Russia"] = a
    println(map)
}
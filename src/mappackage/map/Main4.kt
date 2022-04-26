package mappackage.map

fun main() {
    val map: MutableMap<String, String> = HashMap()

    map["Uzbekistan"] = "Tashkent"
    map["France"] = "Paris"
    map["England"] = "London"
    map["Italy"] = "Rome"

    val set: Set<String> = map.keys
    for (s in set) {
        println(s + "1")
        println(map[s])
    }
    println("==========")
    for (entry in map.entries) {
        if (entry.key == "Italy") {
            entry.setValue("Andijon")
        }
        println(entry.key + " -> " + entry.value)
    }

    println("====")
    println(map)
}
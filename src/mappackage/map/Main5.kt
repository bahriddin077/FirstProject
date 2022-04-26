package mappackage.map

fun main() {
    val aplList: ArrayList<String> = ArrayList()
    aplList.add("MYU")
    aplList.add("Liverpool")
    aplList.add("Chelsea")

    val laligaList: ArrayList<String> = ArrayList()
    laligaList.add("Real")
    laligaList.add("Barsa")

    val map: MutableMap<String, ArrayList<String>> = HashMap()

    map["APL"] = aplList
    map["Laliga"] = laligaList

    val set: Set<String> = map.keys
    for (s in set) {
        println(s)
        val list = map[s]!!
        for (i in list.indices) {
            println(list[i])
        }
        println("========")
    }
}
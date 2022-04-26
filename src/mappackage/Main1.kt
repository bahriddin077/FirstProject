package mappackage

fun main() {

    var list1 = HashSet<String>()
    list1.add("Alisher")
    list1.add("MuhammadAziz")
    list1.add("Ziyodxon")

    println(list1.isEmpty())
    println(list1.contains("MuhammadSodiq"))

    var iterator = list1.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }


}
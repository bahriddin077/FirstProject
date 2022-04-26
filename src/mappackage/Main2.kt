package mappackage

fun main() {

    var list1 = HashSet<String>()

    var list2 = HashSet<String>()

    list1.add("MuhammadAli")
    list1.add("MuhammadSodiq")
    list1.add("Ziyodxon")

    list2.add("Mansur")
    list2.add("Maqsud")

    list1.retainAll(list2)

    println(list1)

}
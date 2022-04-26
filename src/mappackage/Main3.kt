package mappackage

fun main() {

    var list1 = HashSet<String>()

    var list2 = HashSet<String>()

    list1.add("MuhammadAli")
    list1.add("MuhammadSodiq")
    list1.add("Ziyodxon")

    list2.add("Mansur")
    list2.add("Sherzod")

    list1.removeAll(list2)

    println(list1)

    list1.clear()

    println(list1)

    list1.add(list2.toString())

    var any = list1.toArray()
    for (element in any)
        println(element)

    println(list1.containsAll(list2))

    println(list1)
    println(list2)

}
























package package1.main

fun main() {
    var list = ArrayList<String>()

    list.add("Real")
    list.add("Atalanta")
    list.add("Chelsea")
    list.add("MYU")

    var list1 = ArrayList<String>()
    list1.add("Milan")
    list1.add("Barcelona")
    list1.add("Juventus")
    list1.add("PSG")

    list.addAll(list1)
    // listga list1 ni qoshib yubordi

    println(list)
    println(list1)
}
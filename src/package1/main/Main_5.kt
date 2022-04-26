package package1.main

fun main() {

    var list = ArrayList<String>()

    list.add("Real")
    list.add("Atalanta")
    list.add("Chelsea")
    list.add("MYU")

    var list1 = ArrayList<String>()
    list1.add("Milan")
    list1.add("Barca")
    list1.add("Juve")
    list1.add("PSG")

    list.removeAll(list)// removeAll hammasini ochirib yuboradi
    list1.retainAll(list)// retainAll saqlab qoyadi
    println(list)
    println(list1)

}
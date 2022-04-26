package package1.main

fun main() {

    var list = ArrayList<String>()

    list.add("Real")
    list.add("Atalanta")
    list.add("Chelsea")
    list.add("MYU")

    var list1 = ArrayList<String>()
    list1.add("Chelsea")
    list1.add("MYU")

//    println(list.contains("Real"))
    // roslikka tekshirish "list" ni ichida Real bormi bolsa true bolmasa false chiqadi
    println(list.containsAll(list1))
    // roslikka tekshirish 'list1'ni ichidagilar listda ham bormi bolsa true/false

}
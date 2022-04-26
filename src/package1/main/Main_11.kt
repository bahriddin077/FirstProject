package package1.main

fun main() {

    var list = ArrayList<String>()

    list.add("Real")
    list.add("Atalanta")
    list.add("Chelsea")
    list.add("MYU")

    println(list)
    list.sort() // 'sort' Saralash yani alfabit boyicha saralaydi
    println(list)

//    val objects: Array<Any> = list.toArray()
//    for (i in objects.indices) {
//        println(objects[i])
//    }

}
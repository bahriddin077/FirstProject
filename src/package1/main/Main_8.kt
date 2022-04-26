package package1.main

fun main() {

    var list = ArrayList<String>()

    list.add("Real")
    list.add("Atalanta")
    list.add("Chelsea")
    list.add("MYU")

    for (i in list)
        println(i)

    println("=====")

    list.forEach { println(it) }

    println("=====")

    list.forEach(System.out::println)

    println("=====")

    var iterator: MutableIterator<Any> = list.iterator()

    while (iterator.hasNext())
        println(iterator.next())

}
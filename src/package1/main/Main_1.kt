package package1.main

fun main() {

    var arraylist = ArrayList<String>() // list bo'sh

    println("ArrayList Oldingi xolati...")
    arraylist.add("Bahriddin") // listga 1 ta qiymat qoshildi
    arraylist.add("Akbarjon") // listga 2 chi qiymat qoshildi
    for (i in arraylist)
        println(i)
    println()

    arraylist.add(2, "MuhammadAli") // 2 chi indeks qiymat qoshildi
    println("ArrayList Keyingi holati ...")
    for (i in arraylist)
        println(i)


}
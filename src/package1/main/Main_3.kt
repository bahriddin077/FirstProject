package package1.main

fun main() {

    var list = ArrayList<String>()

    list.add("Real")
    list.add("Liverpool")
    list.add("Chelsea")
    list.add("PSG")

    println(list) // barchasini ekranga chiqaradi
    println(list[2]) // faqat 2 chi indeksdagi ekranga chiqaradi
    list.removeAt(3) // 3 chi indeksdagini ochirib yuboradi
    println(list) // va qolgan hamasini ekranga chiqaradi

}
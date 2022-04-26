package package1.main

fun main() {

    var list = ArrayList<String>()

    list.add("Real")// 1- qiymat qoshildi
    list.add("Barca")// 2-qiymat qoshildi
    list.add("Chelsea") // 3-qiymat qoshildi
    list.add("Liverpool") // 4- qiymat qoshildi

    list.removeIf { s -> s == "Barca"}
    // agar list ichidagi qiymatlar orasida Barca bolsa ochirib yubor

    println(list)

}
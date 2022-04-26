package homework

import java.util.*

var scanner = Scanner(System.`in`)
fun main() {

    val priceList = arrayOfNulls<Price>(3)

    for (i in priceList.indices) {
        println("name")
        var name = scanner.next()
        println("shopName")
        var shopName = scanner.next()
        println("homework.Price")
        var price = scanner.nextDouble()

        var priceClass = Price(name, shopName, price)
        priceList[i] = priceClass
    }
    Arrays.sort(priceList, Comparator.comparingDouble{ price -> price?.price!! })

    println(priceList[priceList.size - 1]?.show())

    for (i in priceList.indices){
        priceList[i]?.show()
    }
}


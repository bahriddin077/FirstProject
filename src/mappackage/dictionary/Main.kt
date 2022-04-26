package mappackage.dictionary

import java.awt.SystemColor.text
import java.util.Scanner

fun main() {

    var scan = Scanner(System.`in`)

    var map = HashMap<String,String>()

    map["name"]= "ism"
    map["like"]= "yoqtirmoq"

    val values : Collection<String> = map.values

//    println(values)

    val keys = map.filterValues { it == "yoqtirmoq" }.keys
    println(keys)
    var kes = map.filterValues { it == "ism" }.keys



//
//    for (i in 0..map.size){
//        if (map.values.equals("ism")){
//            println(map.keys.)
//        }
//    }
//
//    fun getValues() {
//        val keys = map.filterValues { it == "your_value" }.keys
//        map.keys.forEach {
//            val rateForAmount = map[it]?.rate_for_amount
//            text.value = rateForAmount.toString()
//            val viewModel
//            viewModel.text.value = rateForAmount.toString()
//        }
//    }
//
//    for (product in snapshot.value) {
//
//        if (product.key.equals("price")) {
//            price = Integer.parseInt(product.value as String)
//        }
//    }

}
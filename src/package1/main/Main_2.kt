package package1.main

fun main() {

    var arraylist = ArrayList<Any>()
    // Any -> o'ziga hohlagan narsasini qabul qiladi Int,String,double,float
    arraylist.add("Aziz")

    arraylist.add(12) // Int
    arraylist.add(true) // Boolean
    arraylist.add('M') // Char
    arraylist.add(11.1) // Double
    for (i in arraylist)
        println(i)


}
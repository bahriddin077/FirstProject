package model

fun main() {

//    var a: Int = 20
//    var b: Double = a.toDouble()
//    var f: Double = 27.0
//    var i: Int = f.toInt()
//
//    println(b)
//    println(i)
//
//    var s: Any = "Salom"
//    println(s)
//
//    var c: String = s as String
//
//    println(c)
//    var max = model.MathMax()
//    var f = "qwerty"
//    var h = max
//    println(f)
//    println(h)

//    val a: Any = 21
//
//    if (a is Int) {
//        println(a)
//    } else if (a is String) {
//        println(a)
//    }


    var outerClass = OuterClass()
    println(outerClass.a)

    val innerClass = outerClass.InnerClass()
    println(innerClass.y)

    println(innerClass.display())

    println(outerClass.getY())
}
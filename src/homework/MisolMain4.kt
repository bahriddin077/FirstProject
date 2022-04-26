package homework

import java.util.Scanner

fun main() {

    var metro1 = Metro()
    metro1.JonashBekati = "Paxtakor"
    metro1.OxirgiBekat = "Bunyodkor"
    metro1.YolVaqti = 2
    metro1.LiniyaRaqami = 5

    var metro2 = Metro()
    metro2.JonashBekati = "Paxtakor"
    metro2.OxirgiBekat = "Bunyodkor"
    metro2.YolVaqti = 4
    metro2.LiniyaRaqami = 4

    var metro3 = Metro()
    metro3.JonashBekati = "Paxtakor"
    metro3.OxirgiBekat = "Bunyodkor"
    metro3.YolVaqti = 3
    metro3.LiniyaRaqami = 3

    var metro4 = Metro()
    metro4.JonashBekati = "Paxtakor"
    metro4.OxirgiBekat = "Bunyodkor"
    metro4.YolVaqti = 5
    metro4.LiniyaRaqami = 2

    var metro5 = Metro()
    metro5.JonashBekati = "Paxtakor"
    metro5.OxirgiBekat = "Bunyodkor"
    metro5.YolVaqti = 1
    metro5.LiniyaRaqami = 1

    val vaqt = arrayOf(metro1.YolVaqti, metro2.YolVaqti, metro3.YolVaqti, metro4.YolVaqti, metro5.YolVaqti)
//    var line = arrayOf("metro1 = ${metro1.LiniyaRaqami} metro2 = ${metro2.LiniyaRaqami} metro3 = ${metro3.LiniyaRaqami} metro4 = ${metro4.LiniyaRaqami} metro5 = ${metro5.LiniyaRaqami}")
//    line.sort()
    var scanner = Scanner(System.`in`)
    println("Yolda yurish vaqti: ")
    var a = scanner.nextInt()
    var k = 0

    for (i in vaqt){
        if (a > i!!){
            k++
            println("metro $k liniyada")
            println("Yo'l vaqti = $i soat")
        }else{
        }
    }
}
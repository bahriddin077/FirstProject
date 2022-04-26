package homework

import java.util.Scanner

fun main() {

    var worker = Worker()
    var scanner = Scanner(System.`in`)
    worker.surname = "Aliyev"
    worker.name = "SHodil"
    println("Ishchi yoshi: ")
    var age = scanner.nextInt()
    worker.job = "Menejer"
    worker.year = 2019

    if (age > 25){
        worker.show()
        println(worker)
    } else{
        println("Xatolik!!!")
    }

}